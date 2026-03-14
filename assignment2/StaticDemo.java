package assignment2;
class Student {
    String name;
    static String college = "ABC College";

    Student(String name) {
        this.name = name;
    }

    static void displayCollege() {
        System.out.println("College: " + college);
    }

    void display() {
        System.out.println(name + " - " + college);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Simmi");
        Student s2 = new Student("Rahul");

        s1.display();
        s2.display();
        Student.displayCollege();
    }
}

