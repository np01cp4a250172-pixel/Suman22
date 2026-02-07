package inheritance;



public class PermanentEmployee extends Employees
{
  
    private double hra;
    private double da;

    public PermanentEmployee(int employeeId, String name, double basicSalary,
                             double hra, double da) {
        super(employeeId, name, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    // Calculate total salary
    public double calculateTotalSalary() {
        return basicSalary + hra + da + calculateBonus();
    }

    public void displayPermanentEmployee() {
        super.displayEmployees();
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}
