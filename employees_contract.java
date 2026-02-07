package inheritance;


 class ContractEmployee extends Employees{
    private int contractDuration; // in months

    public ContractEmployee(int employeeId, String name, double basicSalary,
                            int contractDuration) {
        super(employeeId, name, basicSalary);
        this.contractDuration = contractDuration;
    }

    public double calculateTotalSalary() {
        return basicSalary + calculateBonus();
    }

    public void displayContractEmployee() {
        super.displayEmployees();
        System.out.println("Contract Duration: " + contractDuration + " months");
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}
