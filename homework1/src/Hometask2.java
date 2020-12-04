import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Hometask2 {
    public static void main(String args[]){
        Integer[] list = {18, 23, 6, 89, 15, 15, 6, 34, 44, 12};
        Collections.reverse(Arrays.asList(list));
        System.out.println(Arrays.toString(list));

        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(list));
        Integer[] listnew = linkedHashSet.toArray(new Integer[] {});
        System.out.println(Arrays.toString(listnew));
    }
}
