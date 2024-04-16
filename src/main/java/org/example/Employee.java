package org.example;

import java.util.Comparator;
public class Employee {
    public int hireYear;
    public int hireMonth;
    public int hireDay;

    public Employee(int hireYear, int hireMonth, int hireDay) {
        this.hireYear = hireYear;
        this.hireMonth = hireMonth;
        this.hireDay = hireDay;
    }
    public static Comparator<Employee> hireDateComparator = Comparator.comparingInt((Employee e) -> e.hireYear)
            .thenComparingInt((Employee e) -> e.hireMonth)
            .thenComparingInt((Employee e) -> e.hireDay);
}