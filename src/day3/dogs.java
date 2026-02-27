package day3;
//polymorphism
class Animals{
    void sounds(){
        System.out.println("makes sound ");
    }
}

public class dogs extends Animals {
    @Override
    void sounds(){
        System.out.println("barksss");
    }

    public static void main(String[] args) {
        Animals obk= new  dogs();
        obk.sounds();
    }
}
