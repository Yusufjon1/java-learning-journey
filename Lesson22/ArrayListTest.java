package Lesson22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.UUID;

public class ArrayListTest {
    static void main(String[] args) {
        ArrayList<Integer> integer1 = new ArrayList<>();
        integer1.add(123);
        ArrayList<Integer> integer2 = new ArrayList<>(integer1);
        integer2.add(34);
        System.out.println(integer2);
        ArrayList<user> users = new ArrayList<>();
        users.add(new user(21, "john"));
        users.add(new user(45, "john 1"));
        users.add(new user(66, "john 2"));
        users.add(new user(34, "john 3"));
        users.add(new user(18, "john 4"));
        users.sort(Comparator.naturalOrder());
        System.out.println(users);
        for (user user : users) {
            System.out.println(user);
        }
     /*   integer2.add(0, 45);
        System.out.println(integer2);
        integer2.set(1, 22);
        System.out.println(integer2);
        integer2.remove(1);
        System.out.println(integer2);
        integer1.removeAll(integer1);
        System.out.println(integer1);
        System.out.println(integer2);
        integer2.forEach(o -> System.out.println(o));*/
/*
        System.out.println(integer2);
        integer2.sort(Comparator.reverseOrder());
        System.out.println(integer2);*/



     }
}

class user implements Comparable<user>{
    private final String id;
    private final int age;
    private final String name;

    user( int age, String name) {
        this.id = UUID.randomUUID().toString();
        this.age = age;
        this.name = name;
    }



    @Override
    public String toString() {
        return "user{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(user o) {
        return Integer.compare(this.age, o.age);
    }
}
