package day03;

import java.util.*;

class UpDownGame extends Thread {
	private int comsu;
	private int time;
	private boolean isGame;

	public UpDownGame() {
		time = 0;
		isGame = true;
	}

	public void gameStart() {
		comsu = (int) (Math.random() * 100) + 1;
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("���� �Է�");
			int su = s.nextInt();
			if (su == comsu) 
				break;
			else if (su > comsu) 
				System.out.println("down");
			else 
			System.out.println("up");
			
		}
		isGame = false;
		System.out.println(time + " �ʸ��� ���߼̽��ϴ�.");
		s.close();
	}


	public void run() {
		while (isGame) {
			time++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Exam_10 {

	public static void main(String[] args) {
		UpDownGame game = new UpDownGame();
		
		game.start();
		game.gameStart();

	}

}
