import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[]args){
        Student student1 = new Student();
        student1.setName("Bob");
        student1.setLastName("Smith");

        Student student2 = new Student();
        student1.setName("Michael");
        student1.setLastName("Brown");

        Student student3 = new Student();
        student1.setName("Adam");
        student1.setLastName("Black");

        Student student4 = new Student();
        student1.setName("Peter");
        student1.setLastName("Parker");

        Student student5 = new Student();
        student1.setName("Jack");
        student1.setLastName("White");

        List <Student> group = new ArrayList<>();
            group.add(student1);
            group.add(student2);
            group.add(student3);
            group.add(student4);
            group.add(student5);

        int [] results = new int[group.size()];
        for (int i = 0; i < group.size(); i++) {
            results[i] = group.get(i).getResult();
        }

        double sum = 0;
        for (int i = 0; i < results.length; i++){
            sum = sum + results[i];
        }

        double averageResult = sum/results.length;
        System.out.println(averageResult);
    }
}
