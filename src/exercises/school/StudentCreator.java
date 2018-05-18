package exercises.school;

public class StudentCreator {

    public static void main(String[] args) {
        Student david = new Student("David",1,30,3.6);
        String name = david.getName();
        int credits = david.getCredits();
        System.out.println(name + " has " + credits +" credits" );
    }
}
