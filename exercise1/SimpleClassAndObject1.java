package by.jonline.grow.programmingwithclass.exercise1;

/**
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
 * переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
 * наибольшее значение из этих двух переменных.
 */

public class SimpleClassAndObject1 {
	public static void main(String[] args) {
		Test1 obj = new Test1();
		
		obj.setVar1(2);
		obj.setVar2(2);
		
		System.out.println(obj.sum());
		System.out.println(obj.max());

	}
}

class Test1 {

	private int var1;
	private int var2;

	public void out() {
		System.out.println("var1 = " + var1 + "; var2 = " + var2);
	}

	public void setVar1(int var1) {
		this.var1 = var1;
	}

	public void setVar2(int var2) {
		this.var2 = var2;
	}

	public int sum() {
		return var1 + var2;
	}

	public int max() {
		
		if (var1 > var2) {
			return var1;
		} else{
			return var2;
		}
		
	}

}