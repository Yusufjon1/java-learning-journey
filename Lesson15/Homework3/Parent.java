package Lesson15.Homework3;

public class Parent {

    public static class StaticInner {
        public void staticInnerMethod() {
            class LocalInStatic {
                public void show() {
                    System.out.println("staticInner -> local inner class working !");
                }
            }
            LocalInStatic local = new LocalInStatic();
            local.show();
        }
    }

    public class NonStaticInner {
        public void NonstaticInnerMethod() {
            class LocalInNonstatic {
                public void show() {
                    System.out.println("non static class -> non static local class works");
                }
            }
            LocalInNonstatic local = new LocalInNonstatic();
            local.show();
        }
    }
}
