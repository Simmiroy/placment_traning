package nestedclasses;
//Anonymous
public interface Payment {
    void pay();
}
class PayementDemo{
    public static void main(String[] args) {
        //BoilerPlate Code.
        Payment p= new Payment() {
            @Override
            public void pay() {
                System.out.println("Payment done using Credit Card. ");
            }
        };
        p.pay();
        //SCALA(is a language java is inspired from) - Java 8   imp(**Streams , Annotations, Lambdas ,Reflection**)
        Payment p1=()-> System.out.println("Cash Payment");
        p1.pay();
    }
}
/*
Points to remember:
One-time implementation .
No need to create separate class.
It is used in events & callback functions.
*/