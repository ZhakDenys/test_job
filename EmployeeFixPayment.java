/*
 Class for employee with fixed payment
 */

public class EmployeeFixPayment extends Employee{
    public EmployeeFixPayment(String name, int salary) {
        super(name, salary);
    }

    public double averageMonthSalary() {
        return getSalary();
    }
}
