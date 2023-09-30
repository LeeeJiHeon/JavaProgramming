package week_5;

public class Question_1 {

	public static void main(String[] args) {
		int result = 0;					// 결과 변수 초기화
		
		for(int i =1; i <= 100; i++)	// i를 1부터 100까지 1씩 증가시키며 반복 
		{
			if(i % 4 == 0)				// 4의 배수인지 확인
			{
				result += i;			// 4의 배수일 경우 +
			}
		}
		
		System.out.print(result);		// 결과 출력
	}

}