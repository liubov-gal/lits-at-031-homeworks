import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ReplaceDate {
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

    public static void main(String[] args) {
        Date currentDate = new Date();

        replaceCurrentDate(currentDate);
    }

    static void replaceCurrentDate(Date date) {
        Calendar newDate = Calendar.getInstance();
        newDate.setTime(date);

        newDate.add(Calendar.YEAR, 5);
        newDate.add(Calendar.MONTH, 5);
        newDate.add(Calendar.DATE, 5);

        Date changedDate = newDate.getTime();

        System.out.println(dateFormat.format(changedDate));
    }
}
