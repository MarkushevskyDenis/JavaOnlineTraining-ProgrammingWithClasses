package by.jonline.grow.programmingwithclass.exercise4;

public class Train {
	String end;
	int name;
	String time;

	public Train(String end, int name, String time) {
		super();
		this.end = end;
		this.name = name;
		this.time = time;
	}

	public static void sortName(Train[] train) {

		Train swap;

		for (int i = 0; i < train.length - 1; i++) {
			if (train[i].name > train[i + 1].name) {
				swap = train[i];
				train[i] = train[i + 1];
				train[i + 1] = swap;
				i = -1;
			}
		}

	}

	public static void out(Train[] train, int name) {

		for (int i = 0; i < train.length; i++) {

			if (train[i].name == name) {
				System.out.println("номер поезда " + train[i].name + "; конечный пункт " + train[i].end + "; время "
						+ train[i].time);
				return;
			}

		}

		System.out.println("ничего");

	}

	public static void sort(Train[] train) {
		Train swap;
		int i;
		for (i = 0; i < train.length - 1; i++) {

			if (train[i].end.compareTo(train[i + 1].end) > 0) { // сортировка по конечному пункту
				swap = train[i];
				train[i] = train[i + 1];
				train[i + 1] = swap;
				i = -1;
			}

		}

		i = 0;

		while (i != train.length) { // сортировка по времени

			while (i != train.length - 1 && train[i].end.equals(train[i + 1].end)) {

				if (train[i].time.compareTo(train[i + 1].time) > 0) {
					swap = train[i];
					train[i] = train[i + 1];
					train[i + 1] = swap;
					i = -1;
				}
				i++;

			}
			i++;

		}

	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [end=" + end + ", name=" + name + ", time=" + time + "]";
	}

}
