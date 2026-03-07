package collection.lambda.bitmanipulation;

import java.util.Scanner;

public class EvenOddBit {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        if(((n&1)==0)){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
