package by.jonline.grow.programmingwithclass.exercise8;

/**
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
 * и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class SimpleClassAndObject8 {
    public static void main(String[] args) {

        Customer[] customers = new Customer[5];
        customers[0] = new Customer(0, "Markushevsky", "Denis", "Andreevich",
                "Gikalo 9", "0000 0000 0000 0000",
                "BY 25 MMBN 3012 0000 0000 0000 0000");
        customers[1] = new Customer(1, "Markushevsky", "Andrey", "Andreevich",
                "Gikalo 9", "0000 0000 0000 0056",
                "BY 25 MMBN 3012 0000 0000 0000 0034");
        customers[2] = new Customer(2, "Markushevsky", "Andrey", "Denisovich",
                "Gikalo 9", "0000 0000 0000 0023",
                "BY 25 MMBN 3012 0000 0000 0000 0000");
        customers[3] = new Customer(3, "Markushevsky", "Denis", "Denisovich",
                "Gikalo 9", "0000 0000 0000 0011",
                "BY 25 MMBN 3012 0000 0000 0000 0000");
        customers[4] = new Customer(4, "Andr", "Denis", "Andreevich",
                "Gikalo 9", "0000 0000 0000 0045",
                "BY 25 MMBN 3012 0000 0000 0000 0000");

        Bank bank = new Bank(customers);
        View view = new View();
        Logic logic = new Logic();

        view.out(bank);
        System.out.println("------------------");
        logic.sortByName(bank);
        view.out(bank);
        System.out.println("------------------");
        view.outCard(bank, "0000 0000 0000 0023", "0000 0000 0000 0056");
    }

}




