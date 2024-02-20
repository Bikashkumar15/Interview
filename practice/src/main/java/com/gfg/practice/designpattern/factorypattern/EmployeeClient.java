package com.gfg.practice.designpattern.factorypattern;

public class EmployeeClient {
    public static void main(String[] args) {
Employee employee = EmployeeFactory.getEmployee("WEB DEVELOPER");
int salary = employee.salary();
        System.out.println(salary);
    }
}
