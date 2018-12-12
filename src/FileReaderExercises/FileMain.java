package FileReaderExercises;

import java.io.*;

public class FileMain {

    public static void main(String args[]) throws IOException {


        File file = new File("resources/fileTest.txt");
        FileWriter fl = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(new FileOutputStream(file, true), true);

        pw.println("Asta e linie noua!");
        pw.flush();

        BufferedReader bf = new BufferedReader(new FileReader(file));

        String st;
        while ((st = bf.readLine()) != null) {
            System.out.println(st);
        }


        //        File file = new File("resources/newTest.txt");
//        FileWriter fileWriter = new FileWriter(file, false);
//        fileWriter.append("asdasdasdasdasdsdas\n");
//        fileWriter.append("asdasdasdasdasdsdas");
//        fileWriter.write(" asta e un test ");
//
//
//        PrintWriter printWriter = new PrintWriter(fileWriter, true);
//        PrintWriter pw = new PrintWriter(new FileOutputStream(file, true), true);
//        pw.printf("zzzzz");
//
//
//       try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//            String st;
//            while ((st = bufferedReader.readLine()) != null) {
//                System.out.println(st);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        File file2 = null;
//        if (file2 == null)
//            file.delete();

    }
}
