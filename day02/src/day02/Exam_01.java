package day02;

import java.util.*;

public class Exam_01 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
			HashSet<String> hs =new HashSet();
			
			hs.add("���缮");  //������ ����
			hs.add("����");
			hs.add("������");
			hs.add("����ȿ");
			hs.add("�̱���");
			hs.add("���ҹ�");
			hs.add("�缼��");
			
			System.out.println(hs);
			Iterator it = hs.iterator();   //�����͸� �ݺ��ڷ� �Ѱ� �ش�.
			while(it.hasNext()) { //�������� ���̸� false, ���� �ƴϸ� true
				Object obj=it.next();//���� �����ͷ� �̵�, ���� �����ʹ� obj�� �ѱ�
				String name= (String)obj;
				System.out.println(name);
			}
			
		/*	String name="��ȣ��";
			if(hs.contains(name)) {  //ã�����ϴ� �����Ͱ� �ִ��� ������..
				System.out.println(name+"���� ���׸� ����Դϴ�.");
			}else {
				System.out.println(name+"���� ���׸� ����� �ƴմϴ�.");
			}
			
			System.out.println("���׸��� ���� �ɹ���"+hs.size()+"�� �Դϴ�.");//hashSet ũ��
			
			
			String name2= "�缼��";
			if(hs.remove(name2)) {//�ش� �����Ͱ� ������ ������ true, ������ false
				System.out.println(name2+"���� Ż���Ͽ����ϴ�.");
			}else {
				System.out.println(name2+"���� ���׸� ����� �ƴմϴ�.");
			}
			
			System.out.println(name2+"�� ������ �ο���"+hs.size()+"�� �Դϴ�."); */
	}

}
