package part01.sex01.exam02;

public class GradeSwitch {

	public static void main(String[] args) {
		char grade='G';       //a=s.nextInt   일경우  a로 다 바꾼다.
		
		switch(grade){
		case'A' :     //내부적으로는 정수값으로 처리한다.
		case'B' :
			System.out.println("참 잘 하였습니다.");
			break;
		case'C' :
		case'D' :
			System.out.println("좀 더 노력하세요.");
			break;
		case'F' :
			System.out.println("다음 학기에 다시 수강 하세요.");
			break;
		default :
			System.out.println("잘못된 학점입니다.");
		}

	}

}
