import java.util.Random;

public class Student {
    private String name;
    private String lastName;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getResult(){
        Random rand = new Random();
        return rand.nextInt(5);
    }

}

