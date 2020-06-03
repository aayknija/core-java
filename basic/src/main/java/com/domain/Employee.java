package com.domain;

import lombok.Data;

@Data
public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(){

    }

    public Employee(int id, String name, double salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}
