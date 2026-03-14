package day2;
import java.util.Scanner;
public class automorphic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int square=n*n;
        int temp=n;
        while(temp!=0){
            if(n%10!=square%10){
                System.out.println("Automorphic");
                return;
            }
            temp/=10;
            square/=10;
        }
    }
}
