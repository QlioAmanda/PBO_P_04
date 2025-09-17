package ex1;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println(c1);

        Cylinder c2 = new Cylinder(10.0);
        System.out.println(c2);

        Cylinder c3 = new Cylinder(2.0, "blue", 5.0);
        System.out.println(c3);

        System.out.println("Volume c3 = " + c3.getVolume());
        System.out.println("Surface Area c3 = " + c3.getArea());
    }
}
