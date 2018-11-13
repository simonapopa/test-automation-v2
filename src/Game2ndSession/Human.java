package Game2ndSession;

public class Human {

    private String name;
    private char genre;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public char getGenre(){
        return genre;
    }
    public void setGenre(char genre){
        this.genre = genre;
    }

    public void rescue(){
        System.out.println("Rescued!");
    }
    public void feed(){
        System.out.println("Take a treat!");

    }
    public void askMedicalHelp(){
        System.out.println("Help!");
    }
    public void buyFood(){
        System.out.println("Buying food... finished!");
    }
}
