public final class SalariedEmployee extends Employee {
    private final double monthlySalary;

    public SalariedEmployee(String id, String name, double monthlySalary) {
        super(id, name);

        if (monthlySalary < 0) {
            throw new IllegalArgumentException("monthlySalary must not be negative");
        }

        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}
