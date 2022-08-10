package ezen0809_APIs.sec14.exam01_date;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
   public static void main(String[] args) {
      Date now = new Date();
      String strNow1 = now.toString();      
      System.out.println(strNow1);
      
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
      String strNow2 = sdf.format(now);
      System.out.println(strNow2);
      
      
     //이 밑으로 쌤이 추가하심.
      Calendar cc = Calendar.getInstance();
      System.out.println(cc);
      
      Timestamp tt = new Timestamp(System.currentTimeMillis());
      System.out.println(tt);
      
      
   }
}
