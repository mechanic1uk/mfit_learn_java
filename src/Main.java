import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student vasya = new Student("Вася",3, 4, 5,4);
        Student petya = new Student("Петя", 5,5,5,5);

        System.out.println(vasya);
        System.out.println(petya);
        System.out.println("Средняя оценка студента: " + vasya.averageAssessment());
        System.out.println("Студент является отличником: " + vasya.isGoodStudent());
        System.out.println("Средняя оценка студента: " + petya.averageAssessment());
        System.out.println(petya.isGoodStudent());




    }

}

