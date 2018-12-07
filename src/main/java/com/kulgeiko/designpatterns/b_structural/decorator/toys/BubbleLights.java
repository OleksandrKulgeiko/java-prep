package com.kulgeiko.designpatterns.b_structural.decorator.toys;

import com.kulgeiko.designpatterns.b_structural.decorator.TreeDecorator;
import com.kulgeiko.designpatterns.b_structural.decorator.tree.ChristmasTree;

public class BubbleLights extends TreeDecorator {

    public BubbleLights(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }
}
