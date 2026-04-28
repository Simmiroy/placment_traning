//package DSA.tries;
//import java.util.Arrays;
//import java.util.List;
//
//class TrieNode {
//    TrieNode[] children;
//    boolean wordEnd;
//    TrieNode(){
//        wordEnd=false;
//        children=new TrieNode[26];
//    }
//}
//public class Trie{
//    //insert & search
//    //aryan ->{a,r, y, ,a,n}
//    static void insertNode(TrieNode root,String word){
//        /*
//        We will start with root & check if the node exists
//        If exists, we will traverse via the node
//        If not, we will create the node
//        */
//        TrieNode curr= root;
//        for(char ch:word.toCharArray()){
//            if(curr.children[ch-'a']==null){
//                //null means is not present soo we create the node of that character
//                curr.children[ch-'a']=new TrieNode();
//            }
//            //Move to the children node for the next character
//            curr=curr.children[ch-'a'];
//        }
//        curr.wordEnd=true;//We have inserted the word
//    }
//
//    static boolean searchword(TrieNode root, String prefix) {
//        TrieNode curr= root;
//        for(char ch : prefix.toCharArray()){
//            if(curr.children[ch-'a']==null){
//                //The first letter (node) doesn't exist
//                //so the whole word is not present
//                return  false;
//            }
//            curr=curr.children[ch-'a'];
//        }
//        return true; //If true  :- exists or else false *Accenture*
//    }
//
//    public static void main(String[] args) {
//        TrieNode root = new TrieNode();
//        List<String> inputWords=Arrays.asList("Sidharth","Vaishnav","sonika","darshan","tejas","sharanya");
//        for(String word : inputWords){
//            insertNode(root,word);
//        }
//        List<String> searchWord=Arrays.asList("Sidharth","saurav","anup","" +
//                "raushan","Vaishnav","sonika","darshan","tejas","sharanya");
//        for(String word : searchWord){
//            if(searchWord(root,word)){
//                System.out.println(word+"present in Trie");
//            }else{
//                System.out.println(word+"not present in Trie");
//            }
//        }
//        System.out.println(startsWith(root,"sid"));
//        System.out.println(startsWith(root,"sau"));
//        System.out.println(startsWith(root,"son"));
//    }
//}
