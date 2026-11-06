package Lesson21.Bounds;

public class TypeVariableBounds<T extends Number> {
    private final T field;

    public TypeVariableBounds(T field) {
        this.field = field;
    }
}

class Repository implements CanConnectToDataBase{}

interface CanConnectToDataBase{}

class Service<R extends CanConnectToDataBase> {
    private final R repository;

    Service(R repository) {
        this.repository = repository;
    }
}

class A<E extends B1 & B2 & B3>{}

interface B1{}

interface B2{}

interface B3{}

class C1 implements B1, B2{}
class C2 implements B1, B3, B2{}

class TypeVariableBoundsTest {
    static void main(String[] args) {

        // var t = new TypeVariableBounds<String>("hello");
        var t2 = new TypeVariableBounds<Long>(1L);
        var t3 = new TypeVariableBounds<Long>(1L);
        var t4 = new TypeVariableBounds<Long>(1L);
        Repository repository = new Repository();
        var service = new Service<Repository>(repository);
      // var a = new A<C1>();
       var a2 = new A<C2>();
    }
}


