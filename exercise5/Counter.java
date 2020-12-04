package by.jonline.grow.programmingwithclass.exercise5;

public class Counter {
	private int count;
	private int max;
	private int min;

	public Counter() {
		count = 0;
		max = 10;
		min = 0;
	}

	public Counter(int count, int max, int min) {
		if (max < min) {
			int swap = max;
			max = min;
			min = swap;
		}

		this.count = count;
		this.max = max;
		this.min = min;
	}

	public boolean encrease() {
		if (count == max) {
			// System.out.println("достигнут максимум");
			return false;
		}

		count++;
		return true;
	}

	public boolean reduce() {
		if (count == min) {
			// System.out.println("достигнут минимум");
			return false;
		}

		count--;
		return true;
	}

	public int getCount() {
		return count;
	}
}
