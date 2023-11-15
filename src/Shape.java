public abstract class Shape {
private int length;
private int width;

    public Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Shape() {

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public abstract String toString2();

    public  abstract int getPerimetr(
    );

    @Override
    public String toString() {
        return
                "length=" + length +
                ", width=" + width +
                '}';
    }
}


