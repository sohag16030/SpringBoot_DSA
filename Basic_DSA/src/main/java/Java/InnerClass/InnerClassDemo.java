package Java.InnerClass;

//Member inner class-->class is like a member here
class Outer {
    private int outerVar = 10;

    class Inner {
        void display() {
            System.out.println("Value of outerVar: " + outerVar);
        }
    }
}
// Static Nested class --> static class will be there
class NewOuter {
    private static  int outerVar = 10;

    static class Nested {
        void display() {
            System.out.println("Value of outerVar: " + outerVar);
        }
    }
}

// Anonymous inner class
interface Greeting{
    void greet();
}

public class InnerClassDemo {
    public static void main(String[] args) {

        //Member inner class-->class is like a member here
        Outer.Inner inner = new Outer().new Inner();
        inner.display();

        // Static Nested class --> static class will be there
        NewOuter.Nested nested = new NewOuter.Nested(); // static class direct call, no object creation
        nested.display();

        // Local Inner Class -- into a local method
        class LocalInnerClass{
            public void localInnerMethod(){
                class Inner{
                    void display(){
                        int outerVar = 10;
                        System.out.println("Value of outerVar: " + outerVar);
                    }
                }
                Inner inner = new Inner();
                inner.display();
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.localInnerMethod();

        // Anonymous inner class
        Greeting anonymousGreeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from anonymous inner class!");
            }
        };
        anonymousGreeting.greet();
    }

}
