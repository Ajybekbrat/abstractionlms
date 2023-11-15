public class Trapezoid extends  Shape{
    private int h;

    public Trapezoid(int length, int width, int h) {
        super(length, width);
        this.h = h;
    }

    public Trapezoid(int h) {
        this.h = h;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    @Override
    public String toString2() {
        return "Trapezoid{" +
                "h=" + h +
                '}';
    }
    @Override
    public int getPerimetr() {


        System.out.println("   trapezoid: ");
        System.out.print(toString2());
        System.out.println(toString());
        double ressult = (getWidth() + getLength())* getH()/2;

        return (int) ressult
                ;
    }


}
