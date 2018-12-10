package StringExercises;

import ArraysListsExercises.ReadNumbersFromKeyboard;

public class StringMethods {
    ReadNumbersFromKeyboard read = new ReadNumbersFromKeyboard();

    //String exercise: 1. Create an empty StringBuffer
    public StringBuilder generateEmptyStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder;
    }

    //String exercise: print string builder
    public void readStringBuilder(StringBuilder stringBuilder) {
        System.out.println("String builder is: " + stringBuilder);
    }

    //String exercise: 2. Append “blessings”
    public StringBuilder appendStringBuilder(StringBuilder stringBuilder) {
        System.out.println("Give what to append (eg. 'blessings')");
        String string = read.readStringFromKey();
        stringBuilder.append(' ').append(string).append(' ');
        return stringBuilder;
    }

    //String exercise: 3. Insert “Good ” in the begging
    public StringBuilder insertNewString(StringBuilder stringBuilder) {
        System.out.println("Give what to insert (eg. 'Good ')");
        String string = read.readStringFromKey();
        int offset = 0;
        stringBuilder.insert(offset, string);
        return stringBuilder;
    }

    //String exercise: 5. Append “ be with you”
    public StringBuilder appendMultipleStrings(StringBuilder stringBuilder) {
        System.out.println("Give what to append (eg. ' be with you'");
        String string = read.readStringFromKey();
        // tbd
        return stringBuilder;
    }
}
