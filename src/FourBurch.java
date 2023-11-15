public class FourBurch extends Shape {
    public FourBurch(int length, int width) {
        super(length, width);
    }

    @Override
    public String toString2() {
        return null;
    }

    @Override
    public int getPerimetr() {

        System.out.println("   FourBurch:");
        System.out.println(toString()
        );
        double ress = getLength()+ getLength()*2;
        return (int) ress;
    }
}
