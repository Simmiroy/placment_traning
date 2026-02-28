package Strings;

public class StringBaseExample {
    public static void main(String[] args) {
        char[] letters={'S' ,'I','M','M','I'};
        String name= new String(letters); //String method
        System.out.println(name);
        String jumbled="Simmi1Is1From1Ise1B1Section";
        String[] words=jumbled.split("1");
        System.out.println(words[5]);
        for(Object obj:words){
            System.out.println(obj+" ");
        }
        System.out.println();
        String data="    SNPSU     ISE     ";
        System.out.println(data.trim());
    }
}
