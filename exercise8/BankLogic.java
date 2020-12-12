package by.jonline.grow.programmingwithclass.exercise8;

public class BankLogic {

    public static boolean greater(String first, String second) {

        int one;
        int two;

        first = first.replaceAll(" ", "");
        second = second.replaceAll(" ", "");

        one = Integer.parseInt(first);
        two = Integer.parseInt(second);

        if (one >= two) {
            return true;
        } else {
            return false;
        }

    }

}
