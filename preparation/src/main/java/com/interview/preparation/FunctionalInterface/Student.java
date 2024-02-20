package com.interview.preparation.FunctionalInterface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;

    private String name;

    private double percentage;

    private String specialization;
}
