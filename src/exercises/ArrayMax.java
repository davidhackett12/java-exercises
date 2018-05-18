package exercises;

public class ArrayMax {
    public static int findMax(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] x = {4,10,2,8,3,14,5};
        int result = findMax(x);
        System.out.println(result);
    }
}
