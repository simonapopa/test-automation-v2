package StringExercises;

import OtherMethods.ReadNumbersFromKeyboard;

public class StringMain {
    public static void main(String args[]) {
        ReadNumbersFromKeyboard read = new ReadNumbersFromKeyboard();
        StringMethods sm = new StringMethods();

        //String exercise: 1. Create an empty StringBuffer
        //sm.generateEmptyStringBuilder();

        //String exercise: 2. Append “blessings”
        //sm.readStringBuilder(sm.appendStringBuilder(sm.generateEmptyStringBuilder()));

        //String exercise: 3. Insert “Good ” in the begging
        //sm.readStringBuilder(sm.insertNewString(sm.appendStringBuilder(sm.generateEmptyStringBuilder())));

        //String exercise: 4. Delete the first o
        //sm.readStringBuilder(sm.deleteGivenString(sm.appendStringBuilder(sm.generateEmptyStringBuilder())));
        //sm.readStringBuilder(sm.deleteGivenString(sm.insertNewString(sm.appendStringBuilder(sm.generateEmptyStringBuilder()))));

        //String exercise: 5. Append “ be with you”
        //sm.readStringBuilder(sm.appendStringBuilder(sm.generateEmptyStringBuilder()));
        sm.readStringBuilder(sm.appendMultipleStrings(sm.insertNewString(sm.appendStringBuilder(sm.generateEmptyStringBuilder()))));

        //sm.readStringBuilder((sm.appendMultipleStrings(sm.generateEmptyStringBuilder())));

        //sm.readStringBuilder(sm.appendStringBuilder(sm.generateEmptyStringBuilder()));


    }
}
