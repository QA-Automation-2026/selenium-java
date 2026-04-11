package SixthApril;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class IntClass {
    @Test
    public void IntClass() {
        List<Integer> demo = new ArrayList<>();
        demo.add(1);
        demo.add(2);
        demo.add(3);
        demo.add(4);
        demo.add(5);
        System.out.println(demo.size());//total 5
        System.out.println(demo.add(6));//adding one more num
        System.out.println(demo.get(demo.size() - 1));

        demo.set(2, 5); // Replace index 2 (3rd element) with 5
        System.out.println("After replacing index 2 with 5:");
        for (Integer obj : demo) {
            System.out.println(2);

            demo.remove(3); // Removes element at index 3 (4th element, originally 4)
            System.out.println("After removing index 3:");


            }

        }
    }

