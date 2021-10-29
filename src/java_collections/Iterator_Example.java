package java_collections;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Objects;

public class Iterator_Example {
    public static void main(String[] args) {
        ArrayList<String> videogames = new ArrayList<>();
        videogames.add("Grand Theft Auto");
        videogames.add("Dues Ex");
        videogames.add("Half Life");
        videogames.add("Splinter Cell");
        videogames.add("Max Payne");

        // Get the iterator
        Iterator<String> it = videogames.iterator();

        // Print the first item
        System.out.println(it.next());

        //Loop through the iterator
        /*
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //Iterator can be used to remove items from collections
        while(it.hasNext()) {
            String s = it.next();
            if(Objects.equals(s, "Hunt Down the Freeman")) {
                it.remove();
            }
        }
         */
    }
}

/*
Note: Trying to remove items using a for loop or a for-each loop would not work correctly because the collection is
changing size at the same time when the code is trying to loop.
 */