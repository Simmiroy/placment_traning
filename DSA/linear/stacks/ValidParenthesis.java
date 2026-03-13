package DSA.linear.stacks;

import java.util.Stack;

public class ValidParenthesis {
    static boolean isValid(String s){
        //if(s.length() %2 !=0) return false;
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){               //{,[,(,),],}
            if(ch=='(' || ch=='[' || ch=='{'){
                //Push opening braces onto the stack.
                stack.push(ch);
            }
            else {
                if(stack.empty()){
                    return false;
                }
                char top= stack.pop();
                if(ch=='}' && top !='{') return false;
                if(ch==']' && top !='[') return false;
                if(ch==')' && top !='(') return false;
            }
        }
        return stack.empty();
        //The string is a valid parenthesi,if all characters are removed.
        //It is invalid if there are some mismatched characters.
    }

    public static void main(String[] args) {
        String s1 ="{[([])]}";
        String s2="{([])]";
        String s3="(({[";
        System.out.println( s1+"->"+(isValid(s1) ? "Valid": "Not valid"));
        System.out.println(s2 +"->"+(isValid(s2)? "Valid":"Not valid"));
        System.out.println(s3 +"->"+(isValid(s3)? "Valid":"Not valid"));
    }
}
