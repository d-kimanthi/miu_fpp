package lab4.problem3;

import java.util.Arrays;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("Temu", "Bat", "123-45-6789", 800.0),
                new HourlyEmployee("John", "Doe", "234-56-7890", 15.0, 40.0),
                new CommissionEmployee("Bob", "Tom", "345-67-8901", 10000.0, 6.0),
                new BasePlusCommissionEmployee("Alice", "Wonderland", "456-78-9012", 5000.0, 4.0, 300.0),
                new SalariedEmployee("David", "Kimanthi", "567-89-0123", 1200.0)
        };

        System.out.println("All Employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // Test the findSalaryList method
        double maxSalary = 700.0;
        Employee[] lowSalaryEmployees = findSalaryList(employees, maxSalary);

        System.out.println("\nEmployees with salary less than $" + maxSalary + ":");
        System.out.println("========================================================");

        if (lowSalaryEmployees.length == 0) {
            System.out.println("None");
        } else {
            for (Employee emp : lowSalaryEmployees) {
                System.out.println(emp);
            }
        }
    }

    public static Employee[] findSalaryList(Employee[] col, double salary) {
        if (col == null) {
            return new Employee[0];
        }

        int count = 0;

        for (Employee emp : col) {
            if (emp != null && emp.getPayment() < salary) {
                count ++;
            }
        }

        Employee[] employees = new Employee[count];
        count = 0;

        for (Employee emp : col) {
            if (emp != null && emp.getPayment() < salary) {
                employees[count] = emp;
                count ++;
            }
        }

        return employees;
    }
}