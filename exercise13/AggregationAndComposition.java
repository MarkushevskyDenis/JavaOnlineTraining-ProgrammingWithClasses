package by.jonline.grow.programmingwithclass.exercise13;

/**
 * Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные
 * центры.
 */

public class AggregationAndComposition {
	public static void main(String[] args) {

		Country country = new Country("Belarus", "Minsk", 207595,
				new Region("Vitebsk region", "Vitebsk", new District("Chashniki district", new City("Novolukoml"))),
				new Region("Vitebsk region", "Vitebsk", new District("Chashniki district", new City("Chashniki"))));
		
		UserViewAction view = new UserViewAction();
		
		view.outCapital(country);
		view.outCountOfRegion(country);
		view.outRegionalCenter(country);
		view.outTotalArea(country);
	}
}
