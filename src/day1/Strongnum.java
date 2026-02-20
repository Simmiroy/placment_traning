package day1;

public class Strongnum {
    public static void main(String[] args) {
        int n=145;
        int res=0;
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            int fact=1;
            for(int i=1; i<=digit; i++){
                fact=fact*i;
            }
            res+=fact;
            temp/=10;
        }
        if(res==n){
            System.out.println("s number");
        }
        else{
            System.out.println("not");
        }
        System.out.println(res);
    }
}
