package prat01.sec01.exam01;

public class Ex08_06 {

	public static void main(String[] args) {
		int aa[] = {10,20,30,40,50};   //�迭�� �Ѱ� �Ѱ��� ��ҷ� �Ѵ�.
		int count,size;
		
		count = aa.length;      
		size = count*Integer.BYTES;    //integer >>=������ Ŭ����
		
		System.out.printf("�迭 aa[]�� ����� ������ %d �� �Դϴ�.\n",count);
		System.out.printf("�迭�� aa[]�� ����� ��ü ũ��� %d ����Ʈ�Դϴ�.\n",size);

	}

}
