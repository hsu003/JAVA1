package part01.sec01.exam01;

public class Ex09_07 {

	public static void main(String[] args) {
		String str = "  한글  ABCD  efgh  ";
		String result = "";
		
		
		for(int i = 0 ; i < str.length() ; i++)
			if(str.charAt(i)!=' ') 
				result+=str.substring(i,i+1);                 //,를 기준으로 앞에는 스타트,n-1 이형성 된다.
			
		
		     
		System.out.println("원 문자열 ==>["+str+"]");
		System.out.println("공백제거 ==>["+result+"]");
	
		//String.substring(start) ==> 문자열 start 위치 부터 끝까지 문자열 리턴
		//String.substring(start,end) ==> 문자열 start 위치부터 end 전까지 문자열 리턴
	}

}
