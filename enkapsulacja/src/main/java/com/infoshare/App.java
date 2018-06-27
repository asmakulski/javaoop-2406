package com.infoshare;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Circle c = new Circle(0,0,10);
        System.out.println("pole koła wynosi=" + c.area);

        c.radius=6;
        System.out.println("pole koła wynosi=" + c.area);

    }
}
