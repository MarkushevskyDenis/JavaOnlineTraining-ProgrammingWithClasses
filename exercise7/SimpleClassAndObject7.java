package by.jonline.grow.programmingwithclass.exercise7;

/**
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
 * площади, периметра и точки пересечения медиан.
 */
public class SimpleClassAndObject7 {
    public static void main(String[] args) {

        Dot[] dots = new Dot[3];

        dots[0] = new Dot(-4,-483);
        dots[1] = new Dot(-6,0);
        dots[2] = new Dot(0,-5);

        Triangle tri = Triangle.compile(dots);

        System.out.print(tri.dot() + " " + tri.perimeter() + " " + tri.square());
    }
}

