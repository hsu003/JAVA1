import java.util.Scanner;

abstract class Protoss {
		//추상클래스
		//1. 추상메소드가 한개 이상 있는 클래스
		//2. 생성자가 없다.
		//3. 객체를 생성하고자 하면, 자식의 클래스를 이용하여 만들거나(업캐스팅),
		//	 익명중첩클래스를 이용하여 만들어 준다.
	public abstract  void attack();// {
		//System.out.println("공격!!");
	//}

	public abstract void move();//{
		//System.out.println("이동!!");
	//}
	public void disp() {
		
	}
}

class Zealet extends Protoss {
	public void attack() {
		System.out.println("질럿이 공격!!");
	}

	public void move() {
		System.out.println("질럿 이동!!");
	}
}

class Dragon extends Protoss {
	public void attack() {
		System.out.println("드라군 공격");
	}

	public void move() {
		System.out.println("드라군 이동!!");
	}
}

public class Exam_09 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Protoss pro = null;
		System.out.print("1.질럿 2.드라군 : ");
		int select1 = in.nextInt();
		System.out.print("1.공격 2.이동 : ");
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
