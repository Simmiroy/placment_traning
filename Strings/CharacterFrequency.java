package Strings;

public class CharacterFrequency {
    public static void main(String[] args) {
        System.out.println('A' -'a');
        System.out.println('a' -'A');
        System.out.println((char)('A'+32));
        System.out.println((char)('A'-32));
        String str="elephant";
        int[] freq =new int[26];
        for(int i=0; i<str.length(); i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++){
            if(freq[i]>0){
                System.out.println((char) (i+'a')+"-> "+ freq[i]);
            }
        }
    }
}
