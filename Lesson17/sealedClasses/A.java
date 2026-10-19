package Lesson17.sealedClasses;

import java.io.Serializable;

public sealed class A extends G implements Serializable, Cloneable permits B {
}
