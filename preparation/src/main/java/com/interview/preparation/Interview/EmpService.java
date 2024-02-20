package com.interview.preparation.Interview;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpService {
    public static void main(String[] args) {

        EmployeeDAO employeeDAO=new EmployeeDAO();
        Map<EmployeeObj, List<Address>> employeeObjListMap= employeeDAO.getEmployeeInfo();
        System.out.println("employee Info Details"+employeeObjListMap);
     //   employeeObjListMap.entrySet().stream().filter(e->e.getKey().getAge()>20).sorted(Comparator.comparing())

    }
}
