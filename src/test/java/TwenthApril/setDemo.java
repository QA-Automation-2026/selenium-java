package TwenthApril;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setDemo {

    // Variables - 100  -   100     -   60
    // data types   -   60  -   80      -   60
    // conditional statements   -   80  - 75( if conditions, terinary operator)     -   70
    // for loop -   80  -   80  -   80
    // while loop - sireesha gaaru pending  -   80  -   70  -   0
    // do while loop    -   80  -   70  -   0
    // for each loop    -   100 need to repeat
    // iterator pending  -
    // switch - 80 - 70 - 70
    // methods - 8 types - need to repeat
    // Polymorphisam - 100 need to repeat
    // inheritance - 100 need to repeat
    // abstration - 100 need to repeat
    // interface - 100 need to repeat
    // list - 100 need to repeat
    // strings - 100 need to repeat
    // arrays // pending - 100 need to repeat
    // set - pending    - 100 need to repeat
    // map - pending    -   100 need to repeat
    // lamda functions = very important

    public static void main(String[] args) {

        // Unique values
        // doesn't maintain insertion order
        // add, addAll, remove, contains, empty,size, removeAll

        Set<Object> obj = new HashSet<>();
        obj.add(1);
        obj.add("Sireesha");
        obj.add(10.5f);
        System.out.println(obj.size());

        Set<Object> obj1 = new HashSet<>();
        obj1.add("Siri");
        obj1.add("Anil");
        obj1.add("Playwright");

        System.out.println(obj1.size());

        // adding second set values to first set
        obj.addAll(obj1);

        // adding first set values to second set
        obj1.addAll(obj);

        System.out.println("After adding "+obj.size());

        System.out.println(obj);

//        for(Object s : obj){
//            System.out.println("Print vaulues using for each loop "+ s);
//        }

        Iterator i = obj.iterator();

        /*
        *
        * while(true){
        *
        * }
        *
        * */

        while(i.hasNext()){
            Object value = i.next();
            System.out.println(value);
        }
    }
}
