package com.infoshare;

/**
 * Hello world!
 *
 */
public class App1
{
    public static void main( String[] args )
    {
        Circle1 c = new Circle1(0,0,10);
        System.out.println("pole koła wynosi=" + c.area);

        c.radius=6;
        System.out.println("pole koła wynosi=" + c.area);

    }
}
