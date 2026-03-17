package com.advanced.dsa.dataStructures.linear.stacks;

import java.util.Stack;

public class PostFixEvaluation {
    static int evaluation(String exp){
        Stack<Integer> stack = new Stack<>();
        for(char c : exp.toCharArray()){
            if(Character.isDigit(c)){
                stack.push(c - '0');// Store the integer value
            }
            else{
                int b = stack.pop();
                int a = stack.pop();
                switch(c){
                    case '+' ->
                        stack.push(a + b);
                        case '-' ->
                            stack.push(a - b);

                            case '*' ->
                                stack.push(a * b);

                                case '/' ->
                                    stack.push(a / b);
                }
            }
        }
        return stack.pop();// The ans is the top o fthe stack
    }
    public static void main(String[] args) {
        String exp = "23*54*+9-";
        System.out.println(evaluation(exp));
    }
}
