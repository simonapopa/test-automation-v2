package Game2ndSession;

import java.io.IOException;
import java.util.Scanner;

public class Choose {
    public String answer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toLowerCase();
    }

    public String question(String s) {
        System.out.println(s);
        return answer();
    }

    private void dogOption() {
        Dog dog = new Dog();
        Human girl = new Human();
        Animal animal = new Animal();
        Doctor doctor = new Doctor();
        Food food = new Food();

        dog.bark();
        dog.setName("Dobbie");
        dog.setBreed("Doberman");
        dog.setWeight(10);
        dog.setAge(2);
        dog.setGenre('M');

        System.out.println("I'm " + dog.getName() + ", " + dog.getBreed() + " (" + dog.getGenre() + ") age " + dog.getAge() + ", " + "weighting " + dog.getWeight());
        String answer = question("Do you want to rescue, " + dog.getName() + "? Yes/No");

        if (answer.equals("yes")) {
            girl.setName("Simona");
            girl.setGenre('F');
            System.out.println(girl.getName() + "(" + girl.getGenre() + ")" + "has rescued " + dog.getName());
            girl.rescue();
            girl.feed();
            animal.eat();
            animal.love();

            animal.sick();
            answer = question("Ask the doctor for treatment? Yes/No");
            if (answer.equals("yes")) {
                girl.askMedicalHelp();
                doctor.suggestTreatment();

                answer = question("Apply treatment suggested by doctor? Yes/No");

                if (answer.equals("yes")) {
                    doctor.applyTreatment();
                    dog.fear();
                    food.buyFood();
                    girl.feed();
                    animal.eat();
                    animal.love();
                } else if (answer.equals("no")) {
                    animal.sick();
                } else {
                    System.out.println("No such value.");
                }

            } else if (answer.equals("no")) {
                animal.sick();
            } else {
                System.out.println("No such value.");
            }
        } else if (answer.equals("no")) {
            animal.sick();
        } else {
            System.out.println("No such value.");
        }
    }

    private void catOption() {
        Cat cat = new Cat();

        cat.meow();
        cat.setName("Kitty");
        cat.setBreed("Russian Blue");
        cat.setWeight(12);
        cat.setAge(4);
        cat.setGenre('F');

        System.out.println("I'm " + cat.getName() + ", " + cat.getBreed() + " (" + cat.getGenre() + ") age " +
                cat.getAge() + ", " + "weighting " + cat.getWeight());
    }

    private void birdOption() {
        Bird bird = new Bird();

        bird.hello();
        bird.setName("Polly");
        bird.setBreed("Parrot");
        bird.setWeight(1);
        bird.setAge(7);
        bird.setGenre('M');

        System.out.println("I'm " + bird.getName() + ", " + bird.getBreed() + " (" + bird.getGenre() + ") age " +
                bird.getAge() + ", " + "weighting " + bird.getWeight());
    }

    public void chooseEntry() {
        String answer;
        AdministrationLogin adminLogin = new AdministrationLogin();
        AdministrationPanel adminPanel = new AdministrationPanel();
        Choose choose = new Choose();
        ShopStatus shopStatus = new ShopStatus();

        do {
            System.out.println("Choose an option:");
            answer = question("1. Browse Pet Shop" + "\n2. Enter Administration Panel");
            switch (answer) {
                case "1":
                    if (shopStatus.isOpen()) {
                        chooseAnimal();
                    } else {
                        System.out.println("Shop is closed at the moment!");
                    }
                    break;
                case "2":
                    //tbd
                    //login: properties file to contain all users with access DONE
                    // administration panel:
                    // - show existing animals and statuses
                    // - create, read, update
                    // add user roles: show employees, delete animals
                    try {
                        if (adminLogin.login()) {
                            adminPanel.chooseAdminOption();
                        } else {
                            choose.chooseEntry();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "q":
                    break;
                default:
                    System.out.println("No such value.");
                    break;
            }
        } while (!answer.equals("q"));
    }

    public void chooseAnimal() {
        String answer;
        System.out.println("Welcome to the Pet Shop!");
        do {
            answer = question("What type of animal? Choose between DOG | CAT | BIRD. The chosen animal will greet you shortly" + "\n(Press 'q' to quit.)");

            switch (answer) {
                case "dog":
                    dogOption();
                    break;
                case "cat":
                    catOption();
                    break;
                case "bird":
                    birdOption();
                    break;
                case "q":
                    break;
                default:
                    System.out.println("No such value. Press 'q' to quit.");
                    break;
            }
        } while (!answer.equals("q"));
    }
}