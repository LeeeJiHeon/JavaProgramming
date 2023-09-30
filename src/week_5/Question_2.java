package week_5;

public class Question_2 {

	public static void main(String[] args) {
		
		System.out.println("** 2단 **");
		
		// 반복문
		for(int i = 1; i <= 7; i += 2) // i를 1부터 2씩 증가시키며, 7까지 반복 
		{
			System.out.println("2 * " + i + " = " + 2*i); 
		}
		  
		System.out.println("2 * 8 = 16"); // 반복문 탈출 후, 2*8은 직접 출력
	 }

}