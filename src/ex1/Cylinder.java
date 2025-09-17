package ex1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() { return height; }

    // Task 1.2: override getArea → surface area
    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    // Task 1.2: fix volume
    public double getVolume() {
        return super.getArea() * height; // pakai area lingkaran dari Circle
    }

    // Task 1.3: toString pakai super
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + ", height=" + height;
    }
}
