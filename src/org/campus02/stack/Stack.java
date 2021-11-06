package org.campus02.stack;

public class Stack
{
    private int[] array;
    private int counter;

    public Stack(int[] array)
    {
        this.array = array;
        counter = 0;
    }

    public void push(int value)
    {
        if(counter < array.length)
        {
            array[counter] = value;
            counter++;
        }
        else System.out.println("Stack is full");
    }

    public int pop()
    {
        if(counter > 0)
        {
            counter--;
            return array[counter];
        }
        else return -1;
    }
}
