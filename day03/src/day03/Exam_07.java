package day03;

@SuppressWarnings("serial")
class MyException extends Exception{
	private String message;
	public MyException(String msg) {
		super(msg);
	}
	public String getMessage() {
		message = super.getMessage() + " : 내가 만든 예외 클래스!!";
		return message;
	}
}
public class Exam_07 {
	public static void main(String[] args) {
		try {
			throw new MyException("예외코드");
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
