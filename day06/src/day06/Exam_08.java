package day06;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
class Exam_08 extends JFrame implements MouseListener{
	JPopupMenu pop = new JPopupMenu();
	JMenuItem add = new JMenuItem("�߰�");
	JMenuItem edit = new JMenuItem("����");
	JMenuItem del = new JMenuItem("����");
	
	public Exam_08(){
		this.setVisible(true);
		this.setSize(500,300);
		//�˾�����
		pop.add(add);
		pop.add(edit);
		pop.add(del);

		this.addMouseListener(this);
   } 

   public void mouseClicked(MouseEvent e){}
   public void mouseEntered(MouseEvent e){} 
   public void mouseExited(MouseEvent e) {} 

   public void mousePressed(MouseEvent e){}
   public void mouseReleased(MouseEvent e){
       pop.show(this, e.getX(), e.getY());
   }
   public static void main(String[] args){
       new Exam_08();
   }
}

