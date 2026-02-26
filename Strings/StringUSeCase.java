package Strings;

public class StringUSeCase {
    public static void main(String[] args) {
        String message="Order Confirmed";
        message=message+" - ID:180";
        System.out.println(message);
        message=message+" - ID : 150";// here we didnt get the updation. got addded output message.
        System.out.println(message);
    }
}
//String is immutable.
//stored in SCP--string constant pool.
//Every modification creates a new object.
//good for read only data.