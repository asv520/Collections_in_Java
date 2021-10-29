package java_collections;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List_Example {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        //use add() to add to arraylist
        numbers.add(1.6);
        numbers.add(2.5);
        numbers.add(3.4);
        numbers.add(5.2);

        //To access an element in the ArrayList, use the get() method and refer to the index number
        double element = numbers.get(3);
        System.out.println(element);//This will return 5.2

        //To modify an element, use the set() method and refer to the index number
        numbers.set(2, 4.3);//This will set 4.3 in place of 3.4 at index 2

        //To remove an element, use the remove() method and refer to the index number
        numbers.remove(0);//This will remove 1.6 which is at index 0

        //To get the size of the arraylist, use size()
        int sizeOfArraylist = numbers.size();
        System.out.println(sizeOfArraylist);//This will print the size of the arraylist

        //for-each can be used to iterate through the elements in the arraylist
        for(double d : numbers){
            System.out.println(d);
        }

        //Another useful class in the java.util package is the Collections class, which include the sort() method for sorting lists alphabetically or numerically
        Collections.sort(numbers);

        //To remove all the elements in the ArrayList, use the clear() method
        numbers.clear();//This will clear all the elements in the arraylist
    }
}
