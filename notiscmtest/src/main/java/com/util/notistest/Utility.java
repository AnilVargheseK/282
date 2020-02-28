/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util.notistest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


public class Utility {
    
    
	public static String getDateFromJiffy(long dtVal)
	  {
	    long retDate = (int)(dtVal / 65536L) + 315513000l;
                Date newDate = new Date(retDate * 1000);
		 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:MM:ss");
		 simpleDateFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		 String date = simpleDateFormat.format(newDate);
		 System.out.println("date from jiffy format:=========>"+date);
	    return date;
	  }

	public static String getDateFromNonJiffy(long dtVal)
	 {
		 long retDate = (dtVal + 315513000l);
                  Date newDate1 = new Date(retDate * 1000);
                  SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:MM:ss");
		 simpleDateFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		 String date1 = simpleDateFormat.format(newDate1);
		 System.out.println("date from 1980 format:=========>"+date1);
		 return date1;
	 }

	public static String getDateFromNonJiffy1(long dtVal)
	 {
             Date newDate2 = new Date(dtVal);
             SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:MM:ss");
		 simpleDateFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		 String date2 = simpleDateFormat.format(newDate2);
		 System.out.println("date from 1970 format:=========>"+date2);
		 return date2;
	 }

	 
}
