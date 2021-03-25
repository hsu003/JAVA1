package part01.sex01.exam02;

import java.util.Scanner;

public class Problem05_03 {

	
	public static void main(String[] args) {
		int user,com;
		
		System.out.printf("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.\n");
		
		Scanner s= new Scanner(System.in);
		String tmp = s.nextLine();       //화면을 통해 입력받은 내용을 tmp에 저장
	    user = Integer.parseInt(tmp);
	                                     //입력받은 문자열(tmp)를 숫자로 변환
		com = (int) ((Math.random()*3)+1);
		
		System.out.printf("당신은 "+ user +" 입니다.\n");
		System.out.printf("컴퓨터은 "+ com + " 입니다.\n");
			
		
		switch (user - com) {
		case 2:
		case -1:
		System.out.printf("당신이 졌습니다. \n");
		break;
		case 1:
		case -2:
		System.out.printf("당신이 이겼습니다. \n");
		break;
		case 0:
		System.out.printf("비겼습니다.\n");
	    break;
		}
		

		s.close();
	}

}
