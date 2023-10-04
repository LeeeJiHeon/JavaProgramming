package week_6;

public class Question_6 {

	public static void main(String[] args) {
		int line = 1;
		
		for(int i = 0; i < 5; i++)
		{
			int j = line;			// 각 줄의 시작 값 설정
			
			while (j < line + 5)	// 5개 출력하면 while문 탈출
			{
				System.out.print(j + " ");
				j++;
			}
			System.out.println();
			line += 5;				// 다음 줄에 5를 더하여 설정
		}
		
	}

}
