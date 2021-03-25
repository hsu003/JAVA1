package day03;

import java.util.*;
import java.text.*;

@SuppressWarnings("unused")
public class Exam_03 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1997);
		cal.set(Calendar.MONTH, 8);
		cal.set(Calendar.DAY_OF_MONTH, 9);
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		int month = cal.get(Calendar.MONTH) + 1;
		System.out.println(month);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		String stweek[] = {"일요일","월요일","화요일",
				"수요일","목요일","금요일","토요일"};
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(stweek[week-1]);
		/*
		System.out.println(cal);
		String stweek[] = {"일요일","월요일","화요일",
								"수요일","목요일","금요일","토요일"};
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("현재 날짜 : " 
				+ year +"년 " + month+"월 " + day+"일 " + stweek[week-1]);
		*/
		/*
		Date date = new Date();
		System.out.println("date = " + date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("현재시간 : " + sdf.format(date));
		*/
		/*
		int price = 1000000;
		System.out.println("가격 : " + price);
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println("가격 : " + df.format(price));
		*/
	}
}

