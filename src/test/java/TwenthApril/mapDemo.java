package TwenthApril;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class mapDemo {

    /*
    * Map is one of the interface
    * Map contains values in key value pairs
    * obj.get(3);
    * map in implemented by usning hashmap linked hasmmap
    *
    * */


    @Test
    public static void mapDemoClass(){
        Map<String, String> obj = new HashMap<>();
        obj.put("name","Sireesha");
        obj.put("name","Anil");
        obj.put("location","Hyderabad");
        obj.put("location","Amaravathi");
        obj.put("mobile","8945689856");
        obj.put("mobile","965412355");
        obj.put("office","Microsoft");
        obj.put("office","Google");

//        System.out.println(obj.get("office"));
//
//        System.out.println(obj.getOrDefault("location","hyderabad"));
//
//
//        System.out.println(obj.remove("office"));
//        System.out.println(obj.containsKey("office"));

        // Plays very key role
        // entrySet is used to get both keys and values
        for(Map.Entry<String,String> var : obj.entrySet()){
            System.out.println(var.getKey());
            System.out.println(var.getValue());
        }

        // village      mobile      color
        // hyderabad    89456       red
        // vijayawada   65896       yellow
        // vizag        6555        blue
        // amaravathi   2456        purple
    }
}
