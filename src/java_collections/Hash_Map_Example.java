package java_collections;

import java.util.HashMap;

public class Hash_Map_Example {
    public static void main(String[] args) {
        HashMap<String, Integer> name_and_id = new HashMap<>();
        //Use put() to add to hashmap
        name_and_id.put("Niko Bellic",7);
        name_and_id.put("Gordon Freeman",5);
        name_and_id.put("Adam Jensen",9);

        //others methods are similar to those in the arraylist
        //Collections.sort() can't be used in hash map

        /*
        Loop through the items of a HashMap with a for-each loop.

        Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values
         */
//        for (String s : name_and_id.keySet()) {
//            System.out.print(s + " ");//prints the keys
//        }
//
//        for (int i : name_and_id.values()) {
//            System.out.print(i + " ");//prints the values
//        }

        for(String s : name_and_id.keySet()) {
            System.out.println(s+" "+name_and_id.get(s));//prints key and their respective values
        }
    }
}
