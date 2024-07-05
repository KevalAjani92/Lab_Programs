import java.util.*;
public class C_10_Year{
    public static void main(String[] args){
        int day;
        System.out.println("Enter your day");
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();
        int n = day;

        int year;
        int month;
        int week;

        year = day/365;

        month = (day%365)/30;

        week = (day - (year*365 + month*30))/7;

        day = (day - (year*365 + month*30 + week*7));

        System.out.println(n+"days="+year+"year,"+month+"month,"+week+"week,"+day+"day");

    }
}