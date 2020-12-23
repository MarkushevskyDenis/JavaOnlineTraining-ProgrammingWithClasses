package by.jonline.grow.programmingwithclass.exercise8;


public class Customer {

    private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String address;
    private String bankCard;
    private String bankAccount;

    public Customer() {

    }

    public Customer(int id, String lastName, String firstName, String patronymic, String address, String bankCard,
                    String bankAccount) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        setBankCard(bankCard);
        setBankAccount(bankAccount);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {

        if (bankCard.matches("(\\d{4} ){3}\\d{4}")) {
            this.bankCard = bankCard;
        } else {
            System.out.println("error");
        }
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {

        if (bankAccount.matches("BY \\d{2} \\w{4} \\d{4} (\\d{4} ){3}\\d{4}")) {
            this.bankAccount = bankAccount;
        } else {
            System.out.println("error");
        }
    }

    public String getFullName() {
        return lastName + " " + firstName + " " + patronymic;
    }

    public static boolean greaterBankCard(String first, String second) {

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

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName
                + ", patronymic=" + patronymic + ", adress=" + address + ", bankCard=" + bankCard + ", bankAccount="
                + bankAccount + "]";
    }

}
