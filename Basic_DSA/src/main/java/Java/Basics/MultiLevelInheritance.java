package Java.Basics;

class A {
    public void function() {
        System.out.println("A");
    }
}

class B extends A {
    public void function() {
        System.out.println("B");
    }
}

class C extends B {
    public void function() {
        System.out.println("C");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
         B b = new C();
         b.function();
    }
}
