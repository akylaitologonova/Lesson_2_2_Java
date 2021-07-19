package com.company;

public class Main {

    public static void main(String[] args) {

        Printable[] print = {createObject("Rose"), createObject("Peonies"), createObject("Hydrangea")};

        for (Printable printable:print) {
            printable.print();
        }
    }

    public static Flowers createObject(String className) {

        switch (className) {
            case "Hydrangea":
                Hydrangea hydrangea = new Hydrangea("Hydrangea", 37, "Purple");
                return hydrangea;
            case "Rose":
                Rose rose = new Rose("Rose", 101, "Red");
                return rose;
            case "Peonies":
                Peonies peonies = new Peonies("Peonies", 55, "Pink");
                return peonies;
        }
        return null;
    }
}




