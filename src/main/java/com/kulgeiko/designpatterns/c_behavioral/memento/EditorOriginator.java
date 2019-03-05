package com.kulgeiko.designpatterns.c_behavioral.memento;

import lombok.Setter;

@Setter
public class EditorOriginator {
    public String content;
    public EditorMemento save() { return new EditorMemento(content); }
    public void restoreToState(EditorMemento memento) { content = memento.getState(); }
}