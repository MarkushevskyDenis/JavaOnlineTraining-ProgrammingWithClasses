package by.jonline.grow.programmingwithclass.exercise12;

public class UserViewAction {

	public void outModel(Car car) {
		System.out.println("model = " + car.getModel());
	}

	public void checkWheels(Car car) {

		boolean q = true;
		Wheel[] wheel = car.getWheels();

		for (int i = 0; i < 5; i++) {
			if (wheel[i].getPuncture() == true) {
				System.out.println(wheel[i].getName() + " is punctured");
				q = false;
			}
		}

		if (q) {
			System.out.println("All ok");
		}

	}

}
