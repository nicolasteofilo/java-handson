package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        double amountToIncrease = grossSalary * (percentage / 100);
        grossSalary += amountToIncrease;
    }

    public String toString() {
        return String.format(
                "%s, $%.2f",
                this.name, this.netSalary()
        );
    }
}
