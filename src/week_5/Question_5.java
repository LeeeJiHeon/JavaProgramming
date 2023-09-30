package week_5;

public class Question_5 {

	public static void main(String[] args) {
		int result = 0;		// 결과 변수 초기화
		int num = 1;		// 시작 숫자 = 1
		
		do
		{
			result = result + num;	
			if (num % 10 == 0)		// 숫자가 10의 배수일 경우 출력
			{
				System.out.println("1 - " + num + " : " + result);
			}
			num += 1;				// +하여 다음 숫자로 이동
		} while(num <= 100);
				
	}

}