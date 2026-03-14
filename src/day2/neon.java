package day2;
import java.util.Scanner;
public class neon {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int res=0;
      int temp=n*n;
      while(temp!=0){
          int d=temp%10;
          res=res+d;
          temp=temp/10;
      }
      if(res==n){
          System.out.println("neon");
      }
      else{
          System.out.println("not neon");
      }
    }
}
