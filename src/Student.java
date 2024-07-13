import java.util.ArrayList;
import java.util.List;

public class Student {
    private Name fullName;
    private List <Integer> assessment = new ArrayList<>();
    Student(String fullName, int ... assessment){
        String [] tmp = fullName.split(" ");
        if (tmp.length == 1){
            this.fullName = new Name(tmp[0],null,null);
        } else if (tmp.length == 2) {
            this.fullName = new Name(tmp[0],tmp[1],null);

        } else {
            this.fullName = new Name(tmp[0],tmp[1],tmp[2]);
        }
        if (assessment.length !=0 ) System.out.println("in");
        for (int x: assessment) {
            this.assessment.add(x);
        }


    }



    public String getAssessment() {
        StringBuilder result = new StringBuilder();
        for (int res =0; res < this.assessment.size(); res++){
            if (res == this.assessment.size()-1) {
                result.append(this.assessment.get(res));
            }
            else  result.append(this.assessment.get(res)).append(", ");

        }
        return result.toString();
    }
    public List<Integer> getAssassments(){
        return this.assessment;
    }


    public void setAssessments(int [] value) {
        for (int x: value){
        if (x < 2 || x > 5){
            throw new IllegalArgumentException("Вы указали число: "+ x +"\t Число не может быть меньше 2 и выше 5");
            }
        else
            {
                assessment.add(x);
        }


        }

    }
    public  void changeAssessment(int index, int value){
        if (index < 0 ) throw new IllegalArgumentException( index +
                "Указано значение меньше нуля. Значение индекса может быть больше или равно 0");
        if (value > 1 && value < 5) throw new IllegalArgumentException("Вы указали не соответсвующую оценку: "
                + value +"\t Оценка не может быть меньше 2 и выше 5");
       this.assessment.set(index,value);
    }

    @Override
    public String toString() {
        return  fullName.toString() +
                " [" + getAssessment() +
                ']';
    }
}
