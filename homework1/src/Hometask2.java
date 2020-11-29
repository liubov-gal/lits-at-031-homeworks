import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Hometask2 {
    public static void main(String args[]){
        Integer[] list = {18, 23, 6, 89, 15, 15, 6, 34, 44, 12};
        Arrays.sort(list, Collections.reverseOrder());
        System.out.println(Arrays.toString(list));

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(list));
        Integer[] listnew = linkedHashSet.toArray(new Integer[] {});
        System.out.println(Arrays.toString(listnew));
    }
}
