package net.anware.tmc.colourscroller;

public interface ColouredItem {

    boolean coloured();

    void setColoured(boolean coloured);

    int getListIndex();

    void setListIndex(int index);

    int getIndex();

    void setIndex(int index);
}