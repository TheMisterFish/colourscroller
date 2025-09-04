package net.anware.tmc.colourscroller.mixin.tag;

import net.anware.tmc.colourscroller.ColourLib;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Items.class)
public abstract class MixinItems {
    @Shadow
    private static Item register(Identifier id, Item item) {
        return null;
    }

    @Inject(method = "register(Lnet/minecraft/block/Block;Lnet/minecraft/item/Item;)Lnet/minecraft/item/Item;", at = @At("HEAD"), cancellable = true)
    private static void registerRepl(Block block, Item item, CallbackInfoReturnable<Item> cir) {
        cir.setReturnValue(regColour(block, item));
    }

    @Unique
    private static Item regColour(Block block, Item item) {
        Identifier id = Registry.BLOCK.getId(block);
        ColourLib.findIndex(item, id.getPath());
        return register(id, item);
    }
}