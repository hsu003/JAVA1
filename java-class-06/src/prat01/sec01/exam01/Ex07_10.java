package prat01.sec01.exam01;

public class Ex07_10 {

	public static void main(String[] args) {
		int hap=0;
		int i;
		for(i = 1 ; i<100 ; i++) {
			
			if(i % 3 == 0) 
				continue;   //3의 배수면 제외 하면 안될때 쓰는 명령어      
				hap=hap+i;      //return   메인을 종류 시키는 명령어
			
			
		}
		System.out.printf("1~100까지의 합(3의 배수 제외) : %d\n",hap);

	}

}
