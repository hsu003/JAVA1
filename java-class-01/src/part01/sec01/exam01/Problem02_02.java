package part01.sec01.exam01;

import java.util.Scanner;

public class Problem02_02 {

	public static void main(String[] args) {
		int a, b, c;
		int result;

		Scanner s = new Scanner(System.in);
		System.out.println("Ã¹¹øÂ° °è»êÇÒ °ªÀ» ÀÔ·ÂÇÏ¼¼¿ä==>");
		a = s.nextInt();
		System.out.println("<1>µ¡¼À<2>»¬¼À<3>°ö¼À<4>³ª´°¼À==>");
		b = s.nextInt();
		System.out.println("µÎ¹øÂ° °è»êÇÒ °ªÀ» ÀÔ·ÂÇÏ¼¼¿ä==>");
		c = s.nextInt();

		if (b == 1) {
			result = a + c;
			System.out.println(a + "+" + c + "=" + result);

		}
		if (b == 2) {
			result = a - c;
			System.out.println(a + "-" + c + "=" + result);

		}
		if (b == 3) {
			result = a * c;
			System.out.println(a + "*" + c + "=" + result);
		}
		if (b == 4) {
			result = a / c;
			System.out.println(a + "/" + c + "=" + result);
		}

		s.close();

	}

}
