import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Hometask1 {
    public static void main(String args[]){
        Integer[] list = {18, 23, 7, 89, 10, 15, 6, 34, 44, 12};
        int average_list = list.length / 2;
        int min = Collections.min(Arrays.asList(list));
        System.out.println(min);
        int max = Collections.max(Arrays.asList(list));
        System.out.println(max);

        for (int i = 0; i < average_list; i++) {
            if (list[i] == max) {
                list[average_list] = min;
            }
        }
        System.out.println(Arrays.toString(list));
    }
}
