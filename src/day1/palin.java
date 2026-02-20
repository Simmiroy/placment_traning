package day1;

public class palin {
    public static void main(String[] args) {
        int n=121;
        int j=n;
        int temp = 0;
        while(j>0){
            temp= temp*10+ j%10;
            j=j/10;

        }
//        j=n;
        if(n==temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not a Palindrome");
        }
        System.out.println(temp);
    }
}
