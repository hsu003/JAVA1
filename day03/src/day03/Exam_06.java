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
				"점수는 0점에서 100점 사이값만 넣어야 합니다.";
		return message;
	}
}

public class Exam_06 {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		try {
			System.out.print("국어점수를 입력 : ");
			int kor = in.nextInt();
			if (kor<0 || kor>100) {
				throw new MySubException("국어");
			}
			System.out.println("입력한 국어점수 : " + kor);
		}catch(InputMismatchException e) {
			System.err.println("국어점수는 숫자만 입력하세요!!");
		}catch(MySubException e) {
			System.err.println(e.getMessage());
		}finally {
			System.out.println("국어점수를 입력받아 출력시켜주는 프로그램");
		}
		
	}
}






