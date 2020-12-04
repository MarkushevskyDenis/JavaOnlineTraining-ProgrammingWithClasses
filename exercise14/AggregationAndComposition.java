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

		customer.createAccount(bank);
		customer.createAccount(bank);
		customer.createAccount(bank);


		customer.blockAccount("a", bank);
		customer.activateAccount("a0", bank);
		customer.activateAccount("a1", bank);
		customer.activateAccount("a", bank);


		customer.addMoney("a0", bank, 100);
		customer.addMoney("a0", bank, 100);

		customer.getMoney("a", bank, 150);
		customer.getMoney("a1", bank, 100);
		customer.getMoney("a1", bank, 100);

		customer.addMoney("a", bank, 100);
		customer.getMoney("a2", bank, 100);
		customer.getMoney("a2", bank, 100);
		customer.addMoney("a2", bank, 100);

		
		System.out.println(customer.allMoney());
		System.out.println(customer.allNegativeMoney());
		System.out.println(customer.allPositiveMoney());

	}
}
