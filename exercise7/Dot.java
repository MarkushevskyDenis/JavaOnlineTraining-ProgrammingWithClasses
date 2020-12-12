package by.jonline.grow.programmingwithclass.exercise7;

public class Dot {
    private double x;
    private double y;

    public Dot(){

    }

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return  "x=" + x +
                ", y=" + y;
    }
}
