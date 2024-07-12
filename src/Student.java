import java.lang.reflect.Array;

import java.util.Arrays;

public class Student {
    private Name fullName;
    private int [] assessment;
    Student(String fullName){
        String [] tmp = fullName.split(" ");
        if (tmp.length == 1){
            this.fullName = new Name(tmp[0],null,null);
        } else if (tmp.length == 2) {
            this.fullName = new Name(tmp[0],tmp[1],null);

        } else {
            this.fullName = new Name(tmp[0],tmp[1],tmp[2]);
        }


    }
    Student(String fullName, int [] assessment){
        this (fullName);
        int [] tmp = new int[assessment.length];
        for (int x = 0; x < assessment.length; x++) {
            tmp [x] = assessment[x];
        }
        this.assessment = tmp;
    }


    public String getAssessment() {
        StringBuilder result = new StringBuilder();
        for (int res:this.assessment){
            if (res != this.assessment[this.assessment.length-1]) {
                result.append(res).append(", ");
            }
            else  result.append(res);

        }
        return result.toString();
    }
    public int [] getAssassments(){
        return this.assessment;
    }

    public void setAssessment(int index, int value) {
        assessment[index] = value ;
    }

    @Override
    public String toString() {
        return  fullName.toString() +
                " [" + getAssessment() +
                ']';
    }
}
