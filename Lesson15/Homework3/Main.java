package Lesson15.Homework3;

public class Main {
    static void main(String[] args) {
        Parent.StaticInner staticObj = new Parent.StaticInner();
        staticObj.staticInnerMethod();

        Parent parentObj = new Parent();
        Parent.NonStaticInner nonStaticInnerObj = parentObj.new NonStaticInner();
        nonStaticInnerObj.NonstaticInnerMethod();
    }
}
