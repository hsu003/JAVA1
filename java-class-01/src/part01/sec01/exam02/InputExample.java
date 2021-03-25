package part01.sec01.exam02;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputExample {

	public static void main(String[] args) {
		InputStreamReader rd = new InputStreamReader(System.in);  //입력키를 받아 진실일경우 무한 반복한다.
		try {
			while(true) {
				int a = rd.read();
				if(a == -1)   //== 같다  cyrl-z(-1 값)  
					break;
				System.out.println((char)a);
			}
		}
		catch(IOException e) {
			System.out.println("입력에러 발생!");
		}

	}

}
