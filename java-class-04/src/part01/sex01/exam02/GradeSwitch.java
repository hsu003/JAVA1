package part01.sex01.exam02;

public class GradeSwitch {

	public static void main(String[] args) {
		char grade='G';       //a=s.nextInt   �ϰ��  a�� �� �ٲ۴�.
		
		switch(grade){
		case'A' :     //���������δ� ���������� ó���Ѵ�.
		case'B' :
			System.out.println("�� �� �Ͽ����ϴ�.");
			break;
		case'C' :
		case'D' :
			System.out.println("�� �� ����ϼ���.");
			break;
		case'F' :
			System.out.println("���� �б⿡ �ٽ� ���� �ϼ���.");
			break;
		default :
			System.out.println("�߸��� �����Դϴ�.");
		}

	}

}
