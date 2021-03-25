package prat01.sec01.exam02;

public class ArrayExample1 {

	public static void main(String[] args) {
		int[] scores = {83,90,87};
		int i;
		int sum=0;
		double avg;
		
		
		System.out.println("score[0] : "+scores[0]);
		System.out.println("score[0] : "+scores[1]);
		System.out.println("score[0] : "+scores[2]);
		
		
		for(i=0;i<3;i++)
			sum=sum+scores[i];
	    
		System.out.println("ÃÑÇÕ :"+sum);
		avg=(double)sum/3;
		System.out.println("Æò±Õ :"+avg);
		System.out.printf("Æò±Õ : %2.2f", avg);
		
		
		
		
		

	}

}
