package com.kulgeiko.designpatterns.c_behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
class EditorMemento {
    private final String state;
}