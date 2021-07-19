package com.company;

public class Peonies extends Flowers{

    @Override
    public void setName(String Peonies) {
        super.setName(Peonies);
    }

    public Peonies(String name, int pieces, String color) {
        super(name, pieces, color);
    }

    @Override
    public void setPieces(int pieces) {
        super.setPieces(55);
    }

    @Override
    public void setColor(String color) {
        super.setColor("Pink");
    }
}