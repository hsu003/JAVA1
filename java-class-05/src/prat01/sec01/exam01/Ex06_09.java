package prat01.sec01.exam01;

public class Ex06_09 {

	public static void main(String[] args) {
		int i;
		int hap=0;
		
		  //for문을 다 처리후 출력      //값을 더하려면 같은 변수가 있어야 한다.
		
		for(i=501;i<=1000;i+=2) {
			hap=hap+i;   //hap+=i;
			
		}
		System.out.printf("500에서 1000까지의 홀수의 합 : %d\n",hap);
	}

}
