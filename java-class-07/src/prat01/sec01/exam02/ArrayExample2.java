package prat01.sec01.exam02;

public class ArrayExample2 {      //메인 메소드 말고 다른 메소드를 만들수 있다.

	public static void main(String[] args) {    //메인 호출은 jvm이 호출해서 실행 시킨다.
		int[] scores;                           //void : 돌려줄 값이 없다.
		scores =new int[] {83,90,87};
		int i;
		int sum1=0;
				
		
		
		for(i=0;i<3;i++)                                 //개념 잘알아두기
			sum1=sum1+scores[i];
	    
		System.out.println("총합 :"+sum1);
		
		int sum2=add(new int[] {83,90,87});    //호출시 반드시 ()필요하다
		System.out.println("총합 :"+sum2);
		System.out.println();
		

	}
  public static int add(int[] scores) {    //메소드는 호출되야 일을 실행한다.   add는 배열을 받아야지만 일을 실행 시킨다.()==>매개변수
	  int sum=0;
	  int i;
	  
	  
	  for(i = 0; i < 3; i++) {
		  sum=sum+scores[i];
	  }
	  return sum;    //sum값을 돌려준다.    sum값은 add메서드를 호출한 곳으로 돌려준다.
  }
 
  }
	
	

