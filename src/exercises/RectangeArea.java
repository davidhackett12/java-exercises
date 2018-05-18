package exercises;

import java.util.Scanner;

public class RectangeArea {
    public static void main(String[] args) {
        int width;
        int height;
        int area;
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("What is the Width?");
        width = in.nextInt();
        System.out.println("What is the height?");
        height = in.nextInt();
        area = width * height;
        System.out.println(area);

    }
}
