public class APCalendar {
    /** Returns true if year is a leap year and false otherwise. */
    private static boolean isLeapYear(int year)
    {
        if(year % 400 == 0) {
            return true;
        }
        else if(year % 100 != 0)
        {
            return year % 4 == 0;
        }

        return false;
    }
    /** Returns the number of leap years between year1 and year2, inclusive.
     * Precondition: 0 <= year1 <= year2
     */
    public static int numberOfLeapYears(int year1, int year2)
    {
        int numLeaps = 0;
        for(int i = year1; i <= year2; i++)
        {
            if(isLeapYear(i))
            {
                numLeaps++;
            }
        }
        return numLeaps;
    }
    /** Returns the value representing the day of the week for the first day of year,
     * where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
     */
    private static int firstDayOfYear(int year)
    {
        return ((1 + 2 + (3/5) + year + (year/4) - (year/100) + (year/400) + 2) % 7) - 1;

    }
    /** Returns n, where month, day, and year specify the nth day of the year.
     * Returns 1 for January 1 (month = 1, day = 1) of any year.
     * Precondition: The date represented by month, day, year is a valid date.
     */
    private static int dayOfYear(int month, int day, int year)
    {
        int d = 0;
        for(int i = 1; i < month; i++)
        {
            if(isLeapYear(year))
            {
                if(i == 2)
                {
                    d += 28;
                }
                else
                {
                    if(i % 2 == 0)
                    {
                        d += 30;
                    }
                    else
                    {
                        d += 31;
                    }
                }
            }
            else if(i % 2 == 0)
            {
                d += 30;
            }
        }
        return d + day;
    }
    /** Returns the value representing the day of the week for the given date
     * (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
     * and 6 denotes Saturday.
     * Precondition: The date represented by month, day, year is a valid date.
     */
    public static int dayOfWeek(int month, int day, int year)
    {
        return ((day + 2 * (month) + (3 * ((month)+1)/5) + year + (year/4) - (year/100) + (year/400) + 2) % 7) - 1;
    }
}