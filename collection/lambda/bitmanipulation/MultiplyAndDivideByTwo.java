package collection.lambda.bitmanipulation;

public class MultiplyAndDivideByTwo {
    public static void main(String[] args) {
        int n=1; //0101 << 1=1010.(Multiplied by 2)
        int result =n << 1;
        System.out.println(result);
        int x=55;
        int num= x >> 1;   // Divide By 2.
        System.out.println(num);
    }
}
