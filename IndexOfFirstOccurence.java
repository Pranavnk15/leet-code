

// Find the Index of the First Occurrence in a String



// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 


class IndexOfFirstOccurence {
    public int strStr(String haystack, String needle) {
        if(haystack.equals(needle) && haystack.length() == needle.length()) {
            return 0;
        }
        
     for(int i = 0; i<haystack.length(); i++) {
         if(haystack.substring(i, i+1).equals(needle)) {
                return i;
            }
            for(int j = i+1; j<haystack.length(); j++) {
                String sub = haystack.substring(i, j+1);
                if( sub.equals(needle)) {
                    System.out.println(haystack.substring(i, j+1));
                    return i;
                }
            }
        }
        return -1;
    }
}

///////////// another solution
class Solution {
    public int strStr(String haystack, String needle) {
      return haystack.indexOf(needle);
    }
}