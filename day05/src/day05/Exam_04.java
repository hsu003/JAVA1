package day05;
import java.awt.*;
import java.util.*;
import java.awt.event.*; 

class Food{
	private String name;
	private int price;
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}

@SuppressWarnings("serial")
class MyButton04 extends Button{
	private Image img;
	public MyButton04(Image img) {
		this.img = img;
	}
	public void paint(Graphics g) {
		g.drawImage(img, 5, 5, this.getWidth()-10, this.getHeight()-10, this);
	}
}

@SuppressWarnings("serial")
class MyFrame04 extends Frame implements ActionListener{
	private String[] name = new String[] {"짜  장  면","짬       뽕","순  대  국","뼈해장국","소불고기",
			"제육볶음","소갈비찜","카레가스","청  국  장"};
	private int price[] = new int[] {5000, 6000, 7000, 8000, 8000, 8000, 10000, 7000, 7000};
	private String str = "주 문 내 역\n----------";
	
	private MyButton04 bt[] = new MyButton04[9]; 
	private Food[] food = new Food[9];
	
	private TextArea ta = new TextArea(str);
	
	private Panel center_p = new Panel();
	private Panel east_p = new Panel();	
	
	private ArrayList<Food> list = new ArrayList<>();
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center", center_p);
		east_p.setPreferredSize(new Dimension(150,300));
		this.add("East", east_p);
		east_p.setLayout(new BorderLayout());
		east_p.add("Center", ta);
		center_p.setLayout(new GridLayout(3,3));
		for(int i=0; i<bt.length; ++i) {
			Image img = Toolkit.getDefaultToolkit().getImage("src/images/food"+(i+1)+".png");
			bt[i] = new MyButton04(img);
			food[i] = new Food(name[i], price[i]);
			center_p.add(bt[i]);
		}
	}
	public void start() {
		for(int i=0; i<bt.length; ++i) {
			bt[i].addActionListener(this);
		}
	}
	public MyFrame04(String title) {
		super(title);
		
		this.init();
		this.start();
		
		this.setSize(500, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<bt.length; ++i) {
			if (e.getSource()==bt[i]) {
				list.add(food[i]);
				int res = 0;
				ta.setText(str+"\n");
				for(Food f : list) {
					ta.append(f.getName() + "\t" + f.getPrice()+"\n");
					res += f.getPrice();
				}
				ta.append("--------\n");
				ta.append("합계 : " + res +"원");
			}
		}
		
	}
}
public class Exam_04 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MyFrame04 frame = new MyFrame04("frame예제");
	}
}
