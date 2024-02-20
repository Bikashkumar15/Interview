package com.gfg.practice.designpattern.factorypattern;

public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("Android Developer Salary : ");
        return 50000;
    }


}
