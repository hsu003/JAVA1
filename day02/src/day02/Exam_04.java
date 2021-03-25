package day02;

import java.util.*;

public class Exam_04 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList<String> list = new ArrayList();
		// Set, List는 형제
		list.add("유재석");
		list.add("하하");
		list.add("이광수");
		list.add(1, "김종국");
		System.out.println(list);

		String[] name = new String[list.size()];
		list.toArray(name);
		for(int i=0;i<name.length;++i) {
			System.out.println(name[i]);
		}
		//Iterator<String> it = list.iterator();
		//while (it.hasNext()) {
		//}
		//for (Iterator<String> it1 = list.iterator(); it1.hasNext();) {
		//	String name = it1.next();
		//	System.out.println(name);
		//}
		// for(String name : list) {
		// System.out.println(name);
		// } 확장 포문 배열에 가지고 있는 모든 내용을 하나씩 꺼내어 값을 비교 한다.

		//for (int i = 0; i < list.size(); ++i) {
		//	String name = list.get(i);
		//	System.out.println(name);
		//}
	}

}
