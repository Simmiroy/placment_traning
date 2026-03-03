package assignment2;

public class StringDifference {
    public static void main(String[] args) {

        String str = "Hello";
        str.concat(" World");
        System.out.println("String: " + str);


        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb);


        StringBuffer sf = new StringBuffer("Hello");
        sf.append(" World");
        System.out.println("StringBuffer: " + sf);
    }
}
