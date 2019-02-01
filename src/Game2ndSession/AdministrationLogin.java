package Game2ndSession;

import OtherMethods.ReadNumbersFromKeyboard;

import java.io.*;
import java.util.Properties;

import static Game2ndSession.Constants.DB_PROPERTIES;

public class AdministrationLogin {

    public boolean login() throws IOException{
        ReadNumbersFromKeyboard read = new ReadNumbersFromKeyboard();
        for (int i = 3; i > 0; i--) {

            System.out.println("Enter username and password.");
            String userName = read.getStringFromKey("Enter username:");
            String password = read.getStringFromKey("Enter password:");

            Properties prop = new Properties();

            InputStream input = null;
            try {
                input = new FileInputStream(DB_PROPERTIES);
                prop.load(input);

            } catch (FileNotFoundException er) {
                System.err.println("File not found.");
            } catch (IOException er) {
                System.err.println("Try again.");
            }

            if (prop.getProperty(userName) == null) {
                System.out.println("Username does not exist.");

            } else if (prop.getProperty(userName).contentEquals(password)) {
                input.close();
                System.out.println("Successfully logged in!");
                return true;

            } else
                System.out.println("Wrong password!");

            System.out.println("You have " + (i - 1) + " remaining tries.");
        }
        return false;
    }
}
