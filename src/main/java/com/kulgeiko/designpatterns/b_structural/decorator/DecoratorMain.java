package com.kulgeiko.designpatterns.b_structural.decorator;

import com.kulgeiko.designpatterns.b_structural.decorator.toys.BubbleLights;
import com.kulgeiko.designpatterns.b_structural.decorator.toys.Tinsel;
import com.kulgeiko.designpatterns.b_structural.decorator.tree.ChristmasTree;
import com.kulgeiko.designpatterns.b_structural.decorator.tree.Pine;
import com.kulgeiko.designpatterns.b_structural.decorator.tree.Spruce;

public class DecoratorMain {

    public static void main(String... args){

        ChristmasTree spruce = new Spruce();
        ChristmasTree pine = new Pine();
        System.out.println(spruce.decorate());
        System.out.println(pine.decorate());

        ChristmasTree horodnyaTree = new BubbleLights(new Spruce());
        ChristmasTree smilaTree = new Tinsel(new Pine());
        System.out.println(horodnyaTree.decorate());
        System.out.println(smilaTree.decorate());
    }
}
