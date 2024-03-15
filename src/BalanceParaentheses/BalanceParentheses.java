package BalanceParaentheses;

import java.util.Stack;

public class BalanceParentheses {

    Stack<Character> stack = new Stack<>();

    public void balanceParentheses(String expression) {

        for (char bractet : expression.toCharArray()) {
            // Character bracket = bracket;

            if (bractet == '{' || (bractet == '(') || bractet == '[') {
                stack.push(bractet);
            } else if (bractet == '}' || bractet == ')' || bractet == ']') {
                if (stack.isEmpty() || !isItBalanced(stack.pop(), bractet)) {
                    System.out.println("The espression is not balanced");
                    return;
                }
            }
        }
    }

    public boolean isItBalanced(char open, char close) {
        boolean isBalanced = false;

        if (open == '{' && close == '}') {

            return true;
        } else if (open == '(' && close == ')') {
            return true;
        } else if (open == '[' && close == ']') {
            return true;
        } else {

            return false;
        }

    }

}
