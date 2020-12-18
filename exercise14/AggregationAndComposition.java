package by.jonline.grow.programmingwithclass.exercise14;

/**
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность
 * блокировки/разблокировки счета. Реализовать поиск и сортировку счетов.
 * Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим
 * положительный и отрицательный балансы отдельно.
 */
public class AggregationAndComposition {
	public static void main(String[] args) {
		Bank bank = new Bank("a");
		Customer customer = new Customer("Denis", "Markushevsky", "Andreevich");
		Customer customer1 = new Customer("Denis", "Markushevsky", "Andreevich");

		bank.createAccount(customer1);
		bank.createAccount(customer);

		bank.activateAccount(customer1, "a10");
		bank.activateAccount(customer, "a01");

		bank.addMoney(customer1,"a10", 500);
		bank.getMoney(customer,"a01",500);


		System.out.println(bank.allMoney(customer));
		System.out.println(bank.allNegativeMoney(customer));
		System.out.println(bank.allPositiveMoney(customer));


		System.out.println(bank.allMoney(customer1));
		System.out.println(bank.allNegativeMoney(customer1));
		System.out.println(bank.allPositiveMoney(customer1));

	}
}
