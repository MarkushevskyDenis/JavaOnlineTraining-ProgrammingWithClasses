package by.jonline.grow.programmingwithclass.exercise2;

/**
 * Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
 * конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
 * класса.
 */

public class SimpleClassAndObject2 {
	public static void main(String[] args) {

	}
}

class Test2{
	
	private int var1;
	private int var2;
	
	public Test2(int var1, int var2){
		this.var1 = var1;
		this.var2 = var2;
	}
	
	public Test2(){
		var1 = 1;
		var2 = 2;
	}

	public int getVar1() {
		return var1;
	}

	public void setVar1(int var1) {
		this.var1 = var1;
	}

	public int getVar2() {
		return var2;
	}

	public void setVar2(int var2) {
		this.var2 = var2;
	}
	
	
	
}