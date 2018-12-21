package FileReaderExercises;

import java.io.*;
import java.util.Scanner;

public class FileMethods {

    // 2. Create a text file, with the name “MyTextFile”
    public File createFile() throws IOException {
        File file = new File("resources/MyTextFile.txt");
        FileWriter fileWriter = new FileWriter(file);
        return file;
    }

    // Check if file already exists or not
    public void checkFileExists(File f) {
        if (f == null) {
            System.out.println("File does not exist!");
        } else {
            System.out.println("File already exists!");
        }
    }

    // 3. Write 4 lines of text in the file
    public void writeInFile(File f) throws IOException {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new FileOutputStream(f, true), true);
        String fileText;
        do {
            System.out.println("What to write in file? (Enter 'q' if done.)");
            fileText = scanner.next();

            //will not write in file the exit string
            if (!fileText.equals("q")) {
                pw.println(fileText);
            } else {
                break;
            }

        } while (!fileText.equals("q"));
    }
}
