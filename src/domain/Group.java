package domain;

import lombok.Data;

import java.util.List;

@Data
public class Group {
    List<Student> students;

    public Double calculateAvgMark(){
        int count=0;
        Integer sum=0;
        for (Student s:this.getStudents()
             ) {
            for (Integer i:s.getMarks()
                 ) {
                count++;
                sum+=i;
            }
        }
        double mark=0d;
        if(count!=0){
           mark=((double)sum)/count;
        }
        return mark;
    }
}
