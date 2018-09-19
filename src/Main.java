import domain.Group;
import domain.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student a=new Student();
        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(5);
        a.setMarks(list);
        Student b=new Student();
        b.setMarks(list);
        Group c=new Group();
        List<Student> l=new ArrayList<>();
        l.add(a);
        l.add(b);
        c.setStudents(l);
        System.out.println(c.calculateAvgMark());
    }
}
