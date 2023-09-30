package week_5;

public class Question_4 {

	public static void main(String[] args) {
		int result = 0;		// 결과 변수 초기화
		int num = 100;		// 시작 숫자 = 100
		
		do
		{
			if(num % 2 == 1)	// 홀수인 경우
			{
				result += num;	// 홀수일 경우, +
			}
			num--;				// -하며 다음 숫자로 이동
		} while(num >= 1);		// 숫자가 1 이상일 때까지 반복
		
		System.out.println("1부터 100까지의 합 = " + result);
	}

}
