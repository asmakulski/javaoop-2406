
package com.infoshare;

public class Square {

    private Point leftDown;
    private int a;

    public Square(int x, int y, int a) {
        this.a = a;
        this.leftDown = new Point(x,y);
    }


}
