public class Pentagon extends Shape{
    private  int allSide;

    public Pentagon(int allSide) {

        this.allSide = allSide;
    }

    public int getAllSide() {
        return allSide;
    }

    public void setAllSide(int allSide) {
        this.allSide = allSide;
    }

    @Override
    public String toString() {
        return "Pentagon{" +
                "allSide=" + allSide +
                '}';
    }


    @Override
    public String toString2() {
        return null;
    }

    @Override
    public int getPerimetr() {
        System.out.println("   pentagon: ");
        System.out.println(toString());
        double ress = allSide * 5;
        return (int) ress;
    }

}
