package Game2ndSession;

import java.util.Scanner;

public class Choose {

    public String answer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String question(String s) {
        System.out.println(s);
        return answer();
    }

    public void chooseAnimal() {

        Scanner scanner = new Scanner(System.in);
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        Human girl = new Human();
        Doctor doctor = new Doctor();

        String answer;

        do {
            answer = question("What type of animal? Choose between DOG | CAT | BIRD. The chosen animal will greet you shortly" + "\n(Press 'q' to quit.)");

            switch (answer) {
                case "dog":
                    dog.bark();
                    dog.setName("Dobbie");
                    dog.setBreed("Doberman");
                    dog.setWeight(10);
                    dog.setAge(2);
                    dog.setGenre('M');

                    System.out.println("I'm " + dog.getName() + ", " + dog.getBreed() + " (" + dog.getGenre() + ") age " + dog.getAge() + ", " + "weighting " + dog.getWeight());
                    answer = question("Do you want to rescue, " + dog.getName() + "? Yes/No");

                    if (answer.equals("yes")) {
                        girl.setName("Simona");
                        girl.setGenre('F');
                        System.out.println(girl.getName() + "(" + girl.getGenre() + ")" + "has rescued " + dog.getName());
                        girl.rescue();
                        girl.feed();
                        animal.eat();
                        animal.love();

                        animal.sick();
                        girl.askMedicalHelp();
                        doctor.suggestTreatment();

                        answer = question("Apply treatment suggested by doctor? Yes/No");

                        if (answer.equals("yes")) {
                            doctor.applyTreatment();
                            dog.fear();
                            girl.buyFood();
                            girl.feed();
                            animal.eat();
                            animal.love();
                        } else {
                            animal.sick();
                        }

                    } else {
                        animal.fear();
                    }
                    break;
                case "cat":
                    cat.meow();
                    cat.setName("Kitty");
                    cat.setBreed("Russian Blue");
                    cat.setWeight(12);
                    cat.setAge(4);
                    cat.setGenre('F');

                    System.out.println("I'm " + cat.getName() + ", " + cat.getBreed() + " (" + cat.getGenre() + ") age " +
                            cat.getAge() + ", " + "weighting " + cat.getWeight());
                    break;
                case "bird":
                    bird.hello();
                    bird.setName("Polly");
                    bird.setBreed("Parrot");
                    bird.setWeight(1);
                    bird.setAge(7);
                    bird.setGenre('M');

                    System.out.println("I'm " + bird.getName() + ", " + bird.getBreed() + " (" + bird.getGenre() + ") age " +
                            bird.getAge() + ", " + "weighting " + bird.getWeight());
                    break;
                default:
                    System.out.println("No such value. Press 'q' to quit.");
            }

        } while (!answer.equals("q"));
    }
}