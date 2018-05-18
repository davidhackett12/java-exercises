package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentRoster {
    public static HashMap<String, Integer> rosterCreator() {
        HashMap<String, Integer> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newstudent;
        System.out.println("Enter student names(press enter when finished: ");
        do {
            System.out.print("Student: ");
            newstudent = in.nextLine();

            if (!newstudent.equals("")) {
                System.out.print("ID number: ");
                Integer newID = in.nextInt();
                students.put(newstudent, newID);
                in.nextLine();
            }
        } while (!newstudent.equals(""));
        return students;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> studentRoster;
        studentRoster = rosterCreator();
        for (Map.Entry<String, Integer> student : studentRoster.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}
