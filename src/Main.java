import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student vasya = new Student("Вася",3, 4, 5);
        Student petya = new Student("Петя",  vasya.getAssessment());
        Student andrew = new Student("Андрей",  vasya.getAssessment());
        System.out.println(vasya);
        System.out.println(petya);
        System.out.println(andrew);
        vasya.setAssessment(5);
        petya.setAssessment(2,3);
        petya.changeAssessment(2,5);
        vasya.changeAllAssessment(5,5,5,3,2,2);
        System.out.println(vasya);
        System.out.println(petya);
        System.out.println(andrew);

    }

}

