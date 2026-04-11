package SixthApril;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

    @Test
    public void ListClass() {
        List<String> demo = new ArrayList<>();//// Creating List class object, list is interface and string is values and demois variable,Arraylist is class
        demo.add("volvo");//Adding For at 1st indexes(0)
        demo.add("BMW");//2
        demo.add("Honda");//3
        demo.add("Toyota");//4
        demo.add("Ford");//5
        demo.add("Tesla");//6
        System.out.println(demo.add("Audi")); //this returns true value
        System.out.println(demo.size());//total 7

        System.out.println(demo.get(demo.size() - 1));//size 7,size-1=6 (last element = "Audi", prints Audi)
        demo.get(6);
        //System.out.println("print all elements");
        for (String obj : demo)
            System.out.println(obj+"");
        {
            demo.set(0, "Audi");//0 is first position and Audi is new value....volvo is replaced with Audi
           System.out.println("set values"+demo.get(3));//set values toyoto
            System.out.println(demo.isEmpty());//checking list is empty "false"
            demo.remove(5);
            //System.out.println(demo.remove(5));//Remove element at index 5 again (Audi)
            System.out.println("print values");
           demo.add(null);


        }


    }
}
/*
*
* */
