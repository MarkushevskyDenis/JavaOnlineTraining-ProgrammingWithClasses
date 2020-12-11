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

	public void increase() {

		if (hasIncrease()) {
			count++;
		}

	}

	public void reduce() {

		if (hasReduce()) {
			count--;
		}

	}

	public boolean hasReduce(){

		if (count == min) {
			return false;
		}else{
			return true;
		}

	}

	public boolean hasIncrease(){

		if (count == max) {
			return false;
		}else{
			return true;
		}

	}

	public int getCount() {
		return count;
	}
}
