import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class p20_CountWorkingDays {

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        String strStartDate = scanner.nextLine();
        String strEndDate = scanner.nextLine();

        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");

        Date startDate = formatDate.parse(strStartDate);
        Date endDate = formatDate.parse(strEndDate);

        Calendar startCal = Calendar.getInstance();
        startCal.setTime(startDate);

        Calendar endCal = Calendar.getInstance();
        endCal.setTime(endDate);

        String currentYear = strStartDate.substring(6);

        Date[] holidays = new Date[11];

        holidays[0] = formatDate.parse(String.format("01-01-%s", currentYear));
        holidays[1] = formatDate.parse(String.format("03-03-%s", currentYear));
        holidays[2] = formatDate.parse(String.format("01-05-%s", currentYear));
        holidays[3] = formatDate.parse(String.format("06-05-%s", currentYear));
        holidays[4] = formatDate.parse(String.format("24-05-%s", currentYear));
        holidays[5] = formatDate.parse(String.format("06-09-%s", currentYear));
        holidays[6] = formatDate.parse(String.format("22-09-%s", currentYear));
        holidays[7] = formatDate.parse(String.format("01-10-%s", currentYear));
        holidays[8] = formatDate.parse(String.format("24-12-%s", currentYear));
        holidays[9] = formatDate.parse(String.format("25-12-%s", currentYear));
        holidays[10] = formatDate.parse(String.format("26-12-%s", currentYear));

        int workDays = 0;

        do {

            if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY
                    && startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {

                Date date = startCal.getTime();

                String year = "" + startCal.get(Calendar.YEAR);

                if (!year.equals(currentYear)) {

                    currentYear = year;

                    holidays[0] = formatDate.parse(String.format("01-01-%s", currentYear));
                    holidays[1] = formatDate.parse(String.format("03-03-%s", currentYear));
                    holidays[2] = formatDate.parse(String.format("01-05-%s", currentYear));
                    holidays[3] = formatDate.parse(String.format("06-05-%s", currentYear));
                    holidays[4] = formatDate.parse(String.format("24-05-%s", currentYear));
                    holidays[5] = formatDate.parse(String.format("06-09-%s", currentYear));
                    holidays[6] = formatDate.parse(String.format("22-09-%s", currentYear));
                    holidays[7] = formatDate.parse(String.format("01-10-%s", currentYear));
                    holidays[8] = formatDate.parse(String.format("24-12-%s", currentYear));
                    holidays[9] = formatDate.parse(String.format("25-12-%s", currentYear));
                    holidays[10] = formatDate.parse(String.format("26-12-%s", currentYear));
                }

                if (!Arrays.asList(holidays).contains(date)) {

                    workDays++;
                }
            }

            startCal.add(Calendar.DAY_OF_MONTH, 1);
        } while (startCal.getTimeInMillis() <= endCal.getTimeInMillis());

        System.out.println(workDays);
    }
}