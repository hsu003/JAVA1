package part01.sec01.exam02;

import java.io.IOException;
import java.util.Scanner;

class RoomMg {
	Scanner s;
	boolean room[];
	int roomsu;

	RoomMg() { // 생성자 객체가 만들어 질때 필드값 초기화가 목적
		s = new Scanner(System.in);
		System.out.print("방의 갯수를 입력 : ");
		roomsu = s.nextInt();
		room = new boolean[roomsu];
	}

	void input() {
		int roomNum;
		boolean check = true;
		do {
			System.out.println("입실하실 방의 번호를 입력하세요  : ");
			roomNum = s.nextInt();
			if (roomNum < 1 || roomNum > roomsu) {
				System.out.println(roomNum + "호실은 없습니다.");
			} else {
				check = false;
			}

		} while (check);

		if (room[roomNum]) {
			System.out.println(roomNum + " 호실은 현재 사용중 입니다.");
		} else {
			room[roomNum] = true;
			System.out.println(roomNum + " 호실에 입실 하셨습니다.");
		}
	}

	void output() {
		int roomNum;
		boolean check = true;
		do {
			System.out.println("퇴실하실 방의 번호를 입력 : ");
			roomNum = s.nextInt();
			if (roomNum < 1 || roomNum > roomsu) {
				System.out.println(roomNum + " 호실은 없습니다.");
			} else {
				check = false;
			}

		} while (check);
		if (room[roomNum]) {
			room[roomNum] = false;
			System.out.println(roomNum + " 호실에서 퇴실 하셨습니다.");
		} else {
			System.out.println(roomNum + " 호실은 빈방입니다.");
		}
	}

	void view() {
		for (int i = 0; i <= room.length; i++) {
			if (room[i]) {
				System.out.println(i + 1 + " 방은 사용중 입니다.");
			} else {
				System.out.println(i + 1 + " 방은 빈방 입니다.");
			}
		}
	}

	void exit() {
		System.out.println("프로그램을 종료 합니다.");
		// return;
		System.exit(0); // 전체 프로그램을 종료 하는 명령어
	}

}

public class Exam_0507 {
	public static void main(String[] args) throws IOException {
		RoomMg room = new RoomMg();

		while (true) {
			System.out.print("1.입실 2.퇴실 3.보기 4.종료");
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
				System.out.println("잘못 입력하셨습니다.");
			}

		}
	}
}
