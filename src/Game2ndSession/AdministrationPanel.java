package Game2ndSession;

public class AdministrationPanel {

    public void chooseAdminOption() {
        String answer;
        Choose question = new Choose();

        System.out.println("Welcome to Admin Panel!");
        do {
            answer = question.question("Choose between:" + "\n1. View my employees" + "\n2. View Pet Shop inventory");

            switch (answer) {
                case "1":
                    viewEmployees();
                    break;
                case "2":
                    viewShopInventory();
                    break;
                case "q":
                    break;
                default:
                    System.out.println("No such value. Press 'q' to quit.");
                    break;
            }
        } while (!answer.equals("q"));
    }

    private void viewEmployees(){
        System.out.println("view employees");
        //tbd
    }

    private void viewShopInventory(){
        System.out.println("view inventory");
        //tbd
    }
}
