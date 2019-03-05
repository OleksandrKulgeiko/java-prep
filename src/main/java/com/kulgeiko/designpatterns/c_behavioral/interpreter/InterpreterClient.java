package com.kulgeiko.designpatterns.c_behavioral.interpreter;

import com.kulgeiko.designpatterns.c_behavioral.interpreter.expr.AddExpression;
import com.kulgeiko.designpatterns.c_behavioral.interpreter.expr.Expression;
import com.kulgeiko.designpatterns.c_behavioral.interpreter.expr.SubtractExpression;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InterpreterClient {

    private InterpreterEngine ie;

    public int interpret(String input) {

        Expression exp = null;

        if(input.contains("add")) {
            exp = new AddExpression(input);
        } else if(input.contains("subtract")) {
            exp = new SubtractExpression(input);
        }

        int result = exp.interpret(ie);
        System.out.println(input);

        return result;
    }

    public static void main(String args[]) {

        InterpreterClient ic = new InterpreterClient(new InterpreterEngine());

        System.out.println("Result = " + ic.interpret("add 5 and 6"));
        System.out.println("Result = " + ic.interpret("subtract 76 from 621"));
    }

}
