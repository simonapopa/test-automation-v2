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

    //UnitTests
    public static String concatenate(String... s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length; i++)
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

    //String exercise: 12. Write a Java program to UnitTests if a given string contains the specified sequence of char values
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
    public void getStringCompareWithStringBuffer() {
        System.out.print("Give string to compare with stringBuffer. ");
        String string = read.readStringFromKey();
        StringBuffer buffer = new StringBuffer();
        System.out.print("Append to stringBuffer. ");
        String stringBuffer = read.readStringFromKey();
        buffer.append(stringBuffer).append(' ');

        if (stringBuffer.contains(string)) {
            System.out.println("String buffer: " + stringBuffer + " contains entered string: " + string);
        } else {
            System.out.println("Not identical");
        }
    }

    //StringBuffer exercise: 14. Write a Java program to check whether a given string ends with the contents of another string
    public void compareEndOfStringWithGivenString(String endsString) {
        System.out.print("Give full string. ");
        String checkString = read.readStringFromKey();
        checkString.endsWith(endsString);
        if (checkString.endsWith(endsString) && !checkString.contentEquals(endsString)) {
            System.out.println("String: " + checkString + " ends with " + endsString);
        } else if (checkString.endsWith(endsString) && checkString.contentEquals(endsString)) {
            System.out.println("String " + checkString + " identical with " + endsString);
        } else {
            System.out.println("String " + checkString + " does not end with " + endsString);
        }
    }

    //String exercise: 15. Write a Java program to convert all the characters in a string to lowercase
    public String getStringConvertToLowercase(String string) {
        return string.toLowerCase();
    }

    //String exercise: 16. Write a Java program to convert all the characters in a string to uppercase
    public String getStringConvertToUppercase(String string) {
        return string.toUpperCase();
    }

    //String exercise: 17. Write a Java program to trim any leading or trailing whitespace from a given string.
    public String getStringAndTrim(String string) {
        return string.trim();
    }

    //String exercises: 18. Write a Java program to divide a string in n equal parts
    public void getStringAndDivide(String string) {
        System.out.print("Dividing nr. ");
        int nr = read.readIntegerNumberFromKey();
        if (string.length() % nr != 0) {
            System.out.print("Size of string not divizible by " + nr);
        } else {
            int divide = string.length() / nr;
            for (int i = 0; i < string.length(); i++) {
                if (i % divide == 0) {
                    System.out.println();
                }
                System.out.print(string.charAt(i));
            }
        }
    }

    //String exercise: 19. Write a Java program to remove "b" and "ac" from a given string
    public String getStringAndRemoveCharacters(String string) {
        string = string.replace("b", "");
        string = string.replace("ac", "");
        return string;
    }

    //String exercise: 20. Write a Java program that takes a phone number (eg: 0740123456) and then it returns it formatted: (0740)-123-456
    //not correct
    public String getPhoneAndFormat(String string) {
        String formattedNumber = String.format("(%s)-%s-%s", string.substring(0, 7), string.substring(1, 3), string.substring(4, 6));
        return formattedNumber;
    }
}