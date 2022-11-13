package com.designpattern.behavioral.interpreter;

import com.designpattern.behavioral.interpreter.expression.*;

import java.util.Stack;

public class Client {
    public static void main(String[] args) {
        String tokenString = "4 3 2 + 1 1 *";

        Stack<Expression> stack = new Stack<>();
        String[] tokenList = tokenString.split(" ");

        for (String s: tokenList) {
            if(isOperator(s)) {
                Expression leftExpression = stack.pop();
                Expression rightExpression = stack.pop();

                System.out.println("Operation: " + s + " leftExpression:" + leftExpression + ", rightExpression: " + rightExpression);
                Expression operation = getOperatorInstance(s, leftExpression, rightExpression);

                int result = operation.interpret();
                Expression resultExpression = new NumberExpression(result);
                stack.push(resultExpression);
                System.out.println("Push result to the stack: " + resultExpression);
            } else {
                Expression numberExpression = new NumberExpression(s);
                stack.push(numberExpression);
                System.out.println(numberExpression);
            }
        }
        System.out.println("result: " + stack.pop().interpret());
    }

    private static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*");
    }

    private static Expression getOperatorInstance(String s, Expression left, Expression right) {
        switch (s) {
            case "+":
                return new PlusExpression(left, right);
            case "-":
                return new MinusExpression(left, right);
            case "*":
                return new MultiplyExpression(left, right);
            default:
                return new MultiplyExpression(left, right);
        }
    }
}
