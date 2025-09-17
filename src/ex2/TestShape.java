package ex2;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println(s1);

        Circle c = new Circle(2.5, "yellow", true);
        System.out.println(c + " | Area=" + c.getArea() + ", Perimeter=" + c.getPerimeter());

        Rectangle r = new Rectangle(2.0, 3.0, "blue", false);
        System.out.println(r + " | Area=" + r.getArea() + ", Perimeter=" + r.getPerimeter());

        Square sq = new Square(4.0, "red", true);
        System.out.println(sq + " | Area=" + sq.getArea() + ", Perimeter=" + sq.getPerimeter());
    }
}
