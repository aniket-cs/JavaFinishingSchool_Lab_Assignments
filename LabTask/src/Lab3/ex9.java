package Lab3;
import java.sql.SQLOutput;
import java.time.*;
import java.util.*;

public class ex9 {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the year :  ");
            int year = input.nextInt();

            System.out.print("\nEnter the month in number (for example January=1, February=2) : ");
            int month = input.nextInt();

            System.out.print("\nEnter the day : ");
            int day = input.nextInt();

            LocalDate pdate = LocalDate.of(year, month, day);
            LocalDate now = LocalDate.now();

            Period diff = Period.between(pdate, now);

            System.out.printf("\n\nDifference is %d years, %d months and %d days\n\n",
                    diff.getYears(), diff.getMonths(), diff.getDays());
        }
    }


