

// 151. Reverse Words in a String


// Given an input string s, reverse the order of the words.

// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

// Return a string of the words in reverse order concatenated by a single space.

// Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 
import java.util.*;


public class ReverseWordsInString {
    public static String reverse(String s) {
        String ans = "";
        Stack<String> stack = new Stack<>();
        String[] directory = s.trim().split("\\s+");

        for(String a : directory) {
           
            if(a.equals(" ")) {
                continue;
            } else {
                stack.push(a);
            }
        }

        while(!stack.isEmpty()) {
           
              ans += stack.pop() + " ";
          
            
        
        }
        ans = ans.trim();
        return ans;
    }
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverse(s));
    }
}
