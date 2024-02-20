package com.interview.preparation.Interview;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class EmployeeObj {
    private int age;
    private String name;
    private String company;
    private List<String> phoneNo;

    private List<Address> address;


}
