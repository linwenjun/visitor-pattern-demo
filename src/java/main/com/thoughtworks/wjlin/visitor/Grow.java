package com.thoughtworks.wjlin.visitor;

/**
 * Created by Wenjun LIN on 2015/11/27.
 */
public class Grow implements Visitor{

    @Override
    public void visit(Person person) {
        System.out.println(person.name);
    }
}
