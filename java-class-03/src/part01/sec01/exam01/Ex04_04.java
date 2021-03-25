package part01.sec01.exam01;

public class Ex04_04 {

	public static void main(String[] args) {
		int a=10, b;
		
		b=a++;   //  10
		System.out.printf("%d\n",b);
		
		b=++a;   //대입이 되는 전위 연산자는 a의 값을 먼처 증가 시킨다  12
		System.out.printf("%d\n",b);
		
		b=a++ +3;
	    System.out.printf("%d\n",b);
		
		b=++a +3;
		System.out.printf("%d\n",b);
		
		
		  //a++; //a=a+1; System.out.printf("%d\n",a); ++a; //a=a+1;
		  //System.out.printf("%d\n",a); 
		  //b=++a; //전위 연산자는 증가시키고 변수로 넘어가고 //후위 연산자는 변수로 넘어가서 증가된다. 
		  //System.out.printf("a=%d b=%d\n",a,b);
		 

	}

}
