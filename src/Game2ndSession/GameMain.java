package Game2ndSession;

import java.util.Scanner;

public class GameMain {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        Human girl = new Human();
        Doctor doctor = new Doctor();

        System.out.println("What type of animal? Choose between DOG | CAT | BIRD. The chosen animal will greet you shortly.");
        String answer = scanner.nextLine();

        if (answer.equals("dog")) {
            dog.bark();
            dog.setName("Dobbie");
            dog.setBreed("Doberman");
            dog.setWeight(10);
            dog.setAge(2);
            dog.setGenre('M');

            System.out.println("I'm a " + dog.getName() + ", " + dog.getBreed() + " (" + dog.getGenre() + ") age " + dog.getAge() + ", " + "weighting " + dog.getWeight());

            System.out.println("Do you want to rescue, " + dog.getName() + "? Yes/No");
            String rescue = scanner.nextLine();

            if (rescue.equals("yes")) {
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

                System.out.println("Apply treatment suggested by doctor? Yes/No");
                answer = scanner.nextLine();
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
                System.out.println("What type of animal? Choose between DOG | CAT | BIRD. The chosen animal will greet you shortly.");
                answer = scanner.nextLine();
            }

        }

        if (answer.equals("cat")) {
            cat.meow();
            cat.setName("Kitty");
            cat.setBreed("Russian Blue");
            cat.setWeight(12);
            cat.setAge(4);
            cat.setGenre('F');

            System.out.println("I'm a " + cat.getName() + ", " + cat.getBreed() + " (" + cat.getGenre() + ") age " + cat.getAge() + ", " + "weighting " + cat.getWeight());
        }

        if (answer.equals("bird")) {
            bird.hello();
            bird.setName("Polly");
            bird.setBreed("Parrot");
            bird.setWeight(1);
            bird.setAge(7);
            bird.setGenre('M');

            System.out.println("I'm a " + bird.getName() + ", " + bird.getBreed() + " (" + bird.getGenre() + ") age " + bird.getAge() + ", " + "weighting " + bird.getWeight());
        }

    }
}
