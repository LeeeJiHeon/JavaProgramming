package Chapter01;

public class Code06 {

	public static void main(String[] args) {
			
			// C������ int grades[5];
			int [] grades;
			grades = new int[5];
			
			grades[0] = 100;
			grades[1] = 76;
			grades[2] = 92;
			grades[3] = 95;
			grades[4] = 14;
			
			for(int i=0; i < 5; i ++) {
				System.out.println("Grade " + i + ": "+ grades[i]);	
			}
	}
}
