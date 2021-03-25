package day02;

import java.util.*;

public class Exam_01 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
			HashSet<String> hs =new HashSet();
			
			hs.add("유재석");  //데이터 삽입
			hs.add("하하");
			hs.add("김종국");
			hs.add("송지효");
			hs.add("이광수");
			hs.add("전소민");
			hs.add("양세찬");
			
			System.out.println(hs);
			Iterator it = hs.iterator();   //데이터를 반복자로 넘겨 준다.
			while(it.hasNext()) { //데이터의 끝이면 false, 끝이 아니면 true
				Object obj=it.next();//다음 데이터로 이동, 현재 데이터는 obj에 넘김
				String name= (String)obj;
				System.out.println(name);
			}
			
		/*	String name="강호동";
			if(hs.contains(name)) {  //찾고자하는 데이터가 있는지 없는지..
				System.out.println(name+"님은 런닝맨 멤버입니다.");
			}else {
				System.out.println(name+"님은 런닝맨 멤버가 아닙니다.");
			}
			
			System.out.println("런닝맨의 고정 맴버는"+hs.size()+"명 입니다.");//hashSet 크기
			
			
			String name2= "양세찬";
			if(hs.remove(name2)) {//해당 데이터가 있으면 삭제후 true, 없으면 false
				System.out.println(name2+"님이 탈퇴하였습니다.");
			}else {
				System.out.println(name2+"님은 런닝맨 멤버가 아닙니다.");
			}
			
			System.out.println(name2+"님 삭제후 인원은"+hs.size()+"명 입니다."); */
	}

}
