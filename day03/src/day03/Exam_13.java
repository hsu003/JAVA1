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
			//파일이 없으면 파일을 만들고 true를 반환, 있으면 false를 반환
			System.out.println(file.getName()+"파일을 만들었습니다.");
		}else {
			System.out.println(file.getName()+"파일은 이미 존재하는 파일입니다.");
		}
		
		File imsi = File.createTempFile("temp", ".txt", dir);
		imsi.deleteOnExit();
		try {
			Thread.sleep(5000);
		}catch(Exception e) {}
		*/
	}
}
