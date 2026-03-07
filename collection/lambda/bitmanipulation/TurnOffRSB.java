package collection.lambda.bitmanipulation;

public class TurnOffRSB {
    public static void main(String[] args) {
        int n=12;
        int result=n &(n-1);
        System.out.println(result);
    }
}
