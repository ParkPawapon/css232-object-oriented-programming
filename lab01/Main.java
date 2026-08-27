public class Main {

    static class reg {
        double width;
        double length;

        // Default constructor
        reg() {
            width = 1;
            length = 1;
        }

        // Constructor with one value
        reg(double size) {
            if (size < 0) {
                throw new IllegalArgumentException("Width and length must not be negative");
            }

            width = size;
            length = size;
        }

        // Constructor with width and length
        reg(double width, double length) {
            if (width < 0 || length < 0) {
                throw new IllegalArgumentException("Width and length must not be negative");
            }

            this.width = width;
            this.length = length;
        }

        // Calculate area
        double area() {
            return width * length;
        }

        // Calculate perimeter
        double perimeter() {
            return 2 * (width + length);
        }
    }

    public static void main(String[] args) {

        // Constructor 1
        reg r1 = new reg();

        System.out.println("Rectangle 1");
        System.out.println("Width = " + r1.width);
        System.out.println("Length = " + r1.length);
        System.out.println("Area = " + r1.area());
        System.out.println("Perimeter = " + r1.perimeter());

        System.out.println();

        // Constructor 2
        reg r2 = new reg(5);

        System.out.println("Rectangle 2");
        System.out.println("Width = " + r2.width);
        System.out.println("Length = " + r2.length);
        System.out.println("Area = " + r2.area());
        System.out.println("Perimeter = " + r2.perimeter());

        System.out.println();

        // Constructor 3
        reg r3 = new reg(5, 10);

        System.out.println("Rectangle 3");
        System.out.println("Width = " + r3.width);
        System.out.println("Length = " + r3.length);
        System.out.println("Area = " + r3.area());
        System.out.println("Perimeter = " + r3.perimeter());

        System.out.println();

        // Negative value test
        try {
            reg r4 = new reg(-5, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Rectangle 4");
            System.out.println("Error = " + e.getMessage());
        }
    }
}
