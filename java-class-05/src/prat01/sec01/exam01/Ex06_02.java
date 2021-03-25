package prat01.sec01.exam01;

public class Ex06_02 {

	public static void main(String[] args) {
		int i;
		
		for(i=0 ; i<=5 ; ++i) {       //0으로 시작을 한다.   //i<5 몇번을 반복 할껏 이냐.  //++i이나 i++  단독으로 있을경우 같은값을 보낸다
			System.out.println("안녕하세요? 빙글빙글 for문을 공부 중 입니다.");
			System.out.println("java 나도 할 수 있다");
		}    //for 에서 {} 범위를 지정해주는 역할을 한다.
            System.out.println("for문의 밖입니다." + i);    //ln은 연결시킬려면 +가 필요하다
	}

}
