package StringExercises;

import ArraysListsExercises.ReadNumbersFromKeyboard;

public class StringMain {
    public static void main(String args[]) {
        ReadNumbersFromKeyboard read = new ReadNumbersFromKeyboard();
        StringMethods sm = new StringMethods();

        //sm.readStringBuilder(sm.appendStringBuilder(sm.generateEmptyStringBuilder()));

        //sm.readStringBuilder(sm.insertNewString(sm.appendStringBuilder(sm.generateEmptyStringBuilder())));
        //sm.generateEmptyStringBuilder();

        sm.readStringBuilder((sm.appendMultipleStrings(sm.generateEmptyStringBuilder())));

        //sm.readStringBuilder(sm.appendStringBuilder(sm.generateEmptyStringBuilder()));

    }
}
