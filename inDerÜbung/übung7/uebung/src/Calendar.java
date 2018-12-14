import java.util.*;

public class Calendar {
    // Inhalt in die Lokale Variable rein schreiben
    public Calendar() {
        days = new ArrayList<String>();
        days.add("Montag");
        days.add("Dienstag");
        days.add("Mittwoch");
        days.add("Donnerstag");
        days.add("Freitag");
        days.add("Samstag");
        days.add("Sonntag");
    }

    // Return the week day as a Strung using the array list and the
    // day number.
    public String computeWeekday(int day, int mon, int year) {
        return days.get(computeWeekdayInt(day, mon, year));
    }

    // Find out the day number and return it. Wir wissen das der
    // 1.1.1900 ein Montag ist.
    public int computeWeekdayInt(int day, int mon, int year) {
        int days = 0;
        days += getDaysForAllCompleteYears(year);
        days += getDaysForAllCompleteMonths(mon, year);
        days += day;
        days--;  // Accounting for the 1 at the beginning of 1.1.1990
        return (days % 7);
    }

    // Return the number of days in all the completed months of this
    // year.
    public int getDaysForAllCompleteMonths(int mon, int year) {
        int days = 0;
        for (int m = 1; m < mon; m++) {
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                days = days + 31;
            } else {
                if (m != 2) {
                    days += 30;
                } else {
                    days += 28;
                    if (isLeapYear(year)) {
                        days += 1;
                    }
                }
            }
        }
        return days;
    }

    // Is it a leapyear? Jedes 4. Jahr ist ein Schaltjahr. jedes 100
    // Jar ist kein Schaltjahr. Jedes 400. Jahr ist doch ein
    // Schaltjahr...
    public boolean isLeapYear(int year) {
        return ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)));
    }

    // How many days passed so far?
    public int getDaysForAllCompleteYears(int year) {
        int days = 0;
        for (int y = 1900; y < year; y++) {
            days += 365;
            if (isLeapYear(y)) {
                days += 1;
            }
        }
        return days;
    }

    ArrayList<String> days;

    public static void main(String[] args) {
        Calendar cal = new Calendar();

        int day = 15;
        int mon = 6;
        int year = 2016;

        /*
        int day = 21;
        int mon = 7;
        int year = 1969;
        */

        // Mittwoch soll raus kommen.. 
        System.out.println("Tag: " + cal.computeWeekday(day, mon, year));
    }
}
