package day02;

import java.util.*;

public class Exam_03 {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<>();
		
		ht.put("���缮", "���׸�");
		ht.put("������", "�߱�����");
		ht.put("�����", "�౸����");
		ht.put("��ȣ��", "���׸�");
		ht.put("���缮", "����");
		if (ht.containsKey("���缮")) {
			System.out.println(ht.get("���缮"));
		}
		
		Enumeration<String> enu = ht.keys();//Ű���� �ݺ��ڷ� �����ش�
		while(enu.hasMoreElements()) {//Iterator�� hasNext()
			String key = enu.nextElement();//Iterator�� next()
			String value = ht.get(key);
			System.out.println(key+"���� ������ " + value+"�Դϴ�.");
		}
		
		//ht.put("���缮", "����");	//�������� ���� ������ �ȴ�
		
		
		//System.out.println("ht�� ũ�� : " + ht.size());
	}
}
