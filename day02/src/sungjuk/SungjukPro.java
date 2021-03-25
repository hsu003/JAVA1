package sungjuk;

import java.util.*;
import java.io.*;

public class SungjukPro implements SungPro {
	List<Student> list;
	Scanner in;
	File file;

	public SungjukPro() {
		list = new ArrayList<>();
		in = new Scanner(System.in);
		File dir = new File("D:\\java-emp-class-0406\\java-web\\day04");
		File file = new File(dir, "bbb.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
		}
	}

	@Override
	public void insert() {
		System.out.print("이름을 입력 : ");
		String name = in.next();
		System.out.print("국어점수를 입력 : ");
		int kor = in.nextInt();
		System.out.print("영어점수를 입력 : ");
		int eng = in.nextInt();
		Student insert = new Student(name, kor, eng);
		list.add(insert);
	}

	@Override
	public void delete() {
		System.out.print("삭제할 학생의 이름 : ");
		String name = in.next();
		for (Student delete : list) {
			if (delete.getName().equals(name)) {
				list.remove(delete);
				return;
			}
		}
		System.out.println(name + "은 저희 학생이 아닙니다.");

	}

	@Override
	public void edit() {
		System.out.print("수정할 학생의 이름 : ");
		String name = in.next();
		for (Student edit : list) {
			if (edit.getName().equals(name)) {
				System.out.println(name + "학생의 현재 국어점수는 " + edit.getKor() + "점 입니다.");
				System.out.print("수정할 국어점수는 : ");
				edit.setKor(in.nextInt());
				System.out.println(name + "학생의 현재 영어점수는 " + edit.getEng() + "점 입니다.");
				System.out.print("수정할 영어점수는 : ");
				edit.setEng(in.nextInt());
				System.out.println(name + "학생의 국어, 영어점수를 수정하였습니다.");
				return;
			}
		}
		System.out.println(name + "은 저희 학생이 아닙니다.");

	}

	protected void rank() {
		Student[] rank = new Student[list.size()];
		list.toArray(rank);
		for (int i = 0; i < rank.length; ++i) {
			rank[i].clearRank();
			for (int j = 0; j < rank.length; ++j) {
				if (rank[i].getTot() < rank[j].getTot()) {
					rank[i].plusRank();
				}
			}
		}
		/*
		 * for(Student rank1 : list) { rank1.clearRank(); for(Student rank2 : list) { if
		 * (rank1.getTot() < rank2.getTot()) { rank1.plusRank(); } } }
		 */
	}

	@Override
	public void view() {
		rank();
		for (Student view : list) {
			view.disp();
		}
	}

	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);

	}

	@Override
	public void save() {
	try {
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos= new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(list);
		oos.close();
		
	}catch (IOException e) {
		
	}
	}
		
		/*try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw, 1024);
			PrintWriter pw = new PrintWriter(bw);
			for (Student save : list) {
				pw.print(save.getName() + "@");
				pw.print(save.getKor() + "@");
				pw.print(save.getEng() + "@");
				pw.flush();
			}
			pw.close();
		} catch (IOException e) {
		}
	}

	
	 * try { FileWriter fw = new FileWriter(file); BufferedWriter bw = new
	 * BufferedWriter(fw, 1024); PrintWriter pw = new PrintWriter(bw);
	 * 
	 * for(Student save : list) { pw.print(save.getName()); pw.print(save.getKor());
	 * pw.print(save.getEng()); pw.flush(); } pw.close(); }catch(IOException e) {} }
	 */
	@SuppressWarnings({ "resource", "unchecked", "rawtypes" })
	@Override
	public void load() throws EOFException {
		list.clear();//
		try {
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			list = (List)ois.readObject();
		
		/*try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String str = br.readLine();
				if(str == null) 
					break;
					Scanner scan = new Scanner(str).useDelimiter("\\s*@\\s*");
					String name= scan.next();
					int kor = scan.nextInt();
					int eng = scan.nextInt();
					Student load = new Student(name,kor,eng);
					list.add(load);
					
			}
			*/
		}catch(IOException | ClassNotFoundException e) {}
	}
}
/*
 * try{ FileReader fr = new FileReader(file); BufferedReader br = new
 * BufferedReader(fr); while(true) { String name = br.readLine(); int kor =
 * br.read(); int eng = br.read(); Student load = new Student(name, kor, eng);
 * list.add(load); } }catch(EOFException e) {//파일이 끝났는데도 계속해서 데이터를 읽을때
 * System.out.println("파일 로드 끝!!"); }catch(IOException e) {
 * System.err.println(e.getMessage()); } }
 * */

 
