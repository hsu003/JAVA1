package part01.sec01.exam01;

public class Ex09_07 {

	public static void main(String[] args) {
		String str = "  �ѱ�  ABCD  efgh  ";
		String result = "";
		
		
		for(int i = 0 ; i < str.length() ; i++)
			if(str.charAt(i)!=' ') 
				result+=str.substring(i,i+1);                 //,�� �������� �տ��� ��ŸƮ,n-1 ������ �ȴ�.
			
		
		     
		System.out.println("�� ���ڿ� ==>["+str+"]");
		System.out.println("�������� ==>["+result+"]");
	
		//String.substring(start) ==> ���ڿ� start ��ġ ���� ������ ���ڿ� ����
		//String.substring(start,end) ==> ���ڿ� start ��ġ���� end ������ ���ڿ� ����
	}

}
