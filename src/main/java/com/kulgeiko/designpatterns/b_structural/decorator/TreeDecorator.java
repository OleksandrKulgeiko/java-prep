package com.kulgeiko.designpatterns.b_structural.decorator;

import com.kulgeiko.designpatterns.b_structural.decorator.tree.ChristmasTree;



public abstract class TreeDecorator implements ChristmasTree {

    private ChristmasTree tree;

    public TreeDecorator(ChristmasTree tree) {
        this.tree = tree;
    }

    @Override
    public String decorate() {
        return tree.decorate();
    }
}
