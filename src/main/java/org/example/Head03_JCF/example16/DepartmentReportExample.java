package org.example.Head03_JCF.example16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

class Employees{
    private String name;
    private String dept;
    private int salary;

    public Employees(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    public String getDept() {return dept;}
    public int getSalary() {return salary;}
    public String toString() {
        return name + "(" + dept + ", " + salary + ")";
    }
}

public class DepartmentReportExample {
    public static void main(String[] args) {
        List<Employees> emps = Arrays.asList(
                new Employees("Alice", "HR", 3000),
                new Employees("Bob", "IT", 4000),
                new Employees("Charlie", "IT", 4500),
                new Employees("Daivd", "HR", 3200),
                new Employees("Eve", "Sales", 3500)
        );

        Map<String, IntSummaryStatistics> depStats =
                emps.stream().collect(Collectors.groupingBy(
                        Employees::getDept,
                        Collectors.summarizingInt((Employees::getSalary))));

        depStats.forEach((dept, stats) -> {
            System.out.println("== " + dept + " 부서 ==");
            System.out.println("사원 수: " + stats.getCount());
            System.out.println("총 연봉: " + stats.getSum());
            System.out.println("평균 연봉: " + stats.getAverage());
            System.out.println("최대 연봉: " + stats.getMax());
            System.out.println("최소 연봉: " + stats.getMin());
        });
    }
}
