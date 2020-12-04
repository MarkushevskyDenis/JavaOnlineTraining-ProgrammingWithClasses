package by.jonline.grow.programmingwithclass.exercise7;

public class Triangle {
	private double[] x;
	private double[] y;

	private double a;
	private double b;
	private double c;

	private Triangle() {

	}

	private Triangle(double[] x, double y[]) {
		this.x = x;
		this.y = y;

		a = Math.sqrt(Math.pow(x[2] - x[0], 2) + Math.pow(y[2] - y[0], 2));
		b = Math.sqrt(Math.pow(x[2] - x[1], 2) + Math.pow(y[2] - y[1], 2));
		c = Math.sqrt(Math.pow(x[1] - x[0], 2) + Math.pow(y[1] - y[0], 2));

	}

	public static Triangle compile(double[] x, double y[]) {
		return new Triangle(x, y);
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

	public double[] dot() {

		double[] dot = new double[2];

		double centerX;
		double centerY;

		centerX = x[1] - (x[1] - x[0]) / 2;
		centerY = y[1] - (y[1] - y[0]) / 2;

		dot[0] = x[2] - (x[2] - centerX) * 2.0 / 3;
		dot[1] = y[2] - (y[2] - centerY) * 2.0 / 3;

		return dot;
	}

}
