package com.patterns.behavioral.interpreter;


public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExression();
        Expression isJavaEEE = getJavaEEExpression();

        System.out.println(isJava.interpret("Java Core"));
        System.out.println(isJavaEEE.interpret("Java Spring"));
    }

    public static Expression getJavaExression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");

        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java, spring);
    }
}
