package Game2ndSession;

public class Animal {
    private String breed;
    private int age;
    private float weight;
    private char genre;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public void eat() {
        System.out.println("I'm eating... finished!");
    }

    public void love() {
        System.out.println("Thank you!... I love you :) ");
    }
    public void sick(){
        System.out.println("I don't feel good...");
    }

    public void fear() {
        System.out.println("I'm scared...");

    }
}