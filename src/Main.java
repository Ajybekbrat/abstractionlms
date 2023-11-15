// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(12, 10);

        System.out.println(triangle.getPerimetr());
        System.out.println("-------------------------------------");
        Square square = new Square(10,14, 2);
        System.out.println(square.getPerimetr());
        System.out.println("-------------------------------------");
        Trapezoid trapezoid = new Trapezoid(4,5,8);
        System.out.println(trapezoid.getPerimetr());
        System.out.println("-------------------------------------");
        FourBurch fourBurch = new FourBurch(5, 8);
        System.out.println(fourBurch.getPerimetr());
        System.out.println("-------------------------------------");
        Pentagon pentagon = new Pentagon(6);
        System.out.println(pentagon.getPerimetr());

    }
}


