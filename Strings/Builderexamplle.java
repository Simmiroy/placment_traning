package Strings;
import java.lang.*;
public class Builderexamplle {
    public void stringInsert(){
        StringBuilder s= new StringBuilder("cool");
        System.out.println("Old String :" +s);
        s.insert(1," Av");
        System.out.println("New String :" +s);
    }
    public void stringAppend(){
        StringBuilder s= new StringBuilder("fool");
        System.out.println("Old String :" +s);
        s.append(" ISE");
        System.out.println("New String :" +s);
    }
    public void stringReverse(){
        StringBuilder s= new StringBuilder("moon");
        System.out.println("Old String :" +s);
        s.reverse();
        System.out.println("New String :" +s);
    }

    public static void main(String[] args) {
        new Builderexamplle().stringInsert();
        new Builderexamplle().stringAppend();
        new Builderexamplle().stringReverse();
    }

}
