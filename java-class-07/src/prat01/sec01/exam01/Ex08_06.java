package prat01.sec01.exam01;

public class Ex08_06 {

	public static void main(String[] args) {
		int aa[] = {10,20,30,40,50};   //배열의 한개 한개를 요소로 한다.
		int count,size;
		
		count = aa.length;      
		size = count*Integer.BYTES;    //integer >>=정수형 클래스
		
		System.out.printf("배열 aa[]의 요소의 개수는 %d 개 입니다.\n",count);
		System.out.printf("배열의 aa[]의 요소의 전체 크기는 %d 바이트입니다.\n",size);

	}

}
