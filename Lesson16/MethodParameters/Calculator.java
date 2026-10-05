package Lesson16.MethodParameters;

public class Calculator {
    static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(12, 3));
        System.out.println(c.add(12, 3, 45));
        System.out.println(c.add(12, 3, 45, 40));
    }

    public int add(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

  /*  public int add(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }*/


  /*  public int add(int a, int b) {
        return a + b;

    }

    public int add(int a, int b, int c) {
        return a + b + c;

    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;

    }*/
}
