package com.company;

public class Rose extends Flowers{

    @Override
    public void setName(String Rose) {
        super.setName(Rose);
    }

    public Rose(String name, int pieces, String color ) {
        super(name, pieces, color );
    }

    @Override
    public void setPieces(int pieces) {
        super.setPieces (101);
    }

    @Override
    public void setColor(String color) {
        super.setColor("Red");
    }
}