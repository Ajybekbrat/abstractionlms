public class Square extends  Shape{
    private  int f;


    public Square(int length, int width) {

        super(length, width);
    }


    public Square(int length, int width, int f) {
        super(length, width);
        this.f = f;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    @Override
    public String toString2() {
        return "Square{" +
                "f=" + f +
                '}';
    }

    @Override
    public int getPerimetr() {
        System.out.println("   square: ");
        System.out.print(toString());
        System.out.println(toString2());
        double result = getLength()+getWidth()*2;
        return (int) result;

    }


    }

