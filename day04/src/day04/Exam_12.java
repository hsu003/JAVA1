package day04;
import java.awt.*;
@SuppressWarnings("unused")
public class Exam_12 {

	public static void main(String[] args) {
		Frame f1 = new Frame("title");
		
		f1.setSize(400,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) screen.getWidth()/2 - f1.getWidth()/2;
		int y = (int) screen.getHeight()/2 - f1.getHeight()/2;
		f1.setLocation(x, y);
		f1.setResizable(false);
		
		f1.setVisible(true);
		
	}

}
