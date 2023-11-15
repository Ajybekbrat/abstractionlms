public class Triangle extends Shape {
    public Triangle(int length, int width) {
        super(length, width);
    }

    public Triangle() {
    }

    @Override
    public String toString2() {
        return null;
    }

    @Override
    public int getPerimetr() {
        System.out.println("   triangle: ");
        System.out.print(toString());
        System.out.println(toString2());
        double result = getWidth() * getLength();
        return (int) result;

    }







    }






