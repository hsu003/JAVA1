package part01.sec01.exam02;

public class TypeConversion {

	public static void main(String[] args) {
		byte b=127;
		int i=100;
		System.out.println(b+i);  //���� + ������ = ����
		System.out.println(10/4);  //���� / ���� = ����
		System.out.println(10.0/4);  //�Ǽ� / ���� = ū���� ���󰣴�
		System.out.println((char)0x12340041);  //0x=16 ����  ���ڷ� �ٲٸ� ���� ���Ѵ�.
		System.out.println((byte)(b+i));
		System.out.println((int)2.9+1.8);
		System.out.println((int)(2.9+1.8));
		System.out.println(((int)2.9)+((int)1.8));
		
		
		//char a ='a';
		

	}

}
