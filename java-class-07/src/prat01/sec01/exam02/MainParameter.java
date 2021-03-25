package prat01.sec01.exam02;

public class MainParameter {
	
	public static void main(String[] args) {
		double sum=0.0;
		
		for(int i = 0 ; i<args.length;i++) 
			sum+=Double.parseDouble(args[i]);   //parseDouble 는 문자 열을 숫자로 바꾸어 준다.(숫자와 연산자 기호만)
			
			   System.out.println("합계 : "+ sum);
			System.out.println("평균 : "+ sum/args.length);
		
	}

}
