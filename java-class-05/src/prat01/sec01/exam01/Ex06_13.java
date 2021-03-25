package prat01.sec01.exam01;     //중첩 for
                                 //for안에 for 들어가있을 경우    경우의 수를 만든다는거.
public class Ex06_13 {            //행과 열을 처리할 경우 중첩for문이면 가능하다.

	public static void main(String[] args) {
		int i,k;
		
		for(i = 0 ; i < 3 ; i++) {      //0,1,2  
			for(k = 0 ;k < 2 ; k++) {   //0,1
				System.out.printf("중첩 for문 입니다.(i값 : %d, k값 : %d\n",i,k);
			}
			
		}
   
	}

}
