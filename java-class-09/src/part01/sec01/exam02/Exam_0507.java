package part01.sec01.exam02;

import java.io.IOException;
import java.util.Scanner;

class RoomMg {
	Scanner s;
	boolean room[];
	int roomsu;

	RoomMg() { // ������ ��ü�� ����� ���� �ʵ尪 �ʱ�ȭ�� ����
		s = new Scanner(System.in);
		System.out.print("���� ������ �Է� : ");
		roomsu = s.nextInt();
		room = new boolean[roomsu];
	}

	void input() {
		int roomNum;
		boolean check = true;
		do {
			System.out.println("�Խ��Ͻ� ���� ��ȣ�� �Է��ϼ���  : ");
			roomNum = s.nextInt();
			if (roomNum < 1 || roomNum > roomsu) {
				System.out.println(roomNum + "ȣ���� �����ϴ�.");
			} else {
				check = false;
			}

		} while (check);

		if (room[roomNum]) {
			System.out.println(roomNum + " ȣ���� ���� ����� �Դϴ�.");
		} else {
			room[roomNum] = true;
			System.out.println(roomNum + " ȣ�ǿ� �Խ� �ϼ̽��ϴ�.");
		}
	}

	void output() {
		int roomNum;
		boolean check = true;
		do {
			System.out.println("����Ͻ� ���� ��ȣ�� �Է� : ");
			roomNum = s.nextInt();
			if (roomNum < 1 || roomNum > roomsu) {
				System.out.println(roomNum + " ȣ���� �����ϴ�.");
			} else {
				check = false;
			}

		} while (check);
		if (room[roomNum]) {
			room[roomNum] = false;
			System.out.println(roomNum + " ȣ�ǿ��� ��� �ϼ̽��ϴ�.");
		} else {
			System.out.println(roomNum + " ȣ���� ����Դϴ�.");
		}
	}

	void view() {
		for (int i = 0; i <= room.length; i++) {
			if (room[i]) {
				System.out.println(i + 1 + " ���� ����� �Դϴ�.");
			} else {
				System.out.println(i + 1 + " ���� ��� �Դϴ�.");
			}
		}
	}

	void exit() {
		System.out.println("���α׷��� ���� �մϴ�.");
		// return;
		System.exit(0); // ��ü ���α׷��� ���� �ϴ� ��ɾ�
	}

}

public class Exam_0507 {
	public static void main(String[] args) throws IOException {
		RoomMg room = new RoomMg();

		while (true) {
			System.out.print("1.�Խ� 2.��� 3.���� 4.����");
			int select = System.in.read();

			switch (select) {
			case 1:
				room.input();
				break;
			case 2:
				room.output();
				break;
			case 3:
				room.view();
				break;
			case 4:
				room.exit();
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}

		}
	}
}
