package com.cydeo.task;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor

public class Employee {

    private int empId;
    private String empname;
    private String empEmail;
    private List<String> empPhoneNumbers;






}
