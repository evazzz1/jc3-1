package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.example.Employee.hireDateComparator;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(2020, 5, 10));
        employees.add(new Employee(2018, 9, 20));
        employees.add(new Employee(2019, 3, 15));

        employees.sort(hireDateComparator);
        //Выводим по очереди сотрудников, сначала тех, кто работает дольше
        employees.forEach(employee -> System.out.println("Работника наняли " + employee.hireYear + "-" + employee.hireMonth + "-" + employee.hireDay));
    }
}