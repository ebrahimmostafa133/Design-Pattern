package SOLID;

/**
 * S - Single Responsibility Principle (SRP)
 *
 * Concept:
 * A class should have one, and only one, reason to change.
 * This means that a class should have only one job or responsibility.
 */

// ==========================================
// WRONG IMPLEMENTATION (Violating SRP)
// ==========================================
/*
 * In this wrong implementation, the EmployeeWrong class has multiple responsibilities:
 * 1. Business logic (salary management)
 * 2. Database operations (saveToDatabase)
 * 3. Reporting logic (generateReport)
 * 
 * If the database connection logic changes, this class must change.
 * If the reporting format changes, this class must change as well.
 * This violates the Single Responsibility Principle.
 */
class EmployeeWrong {
    private String name;
    private double salary;

    public EmployeeWrong(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Responsibility 1: Business Logic
    public double calculateBonus() {
        return salary * 0.1;
    }

    // Responsibility 2: Database Operations
    public void saveToDatabase() {
        System.out.println("Saving " + name + " to database...");
    }

    // Responsibility 3: Formatting / Reporting
    public void generateReport() {
        System.out.println("Generating report for employee: " + name);
    }
}

// ==========================================
// CORRECT IMPLEMENTATION (Adhering to SRP)
// ==========================================
/*
 * In the correct implementation, we split the responsibilities into different classes.
 * Each class has a single responsibility and only one reason to change.
 */

// Purely stores data
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }
}

// Responsibility 1: Business Logic (Calculations)
class EmployeeBonusCalculator {
    public double calculateBonus(Employee employee) {
        return employee.getSalary() * 0.1;
    }
}

// Responsibility 2: Database Operations
class EmployeeRepository {
    public void save(Employee employee) {
        System.out.println("Saving " + employee.getName() + " to database via Repository...");
    }
}

// Responsibility 3: Formatting / Reporting
class EmployeeReportGenerator {
    public void generateReport(Employee employee) {
        System.out.println("Generating precise report for employee: " + employee.getName());
    }
}

public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        // Creating the employee
        Employee emp = new Employee("Ahmed", 5000);
        
        // Single Responsibility: Calculating Bonus
        EmployeeBonusCalculator calculator = new EmployeeBonusCalculator();
        System.out.println("Bonus: " + calculator.calculateBonus(emp));
        
        // Single Responsibility: Saving to DB
        EmployeeRepository repo = new EmployeeRepository();
        repo.save(emp);
        
        // Single Responsibility: Generating Report
        EmployeeReportGenerator reporter = new EmployeeReportGenerator();
        reporter.generateReport(emp);
    }
}
