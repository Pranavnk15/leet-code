

// Valid Palindrome II


// Given a string s, return true if the s can be palindrome after deleting at most one character from it.


public class validPalindrome {

    public static boolean validPalindrome(String s) {
        System.out.println(s);
            String str = s;
        int n = str.length();
        for(int i = 0; i<n/2; i++) {
            if(str.charAt(i) == str.charAt(n-i-1)) {
                return true;
            } else {
                
                str.replace(Character.toString(str.charAt(i)), "");
                if(str.charAt(i+1) == str.charAt(n-i-1)) {
                    return true;
                } else {
                     str.replace(Character.toString(str.charAt(n-i-1)), "");
                    if(str.charAt(i) == str.charAt(n-i-2)) {
                        return true;
                     }
                }
            }
        
        }
        return false;
        }

    public static void main(String[] args) {
        String s = "tcca";
        System.out.println(validPalindrome(s));
    }
}


///// Two POinter apporoach 
class Solution {
    public boolean validPalindrome(String s) {
       int i = 0, j = s.length()-1; //two pointers
       while(i<j) {
           if(s.charAt(i) == s.charAt(j)) {
               i++;
               j--;
           } else {
               //recursion with i+1 and j-1
               //it skips the charachter and  again checks for palindrome
               return validPalindromeTill(s, i+1, j) || validPalindromeTill(s, i, j-1);
           }
       }
       return true;

    }
    public  boolean validPalindromeTill(String s, int i, int j) {
    while(i<j) {
        if(s.charAt(i) == s.charAt(j)) {
            i++;
            j--;
        } else {
            return false;
        }
    }
    return true;
}
}


