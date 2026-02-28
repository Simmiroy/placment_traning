package Strings;
//String is immutable because you cannot change the original string.
//we can only create copies.
//The concat method create a new objects,so is result is ignored.
public class Example2 {
    public static void main(String[] args) {
        String s="Java";
        s.concat("Programming");
        System.out.println(s);
    }
}
