package part01.sec01.exam01;

public class Ex04_06 {

	public static void main(String[] args) {
		int a=99;
		
		System.out.printf("AND 연산:%s\n",(a>=100)&&(a<=200));  //AND는 하나가 false면 나머지가 true여도 false가 된다
		System.out.printf("OR 연산:%s\n",(a>=100)||(a<=200));  //OR는 하나가 false면 나머기사 true여도 true가 된다.
		System.out.printf("NOT 연산:%s\n",!(a==100));
	}

}
