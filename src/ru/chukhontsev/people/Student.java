package ru.chukhontsev.people;

import ru.chukhontsev.generic.Comparable;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private List <Integer> assessment = new ArrayList<>();
    public Student(String name, int ...assessments){
        this.name = name;
        for (int i: assessments) {
                chekAssessment(i);
                this.assessment.add(i);
        }
    }
    public Student(String name, List<Integer> assessments){
        this(name);
        this.assessment.addAll(assessments);
    }


    public boolean chekAssessment (int assessment){
        if (assessment < 2) throw new IllegalArgumentException(" Минимально допустимая оценка это 2. Измените указанную вами оценку " + assessment);
        if (assessment > 5) throw new IllegalArgumentException(" Максимально допустимая оценка это 5. Измените указанную вами оценку " + assessment);
        return true;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getAssessment() {
       return new ArrayList<>(assessment);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAssessment(int ... assessment) {
        for (int i : assessment) {
            chekAssessment(i);
            this.assessment.add(i);
        }
    }
    public  void  changeAssessment(int index, int assessment){
        chekAssessment(assessment);
        if (index-1 > this.assessment.size()-1 && index < 0) throw new IllegalArgumentException("Не верно указан номер оценки. Укажите значение от 1 до " + this.assessment.size());
        this.assessment.set(index-1, assessment);
    }
    public  void  changeAllAssessment( int ... assessment){

        this.assessment.clear();
        for (int i : assessment) {
            chekAssessment(i);
            this.assessment.add(i);
        }

    }
    public boolean isGoodStudent(){
        return  (averageAssessment() == 5);
    }
    public double  averageAssessment(){
       if(this.assessment.isEmpty()) {
           return 0;
       } else {
           int sum = 0;
           for (int i: assessment){
               sum +=i;
           }
           return sum/assessment.size();
       }


    }

    @Override
    public String toString() {

        return  name + ": " + assessment;
    }

    @Override
    public int compare(Student other) {
        return (int) (this.averageAssessment() - other.averageAssessment());
    }


}


