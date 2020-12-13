package by.jonline.grow.programmingwithclass.exercise11;

/**
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
 * консоль текст, заголовок текста.
 */

public class AggregationAndComposition {
	public static void main(String[] args) {

		Text text = new Text("Тестовый текст. Тестовый текст1. Тестовый текст2. Тестовый текст3.", "Текст");

		text.getText();
		text.addSentence("Тестовый текст4.");
		text.getText();
		text.getTitle();
	}
}
