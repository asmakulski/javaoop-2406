package com.infoshare;

public class Circle {

    public int x;
    public int y;
    public int radius;
    public double area;

    public Circle(int x, int y, int r) {

        this.x=x;
        this.y=y;
        this.radius=r;
        area = Math.PI * radius * radius;
    }


    //todo:
    // 1. co jest źle w tej klasie? (jeśli jeszcze się nie domyślasz się zerknij do klasy App, przeanalizuj kod i odpal metodę main)
    // 2. napraw implementację, tak aby kierować się dobrymi praktykami OOP
    //    w razie potrzeby zmodyfikuj wywołania w klasie App, na koniec odpal program.
}
