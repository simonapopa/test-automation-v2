package StringExercises;

import OtherMethods.ReadNumbersFromKeyboard;

public class StringMethods {
    ReadNumbersFromKeyboard read = new ReadNumbersFromKeyboard();

    //StringBuilder exercise: 1. Create an empty StringBuffer
    public StringBuilder generateEmptyStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder(200);
        return stringBuilder;
    }

    //StringBuilder exercise: print string builder
    public void displayStringBuilder(StringBuilder stringBuilder) {
        System.out.println("String builder is: " + stringBuilder);
    }

    //StringBuilder exercise: 2. Append “blessings”
    public StringBuilder appendStringBuilder(StringBuilder stringBuilder) {
        System.out.println("Give what to append (eg. 'blessings')");
        String string = read.readStringFromKey();
        stringBuilder.append(' ').append(string).append(' ');
        return stringBuilder;
    }

    //StringBuilder exercise: 3. Insert “Good ” in the beginning
    public StringBuilder insertNewString(StringBuilder stringBuilder) {
        System.out.println("Give what to insert (eg. 'Good ')");
        String string = read.readStringFromKey();
        int offset = 0;
        stringBuilder.insert(offset, string);
        return stringBuilder;
    }

    //StringBuilder exercise: 4. Delete the first o
    public StringBuilder deleteGivenString(StringBuilder stringBuilder) {
        System.out.println("Give what to delete (eg. 'o')");
        String string = read.readStringFromKey();
        System.out.println("Index of '" + string + "' is " + stringBuilder.indexOf(string));
        stringBuilder.deleteCharAt(stringBuilder.indexOf(string));
        return stringBuilder;
    }

    //StringBuilder exercise: 5. Append “ be with you”
    public StringBuilder appendMultipleStrings(StringBuilder stringBuilder) {
        System.out.println("Give strings to append. Enter 'quit' if done.");
        boolean flag = true;
        do {
            String string = read.readStringFromKey();
            if (string.equals("quit")) {
                flag = false;
            } else {
                stringBuilder.append(string).append(' ');
                System.out.println("stringB length " + stringBuilder.length());
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

    //StringBuilder exercise: 6. Set length to 3
    public StringBuilder setLength(StringBuilder stringBuilder) {
        System.out.println("Initial length of the string is " + stringBuilder.length());
        try {
            System.out.print("Give new length for string.");
            stringBuilder.setLength(read.readIntegerNumberFromKey());
            System.out.println("New length is " + stringBuilder.length());
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Negative value, try again.");
        }
        return stringBuilder;
    }

    //StringBuilder exercise: 7. Create a printDetails method, that takes a StringBuilder parameter, and prints
    //the content, length and capacity of the StringBuilder, all on a new line
    public void printDetails(StringBuilder stringBuilder) {
        displayStringBuilder(stringBuilder);
        System.out.println("Length is " + stringBuilder.length() + " \nCapacity is " + stringBuilder.capacity());
    }

    //String exercise: 8. Write a Java program to get the character at the given index within the String
    public char getCharacterAtGivenIndex() {
        String str = read.readStringFromKey();
        char ch = ' ';
        boolean flag;

        do {
            try {
                System.out.print("Index. ");
                int index = read.readIntegerNumberFromKey();
                ch = str.charAt(index);
                System.out.println("Index is ");
                flag = true;
            } catch (StringIndexOutOfBoundsException e) {
                System.err.println("Out of range");
                flag = false;
            }
        } while (!flag);
        return ch;
    }

    //String exercise: 9. Write a java program to compare two strings lexicographically.
    //false or true
    public boolean getStringsAndCompare(String stringFirst, String stringSecond) {
        stringFirst.compareTo(stringSecond);
        if (stringFirst.compareTo(stringSecond) == stringSecond.compareTo(stringFirst)) {
            return true;
        }
        return false;
    }

    //explains if identifical or not; with cases treated
    public void getStringsAndCompareAndJustify(String stringFirst, String stringSecond) {
        if ((stringFirst.compareTo(stringSecond) == 0)) {
            System.out.println(stringFirst + " and " + stringSecond + ": equal");
        } else if (stringFirst.compareTo(stringSecond) < 0) {
            System.out.println(stringFirst + " and " + stringSecond + ": the first String comes before the argument");
        } else {
            System.out.println(stringFirst + " and " + stringSecond + ": first String comes after the argument String");
        }
    }

    //String exercise: 10. Write a java program to compare two strings lexicographically, ignoring case differences
    public void getStringsAndCompareIgnoringCases(String stringFirst, String stringSecond) {
        if ((stringFirst.compareToIgnoreCase(stringSecond) == 0)) {
            System.out.println(stringFirst + " and " + stringSecond + ": equal");
        } else if (stringFirst.compareToIgnoreCase(stringSecond) < 0) {
            System.out.println(stringFirst + " and " + stringSecond + ": the first String comes before the argument");
        } else {
            System.out.println(stringFirst + " and " + stringSecond + ": first String comes after the argument String");
        }
    }

    //String exercise: 11. Write a Java program to concatenate a given string to the end of another string
    public String getStringAndConcatenate(String firstString, String secondString) {
        return firstString + secondString;
    }

    //String exercise: 12. Write a Java program to test if a given string contains the specified sequence of char values
    public void getStringAndFindCharacters(String string) {
        System.out.print("Give string to look for. ");
        String find = read.readStringFromKey();
        if (string.contains(find)) {
            System.out.println(string + " contains " + find);
        } else {
            System.out.println(string + " does not contain " + find);
        }
    }

    //StringBuffer exercise: 13. Write a Java program to compare a given string to the specified string buffer

}