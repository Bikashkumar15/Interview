package com.interview.preparation.Interview;

import java.util.*;
import java.util.stream.Stream;

public class EmployeeDAO {
    public Map<EmployeeObj,List<Address>> getEmployeeInfo(){


         List<String> phoneNos=Arrays.asList("998835843","3435342223");
        List<Address> addresses= Arrays.asList(new Address("A105","ABC","lmark1",249534),
                      new Address("T3423","NDFD","lmark2",645343),
                      new Address("KL453","OSRJ","lmark4",9085444));
        EmployeeObj employeeObj= EmployeeObj.builder().name("bikash").age(28).company("MKS").phoneNo(phoneNos).address(addresses).build();
Map<EmployeeObj,List<Address>> objListMap=new HashMap<>();
        objListMap.put(employeeObj,addresses);
        return objListMap;

    }

}
