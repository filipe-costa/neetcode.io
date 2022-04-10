package stack;

import java.util.HashMap;
import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/
public class ValidParenthesis {
    Stack<Character> stack = new Stack<>();
    HashMap<Character, Character> brackets = new HashMap<>();

    ValidParenthesis() {
        brackets.put('}', '{');
        brackets.put(')', '(');
        brackets.put(']', '[');
    }

    public boolean isValid(String s) {
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(brackets.containsKey(c)) {
                if(!stack.empty() && stack.peek() == brackets.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.empty();
    }
}
