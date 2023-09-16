package Java.Java_8.Generic;

class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class Generic {
    public static void main(String[] args) {
        Box<String> boxStr = new Box<>();
        boxStr.setValue("100");
        System.out.println(boxStr.getValue());
        Box<Integer> boxInt = new Box<>();
        boxInt.setValue(100);
        System.out.println(boxInt.getValue());
    }
}
