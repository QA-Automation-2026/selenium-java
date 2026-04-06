package SixthApril;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class listClassDemo {

    @Test
    public void listDemo(){
        List<Integer> demo = new ArrayList<>();
        // List is an interface , it is implemented by using classes like Arryaylist, Linkedlist,vector, stack
        // List allows duplicates
        // Maintains Insertion Order
        //Allow Null Values
        // Dynamic Size
        // it allows sorting
        // values is accessed by using index
        demo.add(1); //2
        demo.add(5); //3
        demo.add(0,15); //1
        demo.add(25); //4
        demo.add(30); //5
        demo.add(0,75);

        //75, 15,1,5,25,30
        //  -5,1,5,25,30


        System.out.println(demo.size());

        System.out.println(demo.get(demo.size()-1));
        //15,1,5,25,30 = 5
        // 0,1,2,3,4

        demo.set(1,-5);
        System.out.println("Set values "+ demo.get(1));

        System.out.println(demo.isEmpty());

        System.out.println(demo.size());
        demo.remove(0);
        System.out.println("Print values");
        demo.add(null);


        for(int obj : demo){
            System.out.print(obj+"  ");
        }

    }
}
