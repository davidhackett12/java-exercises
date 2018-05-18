package exercises;

import java.util.Scanner;


public class GasMile {
    public static void main(String[] args) {
        double gasUsed;
        double miles;
        double gasMileage;
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("How many gallons of gas have you used?");
        gasUsed = in.nextDouble();
        System.out.println("How many miles have you traveled?");
        miles = in.nextDouble();
        gasMileage = miles/gasUsed;
        System.out.println(gasMileage);
    }
}