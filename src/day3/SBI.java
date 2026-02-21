package day3;
class Bank{
    void interest(double rate){
        System.out.println("Bank provides interest deposits " + rate);
    }
}
public class SBI extends Bank {
    void interest(double rate , int years){
        System.out.println(rate * years);
        System.out.println(rate +  " yaers "+ years);
    }

    public static void main(String[] args) {
        SBI ob = new SBI();
        ob.interest(54.3);
        ob.interest(54.3,6);
    }
}
