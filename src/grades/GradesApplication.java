package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static grades.Student.getClassAvg;
import static grades.Student.students;

public class GradesApplication {
    public static void main(String[] args) {
//             <key   ,  object>
        HashMap<String, Student> usernames = new HashMap<>();
        Student tim = new Student("Tim");
        tim.addGrade(100);
        tim.addGrade(50);
        tim.addGrade(60);
        Student fer = new Student("Fer");
        fer.addGrade(70);
        fer.addGrade(80);
        fer.addGrade(90);

        usernames.put("timtim",tim);
        usernames.put("ferfer",fer);


        students.add(tim);
        students.add(fer);

        System.out.println(getClassAvg());

        Scanner scan =new Scanner(System.in);
        System.out.println("What student do you like to see? Want to see all the list type all");
        System.out.println(usernames.keySet());




        boolean run =true;

        do{
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("timtim")) {
                System.out.println("Student's Name: "+usernames.get("timtim").getName()+"   Student's average is "+tim.getGradeAverage());
            } else if (input.equalsIgnoreCase("ferfer")) {
                System.out.println("Student's Name: "+usernames.get("ferfer").getName()+"   Student's average is "+fer.getGradeAverage());
            }else if (input.equalsIgnoreCase("all")){

                for (Student value : usernames.values()) {
                    System.out.println("User: " + value.getName() + " Avg: " + value.getGradeAverage() +" total avg for the class :" + value.getClassAvg());
                }

            }
        }while (run);

    }
}
