package Lesson14.Homework3;

public class Main {
    static void main(String[] args) {
        Vehicle malibu = new Malibu();
        malibu.drive();

        Equipment tv = new Television();
        tv.turnOn();

        Vehicle spark = new Spark();
        spark.drive();

        Equipment Wmachine = new WashingMachine();
        Wmachine.turnOn();
    }
}
