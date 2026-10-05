package Lesson17;

public /*final*/ class A {

  /*  public A(String fieldOne) {     //  final classes can not be changed  and public final classes must be initialized when it is created
        this.FieldOne = fieldOne;
    }*/

    public final String FieldOne = "Field one";


    public void greeting() {
        final int a = 12;
      //  a = 90;  // final constants can not be changed once created
        System.out.println("Hello");
    }
}
