package day3;

public class puppy extends dog{
    void display(){
        System.out.println("puppy class");
    }

    public static void main(String[] args) {
        puppy ob = new puppy();
        ob.print();
        ob.sound();
        ob.display();
    }
}
