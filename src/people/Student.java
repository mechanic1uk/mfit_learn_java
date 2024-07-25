package people;

import java.util.ArrayList;
import java.util.List;

public class Student {
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
        return assessment;
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
}


/*
@todo
Студент: getAssassments возвращает ссылку на внутренний список и через неё можно будет добавить какие хочешь значения.
метод getAssassment вообще не пойми что такое, и код бы отформатировать перед заливкой на гит. Ну и там ряда методов по заданию не хватает.

1.3.1
Студент. Создайте сущность Студент, которая описывается:
•	Имя: строка
•	Оценки: массив целых чисел.
•	Может возвращать текстовое представление вида “Имя: [оценка1, оценка2,…,оценкаN]”
Необходимо выполнить следующие задачи:
1.	Создать студента Васю с оценками: 3,4,5.
2.	Создать студента Петю и скопировать оценки Васи, присвоив содержимое поля с оценками Васи полю с оценками Пети.
3.	Заменить первую оценку Пети на число 5. Вывести на экран строковое представление Васи и Пети. Объяснить результат
4.	Создать студента Андрея и скопировать ему оценки Васи так, чтобы изменение оценок Васи не влияло на Андрея.



1.4.7
Создаем Студента. Измените сущность Студент из задачи 1.3.1. Новые требования включают:
•	Студента можно создать указав только имя
•	Студента можно создать указав имя и набор оценок
•	Оба способа должны быть реализованы единственным конструктором
Создайте и выведите на экран следующие объекты:
1.	Студент Вася с оценками: 3,4,5.
2.	Студент Максим без оценок


1.5.6
Студент отличник. Измените сущность Студент из задачи 1.4.7. Новые требования включают:
•	Студент может возвращать значение своей средней оценки (вещественное число). Если оценок нет, то среднее – 0.
•	Студент может возвращать информацию о том, является ли он отличником или нет. Студент является отличником если у него есть хотя бы одна оценка и все оценки только отличные.
Необходимо выполнить следующие задачи:
1.	Создайте студента Васю с оценками 3,4,5,4
2.	Создайте студента Петю с оценками 5,5,5,5
3.	Выведите для обоих студентов информацию о среднем балле и являются ли они отличниками


1.6.9
Диапазон оценок. Измените сущность Студент из задачи 1.5.6.
Необходимо гарантировать, что добавлять Студенту можно только оценки в диапазоне от 2 до 5, при этом у Студента всегда можно узнать список оценок.
Продемонстрируйте на примерах, что нет способа задать Студенту некорректную оценку.

 */