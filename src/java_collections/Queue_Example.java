package java_collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Example {
    public static void main(String[] args) {
        /*The PriorityQueue class provides the facility of using queue. But it does not order the elements in FIFO manner.
        It inherits AbstractQueue class.*/
        Queue<String> names = new PriorityQueue<>();

        //use add() to add elements to the queue
        names.add("Gordon Freeman");
        names.add("Carl Johnson");
        names.add("Adam Jensen");

        //use poll() to remove the head of the queue
        names.poll();//This will remove "Gordon Freeman" in this example

        //use peek to return the head of the queue
        System.out.println(names.peek());//Returns "Carl Johnson" as the o/p
    }
}
/*
The elements in PriorityQueue must be of Comparable type. String and Wrapper classes are Comparable by default.
To add user-defined objects in PriorityQueue, we need to implement Comparable interface.
 */