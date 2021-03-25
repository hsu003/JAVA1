package part01.sec01.exam01;

public class Ex09_09 {

	public static void main(String[] args) {
		String str1="Java Programming";
		String str2="Java Programming";   //같은 문자열은 새로 생성되지 않고 기존에 있는 값을 쓴다
		String str3= new String("Java Programming");
		
		System.out.println("원 문자열1==>["+str1+"]");
		System.out.println("원 문자열2==>["+str2+"]");
		System.out.println("원 문자열3==>["+str3+"]\n");
		
		System.out.println("문자열1==문자열2 결과 : \t"+(str1==str2));
		System.out.println("문자열1.equals(문자열2) 결과:"+str1.equals(str2));     //equals 문자열이 가지고 있는 실제 값을 게산한다.
		System.out.println("문자열1==문자열2결과 :       " + (str1==str3));
		System.out.println("문자열1.equals(문자열3) 결과 :"+str1.equals(str3));
	}

}
