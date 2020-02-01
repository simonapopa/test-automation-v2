package MenuApp;

// Console line: show informative message, show options (with all operations done so far), do action based on given number,
// quit afterwards
public class MenuMain {

    public static void main(String args[]) {
        Login login = new Login();
        if (login.login()) {
            MenuControl menu = new MenuControl();
            menu.displayMenu();
        }
    }
}
