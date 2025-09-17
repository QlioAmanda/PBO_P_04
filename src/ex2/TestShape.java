package ex2;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println(s1);

        Circle c = new Circle(2.5, "yellow", true);
        System.out.println(c);

        Rectangle r = new Rectangle(2.0, 3.0, "blue", false);
        System.out.println(r);

        Square sq = new Square(4.0, "red", true);
        System.out.println(sq);
    }
}
