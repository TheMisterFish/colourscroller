package net.anware.tmc.colourscroller.mixin;

import net.anware.tmc.colourscroller.ColourLib;
import net.anware.tmc.colourscroller.ColouredItem;
import net.anware.tmc.colourscroller.Settings;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.c2s.play.CreativeInventoryActionC2SPacket;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerInventory.class)
public abstract class MixinPlayerInventory {
    @Shadow @Final public PlayerEntity player;
    @Shadow public int selectedSlot;

    @Inject(method = "scrollInHotbar", at = @At("HEAD"), cancellable = true)
    private void scrollInHotbarRepl(double amount, CallbackInfo ci) {
        if (this.scrollColours(amount)) ci.cancel();
    }

    @Unique
    private boolean scrollColours(double amount) {
        if (!this.player.isCreative()) return false;
        if (!(this.player instanceof ClientPlayerEntity)) return false;
        if (!Settings.KEY_BASE.isPressed()) return false;
        int shift = -(int) Math.signum(amount);
        if (Settings.KEY_SCROLL_SINGLE.isPressed()) {
            ItemStack stack = ColourLib.getShifted(this.getSelected(), shift);
            if (stack.isEmpty()) return false;
            setHotbar(this.selectedSlot, stack);
            return true;
        } else if (Settings.KEY_SCROLL_ROW.isPressed()) {
            ColouredItem item = ColourLib.toIndex(this.getSelected());
            if (item == null) return false;
            int index = item.getIndex() + shift;
            for (int slot = 0; slot < 9; slot++) {
                ItemStack stack = ColourLib.getIndexed(this.getHotbar(slot), index);
                if (stack.isEmpty()) continue;
                this.setHotbar(slot, stack);
            }
            return true;
        } else return false;
    }

    @Unique ItemStack getHotbar(int index) {
        if (index < 0 || index >=9) return ItemStack.EMPTY;
        return this.player.getInventory().main.get(index);
    }

    @Unique
    private ItemStack getSelected() {
        return this.player.getInventory().main.get(this.selectedSlot);
    }

    @Unique
    private void setHotbar(int index, ItemStack stack) {
        this.player.getInventory().main.set(index, stack);
        MinecraftClient.getInstance().getNetworkHandler().sendPacket(new CreativeInventoryActionC2SPacket(index + 36, stack));
    }
}