package Lesson21;

public class RawTypeTest<E> {
    private E item;

    public void setItem(E item) {
        this.item = item;
    }
@SuppressWarnings({"rawtypes", "unchecked"})
    static void main(String[] args) {
        RawTypeTest rawTypeTest = new RawTypeTest();
        rawTypeTest.setItem("13413");
    }
}
