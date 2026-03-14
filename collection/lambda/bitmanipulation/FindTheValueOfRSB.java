package collection.lambda.bitmanipulation;

public class FindTheValueOfRSB {
    public static void main(String[] args) {
        int n=12;
        int result= n &-n;
        System.out.println(result);
    }
}
//its 2's compliment=1's compliment  + 1.