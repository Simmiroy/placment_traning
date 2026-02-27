package day3;
class parnt{
    parnt(){
        System.out.println("parent");
    }
}
public class child1 extends parnt{
    child1(){
        super();
        System.out.println("child");
    }
    public static void main(String[] args) {
        child1 ob= new child1();

    }
}
