package by.jonline.grow.programmingwithclass.exercise7;

/**
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
 * площади, периметра и точки пересечения медиан.
 */
public class SimpleClassAndObject7 {
	public static void main(String[] args) {

		double x[] = { -4, -6, 0 };
		double y[] = { -483, 0, -5 };

		Triangle tri = Triangle.compile(x, y);
		double aaa[] = tri.dot();
		System.out.print(aaa[0] + " " + aaa[1] + " " + tri.perimeter() + " " + tri.square());
	}
}

