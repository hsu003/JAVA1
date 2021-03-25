package part01.sec01.exam01;

public class Ex09_08 {

	public static void main(String[] args) {
		String str1="Java Programming";
		String str2="Java IT Language";
		
		System.out.println("원 문자열1==>["+str1+"]");
		System.out.println("원 문자열2==>["+str2+"]");
		
		System.out.println(str1.compareTo(str2));      //같은 문자열 나열중 다른 문자가 나타나면 그문자를 뺀다. 단 아스키코드값에 의거해서
		System.out.println(str1.contains("Java"));

	}

}
