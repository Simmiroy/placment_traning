package Assignment;


class Parent {
    void show() {
        System.out.println("Parent  show()");
    }
}

class Child extends Parent {
    void show() {   // Overriding
        System.out.println("Child  show()");
    }

    void show(int x) {   // Overloading
        System.out.println("Child  show(int x)");
    }
}
public class both {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
        c.show(10); // calling integer parameter.
    }

}
