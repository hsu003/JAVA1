package day02;

import java.util.*;

public class Exam_04 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList<String> list = new ArrayList();
		// Set, List�� ����
		list.add("���缮");
		list.add("����");
		list.add("�̱���");
		list.add(1, "������");
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
		// } Ȯ�� ���� �迭�� ������ �ִ� ��� ������ �ϳ��� ������ ���� �� �Ѵ�.

		//for (int i = 0; i < list.size(); ++i) {
		//	String name = list.get(i);
		//	System.out.println(name);
		//}
	}

}
