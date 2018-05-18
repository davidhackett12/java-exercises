package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAdder {
    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(3, 4, 5, 1));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1, 6));
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < first.size(); i++) {
            if (i < second.size()) {
                Integer newNum = first.get(i) + second.get(i);
                result.add(newNum);
            } else {
                result.add(first.get(i));
            }
        }
        System.out.println(result);
    }
}