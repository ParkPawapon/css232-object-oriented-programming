import java.util.Locale;

public final class PayrollApp {
    private PayrollApp() {
    }

    public static void main(String[] args) {
        Employee[] employees = {
            new SalariedEmployee("E001", "Mina", 42_000.00),
            new HourlyEmployee("E002", "Narin", 160.00, 175.00)
        };

        double total = 0.00;

        for (Employee employee : employees) {
            double pay = employee.calculatePay();
            System.out.printf(Locale.US, "%s pay=%.2f%n", employee.summary(), pay);
            total += pay;
        }

        System.out.printf(Locale.US, "total=%.2f%n", total);
    }
}
