package com.gfg.practice.designpattern.factorypattern;

public class EmployeeFactory {
    public static Employee getEmployee(String employee){
        if(employee.trim().equalsIgnoreCase("ANDROID DEVELOPER")){
            return new AndroidDeveloper();
        }
        else if(employee.trim().equalsIgnoreCase("WEB DEVELOPER")){
            return new WebDeveloper();
        }
        else {
            return null;
        }

    }
}
