package com.java8.comparators;

import com.domain.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class TestComparators {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(10,"Ajinkya10",1200D));
        employeeList.add(new Employee(15,"AjinkyaS",1200D));
        employeeList.add(new Employee(15,"AjinkyaA",1200D));
        employeeList.add(new Employee(8,"Ajinkya8",1200D));

        Map<Integer,Employee> employeeMap = new HashMap<>();
        employeeMap.put(10,new Employee(10,"Ajinkya10",1200D));
        employeeMap.put(15,new Employee(10,"AjinkyaS",1200D));
        employeeMap.put(15,new Employee(10,"AjinkyaA",1200D));
        employeeMap.put(8,new Employee(10,"Ajinkya10",1200D));
        Collection<Employee> values = employeeMap.values();
        

        /*List<Employee> sortedEmployees = employeeList.stream().sorted((o1, o2) -> {
            if(!o1.getId().equals(o2.getId())){
               return o1.getId().compareTo(o2.getId());
            }
            return o1.getName().compareTo(o2.getName());
        }).collect(Collectors.toList());*/
        employeeMap.entrySet().forEach(employee -> System.out.println(employee.toString()));
    }

}
