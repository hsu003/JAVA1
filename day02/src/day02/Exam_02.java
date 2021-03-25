package day02;

import java.util.*;
import java.io.*;
class Member implements Comparable<Member>{
	
	//����ʵ�
	private String name;
	private String tel;
	//������
	public Member(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	//setter�޼ҵ�
	public void setTel(String tel) {
		this.tel = tel;
	}
	//getter�޼ҵ�
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	//business �޼ҵ�
	public void disp() {
		System.out.println(name+"���� ��ȭ��ȣ�� " + tel +"�� �Դϴ�.");
	}
	
	@Override
	public int compareTo(Member o) {
		if (name.length() < o.getName().length()) {
			return 1;
		}else {
			return -1;
		}
	}
}

interface MemberPro{
	public void input();
	public void view();
	public void edit();
	public void delete();
	public void exit();
}
class MemberMg implements MemberPro{
	private HashSet<Member> hs;
	private Scanner in;
	
	public MemberMg() {
		hs = new HashSet<>();
		in = new Scanner(System.in);
	}

	@Override
	public void input() {
		String name = null;
		do {
			System.out.print("�̸��� �Է� : ");
			name = in.next();
		}while(checkName(name));
		System.out.print("��ȭ��ȣ�� �Է� : ");
		String tel = in.next();
		Member input = new Member(name, tel);
		hs.add(input);
	}

	@Override
	public void view() {
		Iterator<Member> it = hs.iterator();
		while(it.hasNext()) {
			Member view = it.next();
			view.disp();
		}
		
	}
	protected boolean checkName(String name) {
		Iterator<Member> it = hs.iterator();
		while(it.hasNext()) {
			Member check = it.next();
			if (check.getName().equals(name)) {
				System.out.println("�ش��ϴ� ȸ���� �����մϴ�.");
				return true;
			}
		}
		return false;
	}
	protected Member getMember(String str) {
		System.out.print(str+"�� ȸ���� �̸� : ");
		String name = in.next();
		Iterator<Member> it = hs.iterator();
		while(it.hasNext()) {
			Member find = it.next();
			if (name.equals(find.getName())) {
				return find;
			}
		}
		System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
		return null;
	}
	@Override
	public void edit() {
		Member edit = getMember("����");
		if (edit != null) {
			System.out.println
			("���� ��ȭ��ȣ�� " + edit.getTel()+"�� �Դϴ�.");
			System.out.print("������ ��ȭ��ȣ�� �Է� : ");
			String tel = in.next();
			System.out.println
			(edit.getTel()+ "���� " + tel +"������ �����մϴ�.");
			edit.setTel(tel);
		}
	}

	@Override
	public void delete() {
		Member delete = getMember("����");
		if (delete != null) {
			System.out.println(delete.getName()+"���� �����մϴ�.");
			hs.remove(delete);
		}
	}

	@Override
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.!!");
		System.exit(0);
	}
}

class TelSort implements Comparator<Member>{
	
	@Override
	public int compare(Member o1, Member o2) {
		if (o1.getTel().length() < o2.getTel().length()) {
			return 1;
		}else {
			return -1;
		}
	}
	
}


public class Exam_02 {
	public static void main(String[] args) throws IOException {
		ArrayList<Member> list = new ArrayList<Member>();
		list.add(new Member("aaa", "1234123123"));
		list.add(new Member("a", "123411"));
		list.add(new Member("aaaaaaa", "1234"));
		
		//Collections.sort(list);
		Collections.sort(list, new TelSort());
		for(Member mem : list) {
			mem.disp();
		}
		
		/*MemberPro pro = new MemberMg();
		while(true) {
			System.out.print("1.�Է�  2.���  3.����  4.����  5.���� : ");
			int select = System.in.read() - 48;
			System.in.skip(5);
			switch(select) {
			case 1 : pro.input(); break;
			case 2 : pro.view(); break;
			case 3 : pro.edit(); break;
			case 4 : pro.delete(); break;
			case 5 : pro.exit(); break;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ��Է��� �ּ���!!");
			}
		}*/
	}
}
