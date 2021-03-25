package part01.sec01.exam02;

public class CircleArea {

	public static void main(String[] args) {
		final double PI = 3.14;  //원주율을 상수로 선언
		double radius = 10;     //원의 반지름
		double circleArea = 0; //원의 면적
		
		circleArea = radius*radius*PI;   //원의 면적 계산
		
		//원의 면적을화면에 출력한다
		//        1
		//        2
		
		System.out.print("원의 면적 = ");
		System.out.printf("%5.1f", circleArea); //%나올려는 숫자 및 점 포함 뒤에는 소수점 자리
		System.out.printf("원의 면적==>%f\n",circleArea);
		

	}

}
