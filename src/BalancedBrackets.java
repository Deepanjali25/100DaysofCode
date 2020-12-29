import java.util.*;
public class BalancedBrackets {
    static boolean areBracketsBalanced(String expr) { // function to check if brackets are balanced
        Deque<Character> stack = new ArrayDeque<Character>(); // Using ArrayDeque is faster than using Stack class
        for (int i = 0; i < expr.length(); i++) { // Traversing the Expression
            char x = expr.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x); // Push the element in the stack
                continue;
            }
            // If current current character is not opening bracket, then it must be closing. So stack cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty()); // Check Empty Stack
    }
    public static void main(String[] args) {
        String expr = "([{}])";
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
} 
