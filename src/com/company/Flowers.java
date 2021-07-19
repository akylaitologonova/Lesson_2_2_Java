package com.company;

public class Flowers implements Printable{
    public String name;
    public int pieces;
    public String color;



    public Flowers(String name,int pieces, String color ) {

        this.name = name;
        this.pieces = pieces;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }


    public void setColor(String color) {
        this.color = color;
    }



    @Override
    public void print() {
        System.out.println(name + " "+ pieces + " " + color + " ");
    }
}