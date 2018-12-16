package MenuApp;

import ArraysListsExercises.CollectionsMethods;
import IfSwitchExercises.IfSwitchMethods;
import LoopExercises.LoopMethods;
import OtherMethods.Calculator;
import OtherMethods.ReadNumbersFromKeyboard;

public class MenuControl {
    private CollectionsMethods coll = new CollectionsMethods();
    private Calculator calc = new Calculator();
    private IfSwitchMethods ism = new IfSwitchMethods();
    LoopMethods op = new LoopMethods();
    private ReadNumbersFromKeyboard read = new ReadNumbersFromKeyboard();

    private String text = "Introduceti o valoare mai mica decat 100: ";
    private String listText = "Introduceti dimensiunea listei: ";

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
                calc.adunare();
                break;
            case 2:
                calc.scadere(read.readLongNumberFromKey(), read.readLongNumberFromKey());
                break;
            case 3:
                calc.inmultire(read.readLongNumberFromKey(), read.readLongNumberFromKey());
                break;
            case 4:
                calc.impartire(read.readLongNumberFromKey(), read.readLongNumberFromKey());
                break;
            case 5:
                calc.secondExercise();
                break;
            case 6:
                calc.getNumbers(read.readLongNumberFromKey(), read.readLongNumberFromKey());
                break;
            case 7:
                calc.getNumbersProduct(read.readFloatNumberFromKey(), read.readFloatNumberFromKey());
                break;
            case 8:
                calc.getNumbers(read.readLongNumberFromKey(), read.readLongNumberFromKey(), read.readLongNumberFromKey());
                break;
            case 9:
                System.out.println(calc.getYourName(read.getStringFromKey("Enter a name:")));
                break;
            case 10:
                calc.forthExercise();
                break;
            case 11:
                calc.printFacePattern();
                break;
            case 12:
                calc.nineExercise(read.readFloatNumberFromKey());
                break;
            case 13:
                calc.tenthExercise(read.readDoubleNumberFromKey());
                break;
            case 14:
                calc.eleventhExercise(read.readIntegerNumberFromKey(), read.readIntegerNumberFromKey(), read.readIntegerNumberFromKey());
                break;
            case 15:
                System.out.println("The bigger number is " + ism.getMax(read.readIntegerNumberFromKey(), read.readIntegerNumberFromKey()));
                break;
            case 16:
                System.out.println(ism.matchText(read.readStringFromKey()));
                break;
            case 17:
                System.out.println(ism.equalOrHigherThanTwo(read.readDoubleNumberFromKey()));
                break;
            case 18:
                ism.getInput(read.readStringFromKey(), read.readIntegerNumberFromKey());
                break;
            case 19:
                System.out.println(ism.checkInput(read.readIntegerNumberFromKey()));
                break;
            case 20:
                System.out.println(ism.getIntComp(read.readIntegerNumberFromKey()));
                break;
            case 21:
                ism.getPressedNr(read.readIntegerNumberFromKey());
                break;
            case 22:
                ism.checkIfEvenNr(read.readIntegerNumberFromKey());
                break;
            case 23:
                System.out.println(ism.checkIfCanVote(read.readDoubleNumberFromKey()));
                break;
            case 24:
                System.out.println(ism.printGreatestNumber(read.readDoubleNumberFromKey(), read.readDoubleNumberFromKey(), read.readDoubleNumberFromKey()));
                break;
            case 25:
                op.getTwoNumbers(read.readIntegerNumberFromKey(), read.readIntegerNumberFromKey());
                break;
            case 26:
                op.givenNumberHundred(read.readIntegerNumberFromKey());
                break;
            case 27:
                op.outputLikeTreeSimplified(read.readCharFromKey());
                break;
            case 28:
                op.sumAndAverage();
                break;
            case 29:
                op.getNumberWithWhile(read.readIntegerNumberFromKey());
                break;
            case 30:
                op.getTwoNumbersWithWhile(read.readIntegerNumberFromKey(), read.readIntegerNumberFromKey());
                break;
            case 31:
                op.getTwoNumbersWithDoWhile(read.readIntegerNumberFromKey(), read.readIntegerNumberFromKey());
                break;
            case 32:
                op.sumTwoNumbersAndComputeAverage();
                break;
            case 33:
                op.getSumOfOddNumbersAndComputeAverage();
                break;
            case 34:
                op.getSumOfNumbersDivisibleBySevenAndComputeAverage();
                break;
            case 35:
                op.getTwentyFibonaciNumbers();
                break;
            case 36:
                op.CozaLozaWoza();
                break;
            case 37:
                coll.displayArrayReadFromKey(coll.getArrayToHundred());
                break;
            case 38:
                System.out.println(coll.getAverageFromArray(coll.readArrayFromKey(read.readDoubleNumberFromKey())));
                break;
            case 39:
                System.out.println(coll.getSpecificValue(coll.readArrayFromKey(read.readIntegerNumberFromKey())));
                break;
            case 40:
                System.out.println("Index is " + coll.getIndexOfArray(coll.readArrayFromKey(read.readIntegerNumberFromKey())));
                break;
            case 41:
                coll.displayArrayReadFromKey(coll.removeElementFromArray(coll.readArrayFromKey(read.readIntegerNumberFromKey())));
                break;
            case 42:
                System.out.println(coll.getSecondSmallestElementFromArray(coll.readArrayFromKey(read.readIntegerNumberFromKey())));
                break;
            case 43:
                System.out.println(coll.getHighestNumberFromList(coll.readListFromKey(read.readIntegerNumberFromKey())));
                break;
            case 44:
                System.out.println(coll.getEvenNumbers(coll.readListFromKey(read.readIntegerNumberFromKey())));
                break;
            case 45:
                System.out.println(coll.removeOddNumbers(coll.readListFromKey(read.readIntegerNumberFromKey())));
                break;
            case 46:
                coll.getListIterated(coll.readListFromKey(read.readIntegerNumberFromKey()));
                break;
            case 47:
                System.out.println(coll.getSortedList(coll.readListFromKey(read.readIntegerNumberFromKey())));
                break;
            case 48:

                break;
        }
    }

    private void displayMenuOption() {
        System.out.println("Bine ai venit, te rugam selecteaza o optiune dintre cele listate mai jos: ");
//        System.out.println("1. For loop: Printeaza toate numerele de la valoarea data pana la 100");
//        System.out.println("2. While loop: Printeaza toate numerele de la valoarea data pana la 100");
//        System.out.println("3. Afisarea numerelor pare dintr-o lista ");
        System.out.println("Capitolul 1 - exercitii:");
        System.out.println("1. Adunarea numerelor");
        System.out.println("2. Scaderea a 2 numere");
        System.out.println("3. Inmultimrea a 2 numere");
        System.out.println("4. Impartirea a 2 numere");
        System.out.println("5. Adunarea si scaderea a mai multor tipuri de variabile");
        System.out.println("6. Citeste 2 numere si le imparte");
        System.out.println("7. Citeste 2 numere float si calculeaza produsul lor");
        System.out.println("8. Citeste 3 numere long si calculeaza media lor");
        System.out.println("9. Introdu-ti numele");
        System.out.println("10. Multiple calcule cu valori definite");
        System.out.println("11. Printeaza fata ta");
        System.out.println("12. Converteste temperatura din Fahrenheit in Celsius");
        System.out.println("13. Converteste un numar citit de la tastatura din inches in metri");
        System.out.println("14. Citeste ore, minute, secunde de la tastatura si returneaza distanta");
        System.out.println("Capitolul 3 - exercitii:");
        System.out.println("15. Cel mai mare numar dintre 2 date de la tastatura");
        System.out.println("16. In functie de textul introdus se afiseaza un mesaj diferit");
        System.out.println("17. Se verifica nr introdus de la tastatura daca este mai mic sau mai mare ca 2");
        System.out.println("18. Se verifica stringul si numarul introdus de la tastatura");
        System.out.println("19. Afiseaza cantitatea de zapada in centimetri");
        System.out.println("20. Se compara numarul introdus de la tastatura");
        System.out.println("21. Se afiseaza numarul apasat de la tastatura");
        System.out.println("22. Verifica daca numarul e par sau nu");
        System.out.println("23. In functie de varsta introdusa, se afiseaza un mesaj daca poti sau nu vota");
        System.out.println("24. Se compara 2 numere de la tastatura si se afiseaza cel mai mare dintre ele");
        System.out.println("Capitolul 4 - exercitii:");
        System.out.println("25. Numara invers cu for loop");
        System.out.println("26. Afiseaza toata nuemere incepand de la cel introdus si pana la 100");
        System.out.println("27. Pentru caracterul introdus se printeaza un brad inversat");
        System.out.println("28. Afiseaza suma numerelor de la 1 la 100");
        System.out.println("29. Citeste de la cel mai mare la cel mai mic, dintre 2 numere introduse de la tastatura cu while loop");
        System.out.println("30. a 2a metoda ptr 29");
        System.out.println("31. 29 cu do while");
        System.out.println("32. Suma dintre doua numere si media lor");
        System.out.println("33. Suma numerelor impare si media lor");
        System.out.println("34. Se insumeaza numai numerele divizibile cu 7 de la 1 la 100 si media lor");
        System.out.println("35. Fibonaci");
        System.out.println("36. Coza loza woza");
        System.out.println("Capitolul 5 - exercitii:");
        System.out.println("37. Citeste pana la 100 cu arrays");
        System.out.println("38. Media elementelor unui array");
        System.out.println("39. Verifica daca exista un element in array cu valoarea introdusa de la tastatura");
        System.out.println("40. Afla indexul unui element din array");
        System.out.println("41. Introdu numarul ce sa fie sters din array");
        System.out.println("42. Al 2lea cel mai mic numar dintr-un array");
        System.out.println("43. Cel mai mare numar dintr-o lista");
        System.out.println("44. Determina numerele impare dintr-o lista definita de la tastatura");
        System.out.println("45. Elimina numerele impare");
        System.out.println("46. Itereaza printr-o lista incepand cu o pozitie data");
        System.out.println("47. Sorteaza o lista");
        System.out.println("Capitolul 7 - Hasp maps exercitii");
        System.out.println("48.");


        System.out.println("");


    }
}

