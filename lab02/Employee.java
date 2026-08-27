public abstract class Employee {
    private final String id;
    private final String name;

    protected Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String summary() {
        return id + " - " + name;
    }

    public abstract double calculatePay();
}
