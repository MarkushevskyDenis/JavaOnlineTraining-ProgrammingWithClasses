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

        Customer[] s = new Customer[5];

        s[0] = new Customer(0, "Markushevsky", "Denis", "Andreevich",
                "Gikalo 9", "0000 0000 0000 0000",
                "BY 25 MMBN 3012 0000 0000 0000 0000");
        s[1] = new Customer(1, "Markushevsky", "Andrey", "Andreevich",
                "Gikalo 9", "0000 0000 0000 0056",
                "BY 25 MMBN 3012 0000 0000 0000 0034");
        s[2] = new Customer(2, "Markushevsky", "Andrey", "Denisovich",
                "Gikalo 9", "0000 0000 0000 0023",
                "BY 25 MMBN 3012 0000 0000 0000 0000");
        s[3] = new Customer(3, "Markushevsky", "Denis", "Denisovich",
                "Gikalo 9", "0000 0000 0000 0011",
                "BY 25 MMBN 3012 0000 0000 0000 0000");
        s[4] = new Customer(4, "Andr", "Denis", "Andreevich",
                "Gikalo 9", "0000 0000 0000 0045",
                "BY 25 MMBN 3012 0000 0000 0000 0000");

        Bank bank = new Bank(s);
        bank.out();
        System.out.println("--------------------");
        bank.outCard("0000 0000 0000 0023", "0000 0000 0000 0023");

        System.out.println("--------------------");
        bank.sortABC();
    }

}




