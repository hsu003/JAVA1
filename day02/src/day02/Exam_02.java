package day02;

import java.util.*;
import java.io.*;
class Member implements Comparable<Member>{
	
	//멤버필드
	private String name;
	private String tel;
	//생성자
	public Member(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	//setter메소드
	public void setTel(String tel) {
		this.tel = tel;
	}
	//getter메소드
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	//business 메소드
	public void disp() {
		System.out.println(name+"님의 전화번호는 " + tel +"번 입니다.");
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
			System.out.print("이름을 입력 : ");
			name = in.next();
		}while(checkName(name));
		System.out.print("전화번호를 입력 : ");
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
				System.out.println("해당하는 회원은 존재합니다.");
				return true;
			}
		}
		return false;
	}
	protected Member getMember(String str) {
		System.out.print(str+"할 회원의 이름 : ");
		String name = in.next();
		Iterator<Member> it = hs.iterator();
		while(it.hasNext()) {
			Member find = it.next();
			if (name.equals(find.getName())) {
				return find;
			}
		}
		System.out.println(name+"님은 저희 회원이 아닙니다.");
		return null;
	}
	@Override
	public void edit() {
		Member edit = getMember("수정");
		if (edit != null) {
			System.out.println
			("현재 전화번호는 " + edit.getTel()+"번 입니다.");
			System.out.print("수정할 전화번호를 입력 : ");
			String tel = in.next();
			System.out.println
			(edit.getTel()+ "번을 " + tel +"번으로 수정합니다.");
			edit.setTel(tel);
		}
	}

	@Override
	public void delete() {
		Member delete = getMember("삭제");
		if (delete != null) {
			System.out.println(delete.getName()+"님을 삭제합니다.");
			hs.remove(delete);
		}
	}

	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.!!");
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
			System.out.print("1.입력  2.출력  3.수정  4.삭제  5.종료 : ");
			int select = System.in.read() - 48;
			System.in.skip(5);
			switch(select) {
			case 1 : pro.input(); break;
			case 2 : pro.view(); break;
			case 3 : pro.edit(); break;
			case 4 : pro.delete(); break;
			case 5 : pro.exit(); break;
			default : System.out.println("잘못입력하셨습니다. 다시입력해 주세요!!");
			}
		}*/
	}
}
