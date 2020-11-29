import java.util.Arrays;
import java.util.Collections;

public class Hometask3 {
    public static void main(String args[]) {
        Integer[] list = {18, 23, 6, 89, 15, 15, 6, 34, 44, 12};
        int min = Collections.min(Arrays.asList(list));
        System.out.println(min);
        int sum = 0;
        int min_dubl = 0;
        int counter = 1;


        for(int i = 0; i < list.length; i++){
            sum += list[i];
            if (list[i] == min) {
                min_dubl += 1;
            }
        }
        int average_list = sum / list.length;
        for(int i = 0; i < list.length; i++){
            if (list[i] == min) {
                if (min_dubl == counter){
                    list[i] = average_list;
                }
                counter += 1;
            }
        }
        System.out.println(min_dubl);
        System.out.println(Arrays.toString(list));
    }
}
