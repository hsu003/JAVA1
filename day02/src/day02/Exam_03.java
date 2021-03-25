package day02;

import java.util.*;

public class Exam_03 {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<>();
		
		ht.put("유재석", "개그맨");
		ht.put("류현진", "야구선수");
		ht.put("손흥민", "축구선수");
		ht.put("강호동", "개그맨");
		ht.put("유재석", "가수");
		if (ht.containsKey("유재석")) {
			System.out.println(ht.get("유재석"));
		}
		
		Enumeration<String> enu = ht.keys();//키값을 반복자로 보내준다
		while(enu.hasMoreElements()) {//Iterator의 hasNext()
			String key = enu.nextElement();//Iterator의 next()
			String value = ht.get(key);
			System.out.println(key+"님의 직업은 " + value+"입니다.");
		}
		
		//ht.put("유재석", "가수");	//같은값이 들어가면 수정이 된다
		
		
		//System.out.println("ht의 크기 : " + ht.size());
	}
}
