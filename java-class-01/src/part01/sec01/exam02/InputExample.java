package part01.sec01.exam02;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputExample {

	public static void main(String[] args) {
		InputStreamReader rd = new InputStreamReader(System.in);  //�Է�Ű�� �޾� �����ϰ�� ���� �ݺ��Ѵ�.
		try {
			while(true) {
				int a = rd.read();
				if(a == -1)   //== ����  cyrl-z(-1 ��)  
					break;
				System.out.println((char)a);
			}
		}
		catch(IOException e) {
			System.out.println("�Է¿��� �߻�!");
		}

	}

}
