public class Filling {
    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();


        phonebook.add("Иванов", "223344");
        phonebook.add("Иванов", "22334411");
        phonebook.add("Иванов", "22334422");

        phonebook.add("Петров", "22334499");
        phonebook.add("Петров", "22334488");

        System.out.println(phonebook.get("Иванов"));
        System.out.println(phonebook.get("Петров"));

    }
}
