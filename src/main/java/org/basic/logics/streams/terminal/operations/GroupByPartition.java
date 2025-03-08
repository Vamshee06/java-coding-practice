package org.basic.logics.streams.terminal.operations;

import org.basic.logics.streams.terminal.operations.pojo.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByPartition {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "Alice", "IT", 80000),
                new Employee(2, "Bob", "HR", 60000),
                new Employee(3, "Charlie", "IT", 90000),
                new Employee(4, "David", "Finance", 75000),
                new Employee(5, "Eve", "HR", 65000),
                new Employee(6, "Frank", "Finance", 85000),
                new Employee(7, "Grace", "IT", 70000)
        );

        // 1️⃣ Group Employees by Department
        Map<String, List<Employee>> employeesByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("\n--- Employees Grouped by Department ---");
        employeesByDept.forEach((dept, empList) -> {
            System.out.println(dept + ": " + empList);
        });

        // 2️⃣ Partition Employees Based on Salary (Threshold = 75,000)
        Map<Boolean, List<Employee>> salaryPartition = employees.stream()
                .collect(Collectors.partitioningBy(emp -> emp.getSalary() > 75000));

        System.out.println("\n--- Employees Partitioned by Salary (Above & Below 75,000) ---");
        System.out.println("Above 75,000: " + salaryPartition.get(true));
        System.out.println("Below 75,000: " + salaryPartition.get(false));
    }
}