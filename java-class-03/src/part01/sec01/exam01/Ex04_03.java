package part01.sec01.exam01;

public class Ex04_03 {

	public static void main(String[] args) {
		int a =10;
		
		a++;  //a=a+1;  ==11
		System.out.printf("a++==>%d\n",a);
		
		a--;  //a=a-1; (������ ���� ���ڸ� ���� ����)  ==10
		System.out.printf("a--==>%d\n",a);
		
		a+=5;  //a=a+5;  ==15
		System.out.printf("a+=5==>%d\n", a);
		
		a-=5;  //a=a-5;  ==10
		System.out.printf("a-=5==>%d\n",a);
		
		a*=5;  //a=a*5;  ==50
		System.out.printf("a*=5==>%d\n", a);
		
		a/=5;  //a=a/5;  ==10
		System.out.printf("a/=5==>%d\n",a);
		
		a%=5;  //a=a%5;  ==0
		System.out.printf("a%%=5==>%d\n",a);

	}

}
