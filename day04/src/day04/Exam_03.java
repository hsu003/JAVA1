package day04;
import java.io.*;



@SuppressWarnings("serial")
class A03 implements Serializable{
	int a;
	int b;
	transient int c;
	
	public A03() {
		a=100;
		b=200;
		c=300;
	}
	
	public void disp() {
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		System.out.println("c = "+ c);
	}
}

public class Exam_03 {

	public static void main(String[] args) throws IOException {
		File dir = new File("D:\\java-emp-class-0406\\java-web\\day04");
		File file = new File(dir, "ccc.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		A03 ap = new A03();
		oos.writeObject(ap);
		oos.close();
	}

}
