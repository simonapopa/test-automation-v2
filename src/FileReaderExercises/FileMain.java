package FileReaderExercises;

import OtherMethods.ReadNumbersFromKeyboard;

import java.io.IOException;

public class FileMain {

    public static void main(String args[]) throws IOException {
        FileMethods fm = new FileMethods();
        ReadNumbersFromKeyboard read = new ReadNumbersFromKeyboard();
        //fm.createFile();
        //fm.checkFileExists(fm.createFile());
        //fm.writeInFile(fm.createFile());
        //fm.writeInFile();
        System.out.println("List is " + fm.addFileContentToList());
        System.out.println(fm.searchText(fm.addFileContentToList()));
    }
}
