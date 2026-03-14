package day3;

public class parent {
    int x=10;
}
class chile extends parent{
    int x=20;
    void show(){
        System.out.println(x);
        System.out.println(super.x);
    }

    public static void main(String[] args) {
        chile ob= new chile();
        ob.show();
    }
}
