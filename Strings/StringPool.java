package Strings;

public class StringPool {
    public static void main(String[] args) {
        String s1="Java";
        String s2="Java";
        System.out.println(s1==s2); // checks values.
        String s3= new String("Java");
        System.out.println(s1==s3); // checks References/Objects.
        System.out.println(s1.equals(s3)); // Checks values.
    }

}
/*s1 and s2 stored some objects in POOL
new String creates new heap objects.
== compares references
.equals(),compares values
*/