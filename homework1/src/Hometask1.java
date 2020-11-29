import java.util.Arrays;

public class Hometask1 {
    public static void main(String args[]){
        Integer[] list = {18, 23, 7, 89, 10, 15, 6, 34, 44, 12};
        int average_list = list.length / 2;

        for (int i = 0; i < average_list; i++) {
            list[i] = list[i] - 1;

        }

        System.out.println(Arrays.toString(list));
    }
}
