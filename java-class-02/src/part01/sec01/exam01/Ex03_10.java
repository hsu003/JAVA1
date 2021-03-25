package part01.sec01.exam01;

public class Ex03_10 {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		double c=200.0;
		double result;
		
		result=a/b;  //(정수/정수)= 결과도 정수
		System.out.printf("%f\n", result);
		
		result=a/c;  //큰타입으로 맞추어 진다.  크기는 실수가 크다
		             // 정수를 내부적인 byte를 만들어서 연산을 한다 ==> 레지스터
		System.out.printf("%1.1f\n",result);
		
		
		

	}

}
