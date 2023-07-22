



//  Valid Parentheses





// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 


class validParentheses {
 public boolean isValid(String s) {
   Stack<Character> stack = new Stack<>();
   for(char i : s.toCharArray()) {
       if(i == '(' || i == '{' || i == '[') {
           stack.push(i);
       } else {
           if(stack.empty() || i == ')' && stack.peek() != '(' || i == '}' && stack.peek() != '{' || i == ']' && stack.peek() != '[') {
               return false;
               
           }
           stack.pop();

       }
   }
   return stack.empty();
  }
}