import ArraysListsExercises.CollectionsMethods;
import ArraysListsExercises.ReadNumbersFromKeyboard;

public class MenuControl {


    public CollectionsMethods collection = new CollectionsMethods();
    public String text = "Introduceti o valoare mai mica decat 100: ";
    public String listText = "Introduceti dimensiunea listei: ";
    ReadNumbersFromKeyboard read = new ReadNumbersFromKeyboard();

    protected void displayMenu() {
        int value;
        do {

            displayMenuOption();
            value = read.readIntegerNumberFromKey();
            runOption(value);

        }
        while (value != 0);
    }


    private void runOption(int value) {
        switch (value) {
            case 1:
//                collection.getArrayToHundred(read.readNumberFromKey(text));
                break;
            case 2:
//                collection.printToHundredWhile(collection.readIntegerNumberFromKey(text));
                break;

            case 3:
//                System.out.println(
//                        collection.getArrayToHundred(
//                                collection.readListFromKey(
//                                        collection.readIntegerNumberFromKey(listText))));
                break;

        }
    }

    private void displayMenuOption() {
        System.out.println("Bine ai venit, te rugam selecteaza o optiune dintre cele listate mai jos: ");
        System.out.println("1. For loop: Printeaza toate numerele de la valoarea data pana la 100");
        System.out.println("2. While loop: Printeaza toate numerele de la valoarea data pana la 100");
        System.out.println("3. Afisarea numerelor pare dintr-o lista ");

    }
}

