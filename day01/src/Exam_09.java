import java.util.Scanner;

abstract class Protoss {
		//�߻�Ŭ����
		//1. �߻�޼ҵ尡 �Ѱ� �̻� �ִ� Ŭ����
		//2. �����ڰ� ����.
		//3. ��ü�� �����ϰ��� �ϸ�, �ڽ��� Ŭ������ �̿��Ͽ� ����ų�(��ĳ����),
		//	 �͸���øŬ������ �̿��Ͽ� ����� �ش�.
	public abstract  void attack();// {
		//System.out.println("����!!");
	//}

	public abstract void move();//{
		//System.out.println("�̵�!!");
	//}
	public void disp() {
		
	}
}

class Zealet extends Protoss {
	public void attack() {
		System.out.println("������ ����!!");
	}

	public void move() {
		System.out.println("���� �̵�!!");
	}
}

class Dragon extends Protoss {
	public void attack() {
		System.out.println("��� ����");
	}

	public void move() {
		System.out.println("��� �̵�!!");
	}
}

public class Exam_09 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Protoss pro = null;
		System.out.print("1.���� 2.��� : ");
		int select1 = in.nextInt();
		System.out.print("1.���� 2.�̵� : ");
		int select2 = in.nextInt();

		if (select1 == 1) {
			pro = new Zealet();
		} else {
			pro = new Dragon();
		}
		if (select2 == 1) {
			pro.attack();
		} else {
			pro.move();
		}
	}
}
