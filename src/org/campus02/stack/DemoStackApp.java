package org.campus02.stack;

public class DemoStackApp
{
    public static void main(String[] args)
    {
        Stack stapel = new Stack(new int [7]);

        stapel.push(7);
        stapel.push(6);
        stapel.push(5);

        System.out.println(stapel.pop());
        System.out.println(stapel.pop());

        stapel.push(3);
        System.out.println(stapel.pop());
        System.out.println(stapel.pop());
        System.out.println(stapel.pop());
    }
}
