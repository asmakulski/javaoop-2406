package com.infoshare;

public class Rectangle {

    private Point leftDownPoint;

    private int a;
    private int b;

    public Rectangle(int x, int y, int a, int b ) {
        this.a = a;
        this.b = b;
        this.leftDownPoint = new Point(x, y);
    }


}
