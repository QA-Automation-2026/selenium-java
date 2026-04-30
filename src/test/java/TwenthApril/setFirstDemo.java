package TwenthApril;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setFirstDemo {
    public static void main(String[] args) {

        Set<Object> obj = new HashSet<>();
        obj.add(1);
        obj.add("Space");
        obj.add(10.5f);
        System.out.println(obj.size());

        Set<Object> obj1 = new HashSet<>();
        obj1.add("Siri");
        obj1.add("Super");
        obj1.add("Agent");
        System.out.println(obj1.size());
        obj.addAll(obj);
        obj.addAll(obj1);
        System.out.println("adding total" + obj.size());

        for (Object s : obj) {
            System.out.println("Print values using for each loop " + s);
            Iterator<Object> i = obj.iterator();
            while(i.hasNext()){
                Object value = i.next();
                System.out.println(value);
            }

        }
    }
}