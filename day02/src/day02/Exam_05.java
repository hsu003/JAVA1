package day02; 

import java.io.*;
import java.util.*;


class SungJuk {
	private String name;
	private int kor;
	private int eng;
	private int tot;
	private int rank;

	public SungJuk(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.tot = kor + eng;
		this.rank = 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public void clearRank() {
		rank = 1;
	}

	public void plusRank() {
		rank++;
	}

	public void disp() {
		System.out.println(name + " ���� ������ " + tot + " �� �̰� , ������ " + rank + " �� �Դϴ�.");
	}
}

interface SungPro {
	public void input();

	public void view();

	public void edit();

	public void delete();

	public void exit();
}

class SungProImpl implements SungPro {
	@SuppressWarnings("unused")
	private HashSet<SungJuk> set;
	private Scanner s;

	public SungProImpl() {
		set = new HashSet<SungJuk>();
		s = new Scanner(System.in);
	}

	public int inputSub(String str) {
		int sub;
		while (true) {
			System.out.println(str + " ������ ������ �Է� :");
			sub = s.nextInt();
			break;
		}
		return sub;
	}

	public void input() {
		System.out.print("�̸����Է� ");
		String name = s.next();
		int kor = inputSub("����");
		int eng = inputSub("����");
		SungJuk input = new SungJuk(name, kor, eng);
		set.add(input);

	}

	public void rank() {
		SungJuk[] rank = new SungJuk[set.size()];
		set.toArray(rank);
		for (int i = 0; i < rank.length; i++) {
			rank[i].clearRank();
			for (int k = 0; k < rank.length; k++) {
				if (rank[i].getTot() < rank[k].getTot()) {
					rank[i].plusRank();
				}
			}
		}
	}

	public void view() {
		rank();

		Iterator<SungJuk> it = set.iterator();
		while (it.hasNext()) {
			SungJuk view = it.next();
			view.disp();
		}
	}

	public void edit() {
		System.out.print("������ �л��� �̸� �Է� : ");
		String name = s.next();
		Iterator<SungJuk> it = set.iterator();
		while (it.hasNext()) {
			SungJuk edit = it.next();
			if (name.equals(edit.getName())) {
				System.out.println(name + " ���� ���� ���� ������ : " + edit.getKor() + "�� �Դϴ�.");
				int kor = inputSub("������ ����");
				System.out.println(name + " ���� ���� ���� ������ : " + edit.getEng() + "�� �Դϴ�.");
				int eng = inputSub("������ ����");

				edit.setKor(kor);
				edit.setEng(eng);
				System.out.println(name + " �л��� ������ �����Ͽ����ϴ�.");
				return;
			}
		}
		System.out.println(name + " ���� ���� �л��� �ƴմϴ�.");
	}

	public void delete() {
		System.out.println("������ �л��� �̸� �Է�: ");
		String name = s.next();

		Iterator<SungJuk> it = set.iterator();
		while (it.hasNext()) {
			SungJuk del = it.next();
			if (name.equals(del.getName())) {
				set.remove(del);
				System.out.println(name + " �л��� ���� �Ͽ����ϴ�.");
				return;
			}
		}
		System.out.println(name + " ���� ���� �л��� �ƴմϴ�.");
	}

	public void exit() {
		System.out.println("���α׷��� �����մϴ�.!!");
		System.exit(0);

	}
}

public class Exam_05 {

	public static void main(String[] args) throws IOException {
		SungPro pro = new SungProImpl();
		while (true) {
			System.out.print("1.�Է�  2.���  3.����  4.����  5.����\n");
			System.out.print("��ȣ �Է� �ϼ��� : ");
			int select = System.in.read() - 48;
			System.in.skip(2);

			switch (select) {
			case 1:
				pro.input();
				break;
			case 2:
				pro.view();
				break;
			case 3:
				pro.edit();
				break;
			case 4:
				pro.delete();
				break;
			case 5:
				pro.exit();
				break;
			default:
				System.out.println(" �߸� �Է� �ϼ̽��ϴ�.");
			}
		}

	}

}
