package collection.lambda.bitmanipulation;

public class CheckKthBit {
    public static void main(String[] args) {
        int n=4;
        int k=1;
        if((n&(1<<k))!=0){
            System.out.println("Set");
        }else{
            System.out.println("Not Set");
        }
    }
}
