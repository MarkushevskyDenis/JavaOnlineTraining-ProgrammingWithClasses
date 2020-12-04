package by.jonline.grow.programmingwithclass.exercise12;

public class CarLogic {
	
	public static boolean rand() {
		int number;
		number = (int) (Math.random() * 50);
		if (number == 1) {
			return true;
		}
		return false;
	}

	public static Wheel findWheelByName(Wheel[] wheel, String wheelName) {
		
		for (int i = 0; i < 5; i++) {

			if (wheel[i].getName().equals(wheelName)) {
				return wheel[i];
			}
			
		}
		
		System.out.println("check wheelname:\nfront left\nfront right\nrear left\nrear right\nspare wheel");
		return null;
	}
}
