package day1;

public class calci {
    int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        calci ob=new calci();
        System.out.println(ob.add(10,20));
        int result=ob.add(30,0);
        System.out.println(result);
    }
}
