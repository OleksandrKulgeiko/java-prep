package com.kulgeiko.designpatterns.c_behavioral.interpreter.expr;

import com.kulgeiko.designpatterns.c_behavioral.interpreter.InterpreterEngine;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AddExpression implements Expression {

    private String expression;

    @Override
    public int interpret(InterpreterEngine ie) {
        return ie.add(expression);
    }
}