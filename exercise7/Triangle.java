package by.jonline.grow.programmingwithclass.exercise7;

public class Triangle {
    private Dot[] dots;

    private double a;
    private double b;
    private double c;

    private Triangle() {

    }

    private Triangle(Dot[] dots) {
        this.dots = dots;

        a = Math.sqrt(Math.pow(dots[2].getX() - dots[0].getX(), 2) + Math.pow(dots[2].getY() - dots[0].getY(), 2));
        b = Math.sqrt(Math.pow(dots[2].getX() - dots[1].getX(), 2) + Math.pow(dots[2].getY() - dots[1].getY(), 2));
        c = Math.sqrt(Math.pow(dots[1].getX() - dots[0].getX(), 2) + Math.pow(dots[1].getY() - dots[0].getY(), 2));

    }

    public static Triangle compile(Dot[] dots) {
        if (dots.length != 3 || dots.length != 3) {
            System.out.println("объект не был создан");
            return null;
        }
        return new Triangle(dots);
    }

    public double square() {

        double p;
        double s;

        p = (a + b + c) / 2;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return s;

    }

    public double perimeter() {
        return a + b + c;
    }

    public Dot dot() {                //точка пересечения медиан

        Dot dot = new Dot();
        Dot center = new Dot();

        center.setX(dots[1].getX() - (dots[1].getX() - dots[0].getX()) / 2);
        center.setY(dots[1].getY() - (dots[1].getY() - dots[0].getY()) / 2);

        dot.setX(dots[2].getX() - (dots[2].getX() - center.getX()) * 2.0 / 3);
        dot.setY(dots[2].getY() - (dots[2].getY() - center.getY()) * 2.0 / 3);

        return dot;
    }

}
