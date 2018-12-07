package com.kulgeiko.designpatterns.b_structural.decorator.toys;

import com.kulgeiko.designpatterns.b_structural.decorator.TreeDecorator;
import com.kulgeiko.designpatterns.b_structural.decorator.tree.ChristmasTree;

public class Tinsel extends TreeDecorator {

    public Tinsel(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with TINSEL";
    }
}

