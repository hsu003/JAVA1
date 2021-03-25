package part01.sec01.exam03;

public class Computer {
	
	int sum1(int[] values) {   //매개변수의 갯수를 알수 없을 경우 배열로만들어서 처리한다.
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {   //넘겨준 값의 수에 따라 자동으로 배열 생성
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}

}
