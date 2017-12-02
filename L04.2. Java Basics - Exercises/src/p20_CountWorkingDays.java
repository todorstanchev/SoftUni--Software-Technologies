import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class p20_CountWorkingDays {

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Calendar currentDate = Calendar.getInstance();
        currentDate.setTime(dateFormat.parse(scanner.nextLine()));

        Calendar endDate = Calendar.getInstance();
        endDate.setTime(dateFormat.parse(scanner.nextLine()));

        List<Calendar> holidays = new ArrayList<>();

        for (int i = 0; i < 11; i++) {

            holidays.add(Calendar.getInstance());
        }

        holidays.get(0).setTime(dateFormat.parse("01-01-2016"));
        holidays.get(1).setTime(dateFormat.parse("03-03-2016"));
        holidays.get(2).setTime(dateFormat.parse("01-05-2016"));
        holidays.get(3).setTime(dateFormat.parse("06-05-2016"));
        holidays.get(4).setTime(dateFormat.parse("24-05-2016"));
        holidays.get(5).setTime(dateFormat.parse("06-09-2016"));
        holidays.get(6).setTime(dateFormat.parse("22-09-2016"));
        holidays.get(7).setTime(dateFormat.parse("01-10-2016"));
        holidays.get(8).setTime(dateFormat.parse("24-12-2016"));
        holidays.get(9).setTime(dateFormat.parse("25-12-2016"));
        holidays.get(10).setTime(dateFormat.parse("26-12-2016"));

        int workingDaysCount = 0;

        do {
            if (currentDate.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY
                    && currentDate.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {

                boolean isHoliday = false;

                for (Calendar holiday : holidays) {

                    if (currentDate.get(Calendar.DAY_OF_MONTH)
                            == holiday.get(Calendar.DAY_OF_MONTH)
                            && currentDate.get(Calendar.MONTH)
                            == holiday.get(Calendar.MONTH)) {

                        isHoliday = true;
                        break;
                    }
                }

                if (!isHoliday) {

                    workingDaysCount++;
                }
            }

            currentDate.add(Calendar.DATE, 1);

        } while (currentDate.getTimeInMillis() <= endDate.getTimeInMillis());

        System.out.println(workingDaysCount);
    }
}