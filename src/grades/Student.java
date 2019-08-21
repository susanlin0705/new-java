package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    public static ArrayList<Student> students;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.students= new ArrayList<>();
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    public double getGradeAverage(){
        int total =0;
        for(int i =0; i<grades.size(); i++){
            total+= grades.get(i);
        }
        return total/grades.size();
    }

    public String getName() {
        return name;
    }


//get the avg
    public static double getClassAvg(){
        double total=0;
        for (Student student:students){
            total+=student.getGradeAverage();
        }
        return total/students.size();
    }
}
