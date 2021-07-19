package com.company;

public class Hydrangea extends Flowers {

    @Override
    public void setName(String Hydrangea) {
        super.setName(Hydrangea);
    }

    public Hydrangea (String name, int pieces, String color) {
        super(name, pieces, color);
    }

    @Override
    public void setPieces(int pieces) {
        super.setPieces(37);
    }

    @Override
    public void setColor(String color) {
        super.setColor("Purple");
    }
}
