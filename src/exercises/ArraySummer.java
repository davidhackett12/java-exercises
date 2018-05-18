package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySummer {
    public static Double summer(ArrayList<Double> numbers) {
        ArrayList<Double> numList;
        numList = numbers;
        Double sum = 0.00;
        for (Double i : numList) sum += i;
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<Double> numlist;
        numlist =  new ArrayList<Double>(Arrays.asList(1.00,7.00,3.00));
        Double result = summer(numlist);
        System.out.println(result);

    }
}
