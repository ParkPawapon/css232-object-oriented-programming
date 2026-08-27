public final class HourlyEmployee extends Employee {
    private final double hours;
    private final double hourlyRate;

    public HourlyEmployee(String id, String name, double hours, double hourlyRate) {
        super(id, name);

        if (hours < 0) {
            throw new IllegalArgumentException("hours must not be negative");
        }
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("hourlyRate must not be negative");
        }

        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hours * hourlyRate;
    }
}
