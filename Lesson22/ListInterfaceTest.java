package Lesson22;

import java.util.List;

public class ListInterfaceTest {
    static void main(String[] args) {
        List<Integer> integers = List.of(12, 45, 66, 12);
        System.out.println(integers);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        System.out.println(integers.get(1));
        System.out.println(integers.contains(12));
        System.out.println(integers.indexOf(45));
        System.out.println(integers.lastIndexOf(12));
        System.out.println(integers.size());

    }
}
