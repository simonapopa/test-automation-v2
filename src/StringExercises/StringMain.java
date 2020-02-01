package StringExercises;

import OtherMethods.ReadNumbersFromKeyboard;

public class StringMain {
    public static void main(String args[]) {
        ReadNumbersFromKeyboard read = new ReadNumbersFromKeyboard();
        StringMethods sm = new StringMethods();

        //StringBuilder exercise: 1. Create an empty StringBuffer
        //sm.generateEmptyStringBuilder();

        //StringBuilder exercise: 2. Append “blessings”
        //sm.displayStringBuilder(sm.appendStringBuilder(sm.generateEmptyStringBuilder()));

        //StringBuilder exercise: 3. Insert “Good ” in the begging
        //sm.displayStringBuilder(sm.insertNewString(sm.appendStringBuilder(sm.generateEmptyStringBuilder())));

        //StringBuilder exercise: 4. Delete the first o
        //sm.displayStringBuilder(sm.deleteGivenString(sm.appendStringBuilder(sm.generateEmptyStringBuilder())));
        //sm.displayStringBuilder(sm.deleteGivenString(sm.insertNewString(sm.appendStringBuilder(sm.generateEmptyStringBuilder()))));

        //StringBuilder exercise: 5. Append “ be with you”
        //sm.displayStringBuilder(sm.appendStringBuilder(sm.generateEmptyStringBuilder()));
        //sm.displayStringBuilder(sm.appendMultipleStrings(sm.insertNewString(sm.appendStringBuilder(sm.generateEmptyStringBuilder()))));

        //StringBuilder exercise: 6. Set length to 3
        //sm.displayStringBuilder(sm.setLength(sm.insertNewString(sm.appendStringBuilder(sm.generateEmptyStringBuilder()))));

        //StringBuilder exercise: 7. Create a printDetails method, that takes a StringBuilder parameter, and prints
        //the content, length and capacity of the StringBuilder, all on a new line
        //sm.printDetails(sm.insertNewString(sm.appendStringBuilder(sm.generateEmptyStringBuilder())));

        //String exercise: 8.Write a Java program to get the character at the given index within the String
//        System.out.println(sm.getCharacterAtGivenIndex());

        //String exercise: 9. Write a java program to compare two strings lexicographically.
        //two valid solutions:
        //System.out.println(sm.getStringsAndCompare(read.readStringFromKey(),read.readStringFromKey()));
        //sm.getStringsAndCompareAndJustify(read.readStringFromKey(),read.readStringFromKey());

        //String exercise: 10. Write a java program to compare two strings lexicographically, ignoring case differences
        //sm.getStringsAndCompareIgnoringCases(read.readStringFromKey(),read.readStringFromKey());

        //String exercise: 11. Write a Java program to concatenate a given string to the end of another string
        //System.out.println(sm.getStringAndConcatenate(read.readStringFromKey(),read.readStringFromKey()));

        //String exercise: 12. Write a Java program to UnitTests if a given string contains the specified sequence of char values
        //sm.getStringAndFindCharacters(read.readStringFromKey());

        //StringBuffer exercise: 13. Write a Java program to compare a given string to the specified string buffer
        //sm.getStringCompareWithStringBuffer();

        //String exercise: 14. Write a Java program to check whether a given string ends with the contents of another string
        //sm.compareEndOfStringWithGivenString(read.readStringFromKey());

        //String exercise: 15. Write a Java program to convert all the characters in a string to lowercase
//        System.out.println(sm.getStringConvertToLowercase(read.getStringFromKey("Give string in uppercase to convert: ")));

        //String exercise: 16. Write a Java program to convert all the characters in a string to uppercase
//        System.out.println(sm.getStringConvertToUppercase(read.getStringFromKey("Give string in lowercase to convert: ")));

        //String exercise: 17. Write a Java program to trim any leading or trailing whitespace from a given string.
//        System.out.println(sm.getStringAndTrim(read.getStringFromKey("Give string with spaces to trim: ")));

        //String exercises: 18. Write a Java program to divide a string in n equal parts
//        sm.getStringAndDivide(read.getStringFromKey("Give string to divide: "));

        //String exercise: 19. Write a Java program to remove "b" and "ac" from a given string
        //System.out.println(sm.getStringAndRemoveCharacters(read.getStringFromKey("Enter the string: ")));

        //String exercise: 20. Write a Java program that takes a phone number (eg: 0740123456) and then it returns it formatted: (0740)-123-456
        System.out.println(sm.getPhoneAndFormat(read.getStringFromKey("Enter number:")));
    }
}
