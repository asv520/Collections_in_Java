package java_collections;

import java.util.HashSet;

public class Hash_Set_Example {
    public static void main(String[] args) {
        HashSet<Integer> unique_numbers = new HashSet<>();
        //HashSet is similar to ArrayList, with the only difference being that the values can't be repeated
        unique_numbers.add(2);
        unique_numbers.add(5);
        unique_numbers.add(9);
//        unique_numbers.add(5);
        //Above, we add different values everytime, but there is an error in line 4 if we try to add 5 again

        //use contains() to find if the element is present in the hashset
        boolean isNumberPresent = unique_numbers.contains(2);
        System.out.println(isNumberPresent);//returns 'true' as the number is present in the hashset
    }
}
