package April11;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class listDetail {

/*
Dynamic memory allocation
* List is an interface
* List interface can be implemented by using classes like arraylist, linkedlist
* Ordered Collection - maintain insertion order
* Duplicates Allowed
* Allows multiple null values
*List<wrapper class> objectName = new(Keyword) implementedClass(Arrayilist or linked list)
* */
    @Test
    public void listDemo(){
        Runtime rt = Runtime.getRuntime();
        rt.gc();
        long m = rt.totalMemory()-rt.freeMemory();
        System.out.println("Before Memory "+ m);
        List<String> listDemo = new ArrayList<>();

        // to add data to the list use add method
        listDemo.add("Apple"); //0
        listDemo.add("Banana");//1
        listDemo.add("Red");//2
        listDemo.add("Hyderabad");//3

        // add(int index, E element) - to add data based on specific index
        listDemo.add(1,"playwright");
        listDemo.add(2,"USA");
        listDemo.add(3,"UK");
        listDemo.add(4,"Pineapple");

        // 8 values = 7
        // 10 values = 9
        // 15 values = 14
        for(int i =0;i<listDemo.size();i++){
            System.out.println(listDemo.get(i));
        }

        // Apple //0
        // playwright //1
        // USA //2
        //UK //3
        // Banana
        // Red
        // Hyderabad

        // get(int index) - to get values based on index
        System.out.println("Added by Dixit "+listDemo.get(3));
        System.out.println("Added by anil "+listDemo.get(1));
        System.out.println("Added by sireesha "+listDemo.get(2));
//
//        for(int i =5;i>=26;i--){
//            System.out.println("3 * " +i +"="+ (3*i));
//        }



        // first taking input from initialisation that is int i = 5

        // loops works internally as below
        // check the condition that is i>=1,
        // if condition is true, then travel to inside the for loop
        // then it increments or decrements the value based on statement that is i-- or i++
        // again checks the condition, that i>=1 = 4
        //if condition is true, then travel to inside the for loop
        // then it increments or decrements the value based on statement that is i-- or i++
        // checks the condition,
        // if false then came out from loop





    }
}
