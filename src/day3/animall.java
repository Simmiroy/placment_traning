package day3;
public class animall {
    void print(){
        System.out.println("sound");
    }
}
class catt extends animall{
    void display(){
        System.out.println("Meoww");
    }
}
class dogg extends animall {
    void bark() {
        System.out.println("bhauu");
    }


    public static void main(String[] args) {
        dogg ob = new dogg();
        catt ob1=new catt();
        ob.print();
        ob1.display();
        ob.bark();
    }
}
