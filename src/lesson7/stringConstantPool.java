package lesson7;

public class stringConstantPool {
    public static void main(String[] args) {

        String str = new String("PDP"); // whenever we make strings with "new" this object will be both in heap memory and string pool.
        String str2 = new String("PDP"); // when we make same object it will be only in heap memory created because PDP object already made before

        System.out.println("System.identityHashCode(str) = " + System.identityHashCode(str));
        System.out.println("System.identityHashCode(str2) = " + System.identityHashCode(str2));

        String str3 = str.intern(); // this gives us the value of the object in string constant pool
        System.out.println(str3);
        System.out.println("System.identityHashCode(str3) = " + System.identityHashCode(str3));

        String str4 = "PDP";
        System.out.println("System.identityHashCode(str4) = " + System.identityHashCode(str4)); // as we can see java is not making new object in string pool it is just referencing that is already have in the pool
    }
}
