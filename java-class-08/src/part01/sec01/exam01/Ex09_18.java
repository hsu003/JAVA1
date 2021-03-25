package part01.sec01.exam01;
                                                          //클래스는 내가 만든 설계도 이다.
class MyInt{                                              //메인이 들어 있는 클래스를 제외한 public 붙으면 안된다.
	     int a;   //클래스 에서 만든 변수는 field 변수라 한다.         //클래스 만들때 메인 스타트는 한개만 있으면 된다.
}

public class Ex09_18 {
	
	public static void func1(MyInt m) {
		m.a=m.a+1;
		
				
		System.out.printf("전달 받은 a==> %d\n",m.a);
		
		
	}

	public static void main(String[] args) {
		//int a;       //local 변수
		MyInt m = new MyInt();    //객제 생성(실제 존재 하는 대상이 된다.),사용할 준비
		m.a=10;                  //점.(dot)은 어디에 접근 할수 있는 접근연산자
		
		
		func1(m);
		System.out.printf("func1() 실행 후의 a==> %d \n",m.a);

	}

}
