package FileReaderExercises;

import java.io.IOException;

public class FileMain {

    public static void main(String args[]) throws IOException {
        FileMethods fm = new FileMethods();
        //fm.createFile();
        //fm.checkFileExists(fm.createFile());
        fm.writeInFile(fm.createFile());
    }
}
