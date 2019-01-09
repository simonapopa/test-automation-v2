package FileReaderExercises;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
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
            switch (fileText) {
                case "q":
                    break;
                default:
                    pw.println(fileText);
                    break;
            }
        } while (!fileText.equals("q"));
    }

    //4. Modify the program so that it adds another 3 lines of text. When running the second time, you should not be overriding the existing lines
    public void writeInFile() throws IOException {
        File f = new File("resources/MyTextFile.txt");
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new FileOutputStream(f, true), true);
        String fileText;
        do {
            System.out.println("What to write in file? (Enter 'q' if done)");
            fileText = scanner.next();

            //will not write in file the exit string
            switch (fileText) {
                case "q":
                    break;
                default:
                    pw.println(fileText);
                    break;
            }
        } while (!fileText.equals("q"));
    }

    //5. Write a program to add all the lines from the text file to a List.
    public List addFileContentToList() throws IOException {
        File file = new File("resources/MyTextFile.txt");
        List listFile;
        listFile = Files.readAllLines(Paths.get(String.valueOf(file)));
        return listFile;
    }
}