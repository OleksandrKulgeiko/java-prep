package com.kulgeiko.designpatterns.c_behavioral.interpreter.expr;

import com.kulgeiko.designpatterns.c_behavioral.interpreter.InterpreterEngine;

public interface Expression {
    int interpret(InterpreterEngine ie);
}
