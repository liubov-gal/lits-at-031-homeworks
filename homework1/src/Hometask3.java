import java.util.Arrays;
import java.util.Collections;

public class Hometask3 {
    public static void main(String args[]) {
        Integer[] list = {18, 23, 6, 89, 15, 15, 34, 44, 12, 6};
        int min = Collections.min(Arrays.asList(list));
        System.out.println(min);
        int sum = 0;
        int minNumber = 0;


        for(int i = 0; i < list.length; i++){
            sum += list[i];
            if (list[i] == min) {
                minNumber = i;
            }
        }
        int averageList = sum / list.length;
        for(int i = 0; i < list.length; i++){
            list[minNumber] = averageList;
        }
        System.out.println(minNumber);
        System.out.println(averageList);
        System.out.println(Arrays.toString(list));
    }
}
