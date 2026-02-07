package inheritance;



public class Employees
{
    protected int employeeId;
    protected String name;
    protected double basicSalary;

    // Constructor
    public Employees(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Bonus = 10% of basic salary
    public double calculateBonus() {
        return basicSalary * 0.10;
    }

    // Display employee details
    public void displayEmployees() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}
