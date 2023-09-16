package Java.Basics;

//default static method in java

interface Payment {
    default void addCoupon() {
        System.out.println("3% cash back");
    }

    static void transaction() {
        System.out.println("transaction is successful");
    }
}

class Bkash implements Payment {
    @Override
    public void addCoupon() {
        System.out.println("5% cash back");
    }
}

class Main {
    public static void main(String[] args) {
        Payment p = new Bkash();
        p.addCoupon();
        Payment.transaction();
    }
}
