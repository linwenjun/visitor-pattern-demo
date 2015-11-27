package com.thoughtworks.wjlin.visitor;

/**
 * Created by Wenjun LIN on 2015/11/27.
 */
public class Person {
    public String name;

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
