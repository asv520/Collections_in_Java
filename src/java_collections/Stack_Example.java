package java_collections;

import java.util.Stack;

public class Stack_Example {
    public static void main(String[] args) {
        Stack<Float> numbers = new Stack<>();
        //use push() to add items in the stack
        numbers.push(1.0f);
        numbers.push(2.0f);
        numbers.push(3.0f);

        //use peek() to look at the top element in the stack
        float result = numbers.peek();
        System.out.println(result);//prints 3.0

        //use pop() to remove the last element from the stack
        numbers.pop();//removes 3.0

        //use empty() to check if the stack is empty or not
        boolean isEmpty = numbers.empty();
        System.out.println(isEmpty);//This will print 'false'

        //use search(Object o) to get the position of an element in the stack
        int position = numbers.search(1.0f);
        System.out.println(position);//This will print '2'

        //Other methods are similar to other collection types

        //IMPORTANT : Indexing starts from the last(top) element in a stack
    }
}
