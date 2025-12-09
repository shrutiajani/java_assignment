package p1;

abstract class Parent {
    abstract void message();
}

class FirstSubclass extends Parent {
    void message() {
        System.out.println("This is first subclass");
    }
}

class SecondSubclass extends Parent {
    void message() {
        System.out.println("This is second subclass");
    }
}

public class Abstractclass {
    public static void main(String[] args) {

        Parent p1 = new FirstSubclass();
        p1.message();

        Parent p2 = new SecondSubclass();
        p2.message();
    }
}
