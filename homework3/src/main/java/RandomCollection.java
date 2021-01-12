import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomCollection {
    public static void main(String[] args) {
        String[] list = {"Collection", "String", "Book", "LITS Academy", "Hello guy"};
        List<String> newCollection = new ArrayList<String>();

        for (String str : list) {
            int itemLen = str.length();

            if (6 <= itemLen && itemLen <= 15) {
                newCollection.add(str);
            }
        }

        generateRandomCollection(newCollection);
    }

    static String generateRandomCollection(List<String> list) {
        Random randomList = new Random();
        int filteredStringListItem = randomList.nextInt(list.size());
        String randomItem = list.get(filteredStringListItem);

        System.out.println(randomItem);
        return randomItem;
    }
}