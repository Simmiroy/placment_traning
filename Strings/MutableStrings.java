package Strings;

public class MutableStrings {
    public static void main(String[] args) {
        String s="SNPSU";
        s+=" ISE";
        System.out.println(s);
        //Mutable- Thread Safe.
        StringBuffer buffer =new StringBuffer();
        buffer.append(" ISE");
        System.out.println(buffer);
        //Mutable- Not Thread safe.
        StringBuilder builder= new StringBuilder();
        builder.append(" ISE");
        System.out.println(builder);
    }
}
