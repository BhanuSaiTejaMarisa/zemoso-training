package org.networking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.lang.String;
import java.util.Scanner;

public class KYCDate {
    public static void main(String[] args) throws ParseException {


            Scanner lines=new Scanner(System.in);
            int T=Integer.parseInt(lines.next());
        String[] startDate=new String[T];
        String[] endDate=new String[T];
//
            int i=0;
            while(i<T){
                startDate[i]= lines.next();
                endDate[i]=lines.next();


                i++;
            }
        System.out.println(T);
        System.out.println(Arrays.toString(startDate));
        System.out.println(Arrays.toString(endDate));
            i=0;
            while(i<T){
                LocalDate date1=LocalDate.parse(startDate[i], DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                LocalDate date2=LocalDate.parse(endDate[i], DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                int year2=date2.getYear();
                if(date1.isAfter(date2)){
                    System.out.println("no range");
                }
                else{
                    date1=date1.withYear(year2);

                    if(date1.plusDays(30).isAfter(date2)){
                        System.out.println(date1.minusDays(30).format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))+" "+date2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

                    }
                    else{
                        System.out.println(date1.minusDays(30).format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))+" "+date1.plusDays(30).format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

                    }
                }
//                System.out.println(date1+" "+date2+" "+year2+" changed yr date1 ");
                i++;
            }



    }
}
