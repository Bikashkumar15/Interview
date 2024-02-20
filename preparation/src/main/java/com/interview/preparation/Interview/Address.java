package com.interview.preparation.Interview;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Address {
    private String flatNo;
    private String street;
    private String landmark;
    private int pinCode;
}
