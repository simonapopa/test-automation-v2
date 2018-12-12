package StringExercises;

import OtherMethods.ReadNumbersFromKeyboard;

public class StringMethods {
    ReadNumbersFromKeyboard read = new ReadNumbersFromKeyboard();

    //String exercise: 1. Create an empty StringBuffer
    public StringBuilder generateEmptyStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder(200);
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

    //String exercise: 4. Delete the first o
    public StringBuilder deleteGivenString(StringBuilder stringBuilder) {
        System.out.println("Give what to delete (eg. 'o')");
        String string = read.readStringFromKey();
        System.out.println("index of '" + string + "' is " + stringBuilder.indexOf(string));
        stringBuilder.deleteCharAt(stringBuilder.indexOf(string));
        return stringBuilder;
    }

    //String exercise: 5. Append “ be with you”
    //tdb because does in endless loop
    public StringBuilder appendMultipleStrings(StringBuilder stringBuilder) {
        System.out.println("Give strings to append. Press a key number if done.");
//        String string = read.readStringFromKey();
//        int sizeS = read.readIntegerNumberFromKey();
//        StringBuilder s[] = new StringBuilder[sizeS];

        // works with defined length
//        for ( int i = 0; i < s.length; i++ ) {
//            String string = read.readStringFromKey();
//            stringBuilder.append(string).append(' ');
//            System.out.println("stringB length " + stringBuilder.length());
//        }
        boolean flag = true;
        do {
            try {
                String string = read.readStringFromKey();
                stringBuilder.append(string).append(' ');
                System.out.println("stringB length " + stringBuilder.length());
            } catch (StringIndexOutOfBoundsException e) {
                flag = false;
            }
        } while (flag);

        return stringBuilder;
    }

    //test
    public static String concatenate(String... s) {
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < s.length; i++ )
            sb = sb.append(s[i]);

        return sb.toString();
    }
}
