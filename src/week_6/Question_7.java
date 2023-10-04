package week_6;

public class Question_7 {

	public static void main(String[] args) {
		int number = 1;		// 시작값 초기화
		
		System.out.print("[");
		
		for(int i = 1; i <= 15; i++)
		{
			System.out.print(number + ", ");	// 현재 숫자 출력
			number += i;						// 다음 숫자 계산
		}
		
		System.out.print("]");

	}

}
