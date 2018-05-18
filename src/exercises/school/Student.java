package exercises.school;

public class Student {
    private String name;
    private int studentID;
    private int credits;
    private double gpa;

    public Student(String name, int studentID, int credits, double gpa) {
        this.name = name;
        this.studentID = studentID;
        this.credits = credits;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public String setName(String aName){
        this.name = aName;
    }

    public int getStudentID(){
        return studentID;
    }

    public void setStudentID(int aStudentID){
        this.studentID = aStudentID;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public s
}
