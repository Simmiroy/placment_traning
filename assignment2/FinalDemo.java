package assignment2;
final class FinalClass {
    final int x = 10;

    final void display() {
        System.out.println("Final variable: " + x);
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
    }
}

