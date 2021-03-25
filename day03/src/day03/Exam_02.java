package day03;
import java.util.*;
import java.awt.*;

@SuppressWarnings("unused")
public class Exam_02 {
	public static void main(String[] args) {
		String data = "홍길동/100/50";
		//StringTokenizer는 사용하지 않는다.
		//유산클래스 : 예전에는 사용을 많이 했지만, 지금은 다른 방식으로 대처해서
		//사용이 되는 클래스
		//예전 코드와 호환성을 위해서 유지되는 클래스
		StringTokenizer st = new StringTokenizer(data, "/");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		//Scanner sc = new Scanner(data).useDelimiter("\\s*/\\s*");
		//System.out.println(sc.next());
		//System.out.println(sc.nextInt());
		//System.out.println(sc.nextInt());
		
		//System.out.println(sc.next());
		//System.out.println(sc.next());
		/*
		String[] a = data.split("/");
		for(int i=0; i<a.length; ++i) {
			System.out.println(a[i]);
		}
		*/
		//int a = 10000;
		//String s = String.valueOf(a);
		
		/*String str = "               Hello, Java!!            ";
		System.out.println(str);
		System.out.println(str.trim());
		/*
		/*
		for(int i=0; i<str.length(); ++i) {
			char ch = str.charAt(i);
			System.out.println(ch);
		}		
		*/
		
		//String a = "100";
		//int kor = Integer.parseInt(a);
		//double kor2 = Double.parseDouble(a);
		/*String a = "aaa";
		String b = "aaa";
		String c = new String("aaa");
		String d = new String("aaa");
		a = "bbb";
		
		System.out.println(a.equals(b));
		System.out.println(a==c);
		System.out.println(a==d);
		System.out.println(c==d);
		System.out.println(b==c);
		System.out.println(b==d);*/
	}
}
