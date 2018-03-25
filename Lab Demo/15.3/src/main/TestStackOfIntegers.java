package main;

import model.StackOfIntegers;

public class TestStackOfIntegers {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers(); // create a stack
        System.out.println(stack.getSize()); // get capacity of stack
        for (int i = 0; i < 10; i++)
            stack.push(i); //push to stack
        while (!stack.empty())
            System.out.print(stack.pop() + " "); //pop from stack
    }
}




