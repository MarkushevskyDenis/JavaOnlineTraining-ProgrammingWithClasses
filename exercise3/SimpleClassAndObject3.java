package by.jonline.grow.programmingwithclass.exercise3;

/**
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
 * из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 * номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class SimpleClassAndObject3 {
	public static void main(String[] args) {

		int rating[][] = { { 1, 2, 3, 4 }, { 9, 9, 9, 9, 9 }, { 9, 10, 9, 10, 9 }, { 1, 6, 9, 7, 3 },
				{ 9, 10, 9, 9, 9 }, { 10, 0, 0, 0, 0 }, { 10, 10, 10, 9, 0 }, { 10, 10, 10, 10, 10 }, { 0, 0, 0, 0, 0 },
				{ 9, 9, 5, 10, 10, 1 } };

		Student[] student = new Student[10];
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student("Маркушевский" + i, "Д.А." + i, "722402" + i, rating[i]);
		}

		for (int i = 0; i < student.length; i++) {
			if (student[i].excellentStudent()) {
				System.out.println(student[i].getLastName() + " " + student[i].getGroup());
			}
		}
		

	}
}

