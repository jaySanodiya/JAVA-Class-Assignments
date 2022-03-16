package com.week3.Wednesday;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class EmployeeBonus {
    public double BonusIs(String jd) throws Exception {
        int year =0;
       try{
           LocalDate date = LocalDate.parse(jd, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
           Period period = Period.between(date,LocalDate.now());
           year = period.getYears();
       }
       catch (Exception err){
           System.out.println("Please pass the date in correct format");
           System.exit(0);
       }

        if(year<0){
            InvalidAge ex = new InvalidAge("Age should not be in the future ");
            throw ex;
        }
        else if(year<1){
            return 5000;
        }
        else if(year<2){
            return 8000;
        }
        else{
            return 10000;
        }
    }
}
