package Lesson21.HW3;

public class Main {
    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Is empty? " + list.isEmpty());
        System.out.println("size " + list.size());

        list.add("mrom");
        list.add("shofiddin");
        list.add("azam");
        list.add("ismalo");

        System.out.println("------AFTER ADD--------");
        System.out.println("Is empty? " + list.isEmpty());
        System.out.println("size " + list.size());

        System.out.println("0 element " + list.get(0));
        System.out.println("2 element " + list.get(2));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + "-> " + list.get(i));
        }

        String removed = list.remove(1);
        System.out.println("deleted -> " + removed);
        System.out.println("size " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.clear();
        System.out.println("size: " + list.size());
        System.out.println("is empty ? " + list.isEmpty());

    }
}
