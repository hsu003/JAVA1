package prat01.sec01.exam01;

public class Ex08_05 {

	public static void main(String[] args) {//100개의 배열 aa를 0, 2, 4, 8, …(2의 배수)로 초기화한 다음, 배열 bb에 역순으로 넣기
		int[] aa = new int[100];
		int[] bb = new int[200];
		int i;  //제이변수 
		
		for(i = 0; i < 100; i++) {
			aa[i]=i*2;				
		}
		
		for(i = 0; i< 100;i++) {
			bb[i]= aa[99-i];
		}
		System.out.printf("bb[0]는 %d, bb[99]는 %d 입력됨 \n",bb[0],bb[99]);
		

	}

}
