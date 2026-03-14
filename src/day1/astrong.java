package day1;

public class astrong {
    public static void main(String[] args) {
        int n=153;
        int c=1;
        int sum=0;
        int i,temp2,temp1;
        temp2=n;
        temp1=n;
        while(temp1>1){
            temp1=temp1/10;
            c++;
        }
        while(temp2>0){
            i=temp2%10;
            sum=sum+ (int)Math.pow(i,c);
            temp2=temp2/10;
        }
        System.out.println(sum);
        if(sum==n){
        System.out.println("Armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}
