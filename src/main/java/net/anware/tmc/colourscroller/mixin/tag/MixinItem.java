package net.anware.tmc.colourscroller.mixin.tag;

import net.anware.tmc.colourscroller.ColouredItem;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(Item.class)
public abstract class MixinItem implements ColouredItem {
    @Unique
    private int listIndex, index;
    @Unique
    private boolean coloured = false;

    @Override
    public boolean coloured() {
        return this.coloured;
    }

    @Override
    public void setColoured(boolean coloured) {
        this.coloured = coloured;
    }

    @Override
    public int getListIndex() {
        return this.listIndex;
    }

    @Override
    public void setListIndex(int index) {
        this.listIndex = index;
    }

    @Override
    public int getIndex() {
        return this.index;
    }

    @Override
    public void setIndex(int index) {
        this.index = index;
    }
}