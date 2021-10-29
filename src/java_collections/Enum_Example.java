package java_collections;

public class Enum_Example {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args) {
        //Loop through enum
        for (Level l : Level.values()) {
            System.out.println(l);
        }

        //To access enum constants, use the dot syntax:
        /*
        Level myVar = Level.MEDIUM;
        System.out.println(myVar); //This will print 'MEDIUM'
        */
    }
}

//Use enums when you have values that you know aren't going to change, like month days, colors, deck of cards, etc.