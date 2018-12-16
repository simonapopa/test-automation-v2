package MenuApp;

import OtherMethods.ReadNumbersFromKeyboard;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Login {

    public boolean login() {
        ReadNumbersFromKeyboard read = new ReadNumbersFromKeyboard();
        for (int i = 3; i > 0; i--) {

            System.out.println("Introduceti user si parola");
            String userName = read.getStringFromKey("Introduceti userul");
            String password = read.getStringFromKey("Introduceti parola");

            Properties prop = new Properties();
            InputStream input = null;
            try {
                input = new FileInputStream("resources/config.properties");
                prop.load(input);

            } catch (FileNotFoundException er) {
                System.err.println("Nu s-a gasit fisierul");
            } catch (IOException er) {
                System.err.println("Eroare de sistem, mai incercati");
            }

            if (prop.getProperty(userName) == null) {
                System.out.println("Usernameul introdus nu este in fisier.");

            } else if (prop.getProperty(userName).contentEquals(password)) {
                System.out.println("Logare cu succes");
                return true;

            } else
                System.out.println("Parola este gresita");

            System.out.println("Mai aveti " + (i - 1) + " incercari");
        }
        return false;
    }
//
//    public static void main(String[] args) {
//        Login login = new Login();
//        login.login();
//    }
}