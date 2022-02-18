import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        int [] unsorted = {1, 5, 19 , 24, 142, 6, 2, 1, 6};
        int temp = 0;
        for (int i = 0; i < unsorted.length; i++) {
            for (int j = i + 1; j < unsorted.length ; j++) {
                if (unsorted[i] > unsorted[j]){
                    temp = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(unsorted));
    }
}
