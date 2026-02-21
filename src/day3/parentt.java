package day3;
// static does not supports override.
public class parentt {
    static void  show(){
        System.out.println("PARENTS STATIC");
    }
}
class Childd extends parentt{
    static void show(){
        System.out.println("Child static");
    }

    public static void main(String[] args) {
        parentt obj = new Childd();
        obj.show();
    }

}

