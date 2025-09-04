package net.anware.tmc.colourscroller;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/*Colour Library Version 0.2*/

public class ColourLib {
    public static final List<List<Supplier<Item>>> COLOURED_SET = new ArrayList<>(){{
        add(new ArrayList<>() {{
            add(() -> Items.WHITE_WOOL);
            add(() -> Items.LIGHT_GRAY_WOOL);
            add(() -> Items.GRAY_WOOL);
            add(() -> Items.BLACK_WOOL);
            add(() -> Items.RED_WOOL);
            add(() -> Items.BROWN_WOOL);
            add(() -> Items.ORANGE_WOOL);
            add(() -> Items.YELLOW_WOOL);
            add(() -> Items.LIME_WOOL);
            add(() -> Items.GREEN_WOOL);
            add(() -> Items.CYAN_WOOL);
            add(() -> Items.LIGHT_BLUE_WOOL);
            add(() -> Items.BLUE_WOOL);
            add(() -> Items.PINK_WOOL);
            add(() -> Items.MAGENTA_WOOL);
            add(() -> Items.PURPLE_WOOL);
        }});
        add(new ArrayList<>() {{
            add(() -> Items.WHITE_CONCRETE);
            add(() -> Items.LIGHT_GRAY_CONCRETE);
            add(() -> Items.GRAY_CONCRETE);
            add(() -> Items.BLACK_CONCRETE);
            add(() -> Items.RED_CONCRETE);
            add(() -> Items.BROWN_CONCRETE);
            add(() -> Items.ORANGE_CONCRETE);
            add(() -> Items.YELLOW_CONCRETE);
            add(() -> Items.LIME_CONCRETE);
            add(() -> Items.GREEN_CONCRETE);
            add(() -> Items.CYAN_CONCRETE);
            add(() -> Items.LIGHT_BLUE_CONCRETE);
            add(() -> Items.BLUE_CONCRETE);
            add(() -> Items.PINK_CONCRETE);
            add(() -> Items.MAGENTA_CONCRETE);
            add(() -> Items.PURPLE_CONCRETE);
        }});
        add(new ArrayList<>() {{
            add(() -> Items.WHITE_CONCRETE_POWDER);
            add(() -> Items.LIGHT_GRAY_CONCRETE_POWDER);
            add(() -> Items.GRAY_CONCRETE_POWDER);
            add(() -> Items.BLACK_CONCRETE_POWDER);
            add(() -> Items.RED_CONCRETE_POWDER);
            add(() -> Items.BROWN_CONCRETE_POWDER);
            add(() -> Items.ORANGE_CONCRETE_POWDER);
            add(() -> Items.YELLOW_CONCRETE_POWDER);
            add(() -> Items.LIME_CONCRETE_POWDER);
            add(() -> Items.GREEN_CONCRETE_POWDER);
            add(() -> Items.CYAN_CONCRETE_POWDER);
            add(() -> Items.LIGHT_BLUE_CONCRETE_POWDER);
            add(() -> Items.BLUE_CONCRETE_POWDER);
            add(() -> Items.PINK_CONCRETE_POWDER);
            add(() -> Items.MAGENTA_CONCRETE_POWDER);
            add(() -> Items.PURPLE_CONCRETE_POWDER);
        }});
        add(new ArrayList<>() {{
            add(() -> Items.WHITE_TERRACOTTA);
            add(() -> Items.LIGHT_GRAY_TERRACOTTA);
            add(() -> Items.GRAY_TERRACOTTA);
            add(() -> Items.BLACK_TERRACOTTA);
            add(() -> Items.RED_TERRACOTTA);
            add(() -> Items.BROWN_TERRACOTTA);
            add(() -> Items.ORANGE_TERRACOTTA);
            add(() -> Items.YELLOW_TERRACOTTA);
            add(() -> Items.LIME_TERRACOTTA);
            add(() -> Items.GREEN_TERRACOTTA);
            add(() -> Items.CYAN_TERRACOTTA);
            add(() -> Items.LIGHT_BLUE_TERRACOTTA);
            add(() -> Items.BLUE_TERRACOTTA);
            add(() -> Items.PINK_TERRACOTTA);
            add(() -> Items.MAGENTA_TERRACOTTA);
            add(() -> Items.PURPLE_TERRACOTTA);
        }});
        add(new ArrayList<>() {{
            add(() -> Items.WHITE_GLAZED_TERRACOTTA);
            add(() -> Items.LIGHT_GRAY_GLAZED_TERRACOTTA);
            add(() -> Items.GRAY_GLAZED_TERRACOTTA);
            add(() -> Items.BLACK_GLAZED_TERRACOTTA);
            add(() -> Items.RED_GLAZED_TERRACOTTA);
            add(() -> Items.BROWN_GLAZED_TERRACOTTA);
            add(() -> Items.ORANGE_GLAZED_TERRACOTTA);
            add(() -> Items.YELLOW_GLAZED_TERRACOTTA);
            add(() -> Items.LIME_GLAZED_TERRACOTTA);
            add(() -> Items.GREEN_GLAZED_TERRACOTTA);
            add(() -> Items.CYAN_GLAZED_TERRACOTTA);
            add(() -> Items.LIGHT_BLUE_GLAZED_TERRACOTTA);
            add(() -> Items.BLUE_GLAZED_TERRACOTTA);
            add(() -> Items.PINK_GLAZED_TERRACOTTA);
            add(() -> Items.MAGENTA_GLAZED_TERRACOTTA);
            add(() -> Items.PURPLE_GLAZED_TERRACOTTA);
        }});
           add(new ArrayList<>() {{
            add(() -> Items.WHITE_STAINED_GLASS);
            add(() -> Items.LIGHT_GRAY_STAINED_GLASS);
            add(() -> Items.GRAY_STAINED_GLASS);
            add(() -> Items.BLACK_STAINED_GLASS);
            add(() -> Items.RED_STAINED_GLASS);
            add(() -> Items.BROWN_STAINED_GLASS);
            add(() -> Items.ORANGE_STAINED_GLASS);
            add(() -> Items.YELLOW_STAINED_GLASS);
            add(() -> Items.LIME_STAINED_GLASS);
            add(() -> Items.GREEN_STAINED_GLASS);
            add(() -> Items.CYAN_STAINED_GLASS);
            add(() -> Items.LIGHT_BLUE_STAINED_GLASS);
            add(() -> Items.BLUE_STAINED_GLASS);
            add(() -> Items.PINK_STAINED_GLASS);
            add(() -> Items.MAGENTA_STAINED_GLASS);
            add(() -> Items.PURPLE_STAINED_GLASS);
        }});
           add(new ArrayList<>() {{
            add(() -> Items.WHITE_STAINED_GLASS_PANE);
            add(() -> Items.LIGHT_GRAY_STAINED_GLASS_PANE);
            add(() -> Items.GRAY_STAINED_GLASS_PANE);
            add(() -> Items.BLACK_STAINED_GLASS_PANE);
            add(() -> Items.RED_STAINED_GLASS_PANE);
            add(() -> Items.BROWN_STAINED_GLASS_PANE);
            add(() -> Items.ORANGE_STAINED_GLASS_PANE);
            add(() -> Items.YELLOW_STAINED_GLASS_PANE);
            add(() -> Items.LIME_STAINED_GLASS_PANE);
            add(() -> Items.GREEN_STAINED_GLASS_PANE);
            add(() -> Items.CYAN_STAINED_GLASS_PANE);
            add(() -> Items.LIGHT_BLUE_STAINED_GLASS_PANE);
            add(() -> Items.BLUE_STAINED_GLASS_PANE);
            add(() -> Items.PINK_STAINED_GLASS_PANE);
            add(() -> Items.MAGENTA_STAINED_GLASS_PANE);
            add(() -> Items.PURPLE_STAINED_GLASS_PANE);
        }});
    }};
    public static final List<List<String>> COLOURED_SET_ID = new ArrayList<>(){{
        add(new ArrayList<>() {{
            add("white_wool");
            add("light_gray_wool");
            add("gray_wool");
            add("black_wool");
            add("red_wool");
            add("brown_wool");
            add("orange_wool");
            add("yellow_wool");
            add("lime_wool");
            add("green_wool");
            add("cyan_wool");
            add("light_blue_wool");
            add("blue_wool");
            add("pink_wool");
            add("magenta_wool");
            add("purple_wool");
        }});
        add(new ArrayList<>() {{
            add("white_concrete");
            add("light_gray_concrete");
            add("gray_concrete");
            add("black_concrete");
            add("red_concrete");
            add("brown_concrete");
            add("orange_concrete");
            add("yellow_concrete");
            add("lime_concrete");
            add("green_concrete");
            add("cyan_concrete");
            add("light_blue_concrete");
            add("blue_concrete");
            add("pink_concrete");
            add("magenta_concrete");
            add("purple_concrete");
        }});
        add(new ArrayList<>() {{
            add("white_concrete_powder");
            add("light_gray_concrete_powder");
            add("gray_concrete_powder");
            add("black_concrete_powder");
            add("red_concrete_powder");
            add("brown_concrete_powder");
            add("orange_concrete_powder");
            add("yellow_concrete_powder");
            add("lime_concrete_powder");
            add("green_concrete_powder");
            add("cyan_concrete_powder");
            add("light_blue_concrete_powder");
            add("blue_concrete_powder");
            add("pink_concrete_powder");
            add("magenta_concrete_powder");
            add("purple_concrete_powder");
        }});
        add(new ArrayList<>() {{
            add("white_terracotta");
            add("light_gray_terracotta");
            add("gray_terracotta");
            add("black_terracotta");
            add("red_terracotta");
            add("brown_terracotta");
            add("orange_terracotta");
            add("yellow_terracotta");
            add("lime_terracotta");
            add("green_terracotta");
            add("cyan_terracotta");
            add("light_blue_terracotta");
            add("blue_terracotta");
            add("pink_terracotta");
            add("magenta_terracotta");
            add("purple_terracotta");
        }});
        add(new ArrayList<>() {{
            add("white_glazed_terracotta");
            add("light_gray_glazed_terracotta");
            add("gray_glazed_terracotta");
            add("black_glazed_terracotta");
            add("red_glazed_terracotta");
            add("brown_glazed_terracotta");
            add("orange_glazed_terracotta");
            add("yellow_glazed_terracotta");
            add("lime_glazed_terracotta");
            add("green_glazed_terracotta");
            add("cyan_glazed_terracotta");
            add("light_blue_glazed_terracotta");
            add("blue_glazed_terracotta");
            add("pink_glazed_terracotta");
            add("magenta_glazed_terracotta");
            add("purple_glazed_terracotta");
        }});
          add(new ArrayList<>() {{
            add("white_stained_glass");
            add("light_gray_stained_glass");
            add("gray_stained_glass");
            add("black_stained_glass");
            add("red_stained_glass");
            add("brown_stained_glass");
            add("orange_stained_glass");
            add("yellow_stained_glass");
            add("lime_stained_glass");
            add("green_stained_glass");
            add("cyan_stained_glass");
            add("light_blue_stained_glass");
            add("blue_stained_glass");
            add("pink_stained_glass");
            add("magenta_stained_glass");
            add("purple_stained_glass");
        }});
          add(new ArrayList<>() {{
            add("white_stained_glass_pane");
            add("light_gray_stained_glass_pane");
            add("gray_stained_glass_pane");
            add("black_stained_glass_pane");
            add("red_stained_glass_pane");
            add("brown_stained_glass_pane");
            add("orange_stained_glass_pane");
            add("yellow_stained_glass_pane");
            add("lime_stained_glass_pane");
            add("green_stained_glass_pane");
            add("cyan_stained_glass_pane");
            add("light_blue_stained_glass_pane");
            add("blue_stained_glass_pane");
            add("pink_stained_glass_pane");
            add("magenta_stained_glass_pane");
            add("purple_stained_glass_pane");
        }});
    }};

    public static int getIndex(int size, int index) {
        int pos = index % size;
        if (pos < 0) pos += size;
        return pos;
    }

    public static ItemStack createStack(Item item, ItemStack stack) {
        ItemStack newStack = new ItemStack(item, stack.getCount());
        if (stack.hasNbt()) newStack.setNbt(stack.getNbt().copy());
        return newStack;
    }

    public static boolean findIndex(Item item, String id) {
        for (int listIndex = 0; listIndex < ColourLib.COLOURED_SET_ID.size(); listIndex++) {
            List<String> list = ColourLib.COLOURED_SET_ID.get(listIndex);
            for (int index = 0; index < list.size(); index++) if (list.get(index).equals(id)) {
                ColouredItem citem = ((ColouredItem) item);
                citem.setColoured(true);
                citem.setListIndex(listIndex);
                citem.setIndex(index);
                return true;
            }
        }
        return false;
    }

    public static ColouredItem toIndex(ItemStack stack) {
        if (stack == null) return null;
        ColouredItem item = (ColouredItem) stack.getItem();
        if (!item.coloured()) return null;
        return item;
    }

    public static ItemStack getShifted(ItemStack stack, int index) {
        ColouredItem item = toIndex(stack);
        if (item == null) return ItemStack.EMPTY;
        List<Supplier<Item>> list = COLOURED_SET.get(item.getListIndex());
        return createStack(list.get(getIndex(list.size(), item.getIndex() + index)).get(), stack);
    }

    public static ItemStack getIndexed(ItemStack stack, int index) {
        ColouredItem item = toIndex(stack);
        if (item == null) return ItemStack.EMPTY;
        List<Supplier<Item>> list = COLOURED_SET.get(item.getListIndex());
        return createStack(list.get(getIndex(list.size(), index)).get(), stack);
    }
}