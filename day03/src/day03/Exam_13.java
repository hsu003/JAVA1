package day03;
import java.io.*;


public class Exam_13 {
	public static void main(String[] args) throws IOException {
		File dir = new File("d:"+File.separator+"java-emp-class-0406"
				+File.separator+"java-web"+File.separator+"day03");
		File file = new File(dir, "aaa.txt");
		
		System.out.println(file.getName());
		System.out.println(file.getParent());
		
		/*
		System.out.println(file.isFile());
		System.out.println(dir.isDirectory());
		
		String[] dirs = dir.list();
		for(int i=0; i<dirs.length; ++i) {
			System.out.println(dirs[i]);
		}
		*/
		
		/*file.delete();
		if (file.createNewFile()) {
			//������ ������ ������ ����� true�� ��ȯ, ������ false�� ��ȯ
			System.out.println(file.getName()+"������ ��������ϴ�.");
		}else {
			System.out.println(file.getName()+"������ �̹� �����ϴ� �����Դϴ�.");
		}
		
		File imsi = File.createTempFile("temp", ".txt", dir);
		imsi.deleteOnExit();
		try {
			Thread.sleep(5000);
		}catch(Exception e) {}
		*/
	}
}
