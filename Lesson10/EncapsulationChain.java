package Lesson10;

public class EncapsulationChain {
    public static void main(String[] args) {
        EncapsulationClass encapsulationClass = new EncapsulationClass("Yulduzli tunlar", 455);
        //  encapsulationClass.title = "Yulduzli tunlar"; error
        // accessor, mutators
        // encapsulationClass.title = "Jack Ma"; // error

        System.out.println(encapsulationClass.getTitle());
        encapsulationClass.setTitle("Jack Ma");
        System.out.println(encapsulationClass.getTitle());


        System.out.println(encapsulationClass.getPageCount());
        encapsulationClass.setPageCount(350);
        System.out.println(encapsulationClass.getPageCount());

        // accessor -> getter
        // mutator -> setter
    }
}
