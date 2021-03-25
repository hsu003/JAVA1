package day03;

import java.util.*;
@SuppressWarnings({ "serial", "unused" })
class MySubException extends Exception{
	private String message;
	public MySubException(String msg) {
		super(msg);
	}
	public String getMessage() {
		message = super.getMessage() + 
				"������ 0������ 100�� ���̰��� �־�� �մϴ�.";
		return message;
	}
}

public class Exam_06 {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		try {
			System.out.print("���������� �Է� : ");
			int kor = in.nextInt();
			if (kor<0 || kor>100) {
				throw new MySubException("����");
			}
			System.out.println("�Է��� �������� : " + kor);
		}catch(InputMismatchException e) {
			System.err.println("���������� ���ڸ� �Է��ϼ���!!");
		}catch(MySubException e) {
			System.err.println(e.getMessage());
		}finally {
			System.out.println("���������� �Է¹޾� ��½����ִ� ���α׷�");
		}
		
	}
}






