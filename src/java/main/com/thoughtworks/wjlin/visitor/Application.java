package com.thoughtworks.wjlin.visitor;

public class Application {
    public static void main(String args[]) {
        Person p = new Person();
        p.name = "LIN Wenjun";

        Visitor grow = new Grow();
        p.accept(grow);

    }
}
