package com.gfg.practice.designpattern.factorypattern;

public class WebDeveloper implements Employee{

    @Override
    public int salary() {
        System.out.println("Web Developer Salary : ");
        return 800000;
    }
}
