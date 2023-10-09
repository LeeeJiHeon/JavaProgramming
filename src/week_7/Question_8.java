package week_7;

/* 다음과 같은 두 개의 2차원 배열의 각 요소를 합하여 total 배열에 저장하고 내용을 출력하는 프로그램을 작성하시오  */

public class Question_8 {

	public static void main(String[] args) {
		int[][] a = {
                {7, 9, 4, 7, 2},
                {3, 4, 6, 7, 2},
        };
		
		int[][] b = {
                {3, 1, 4, 8, 0},
                {3, 5, 6, 9, 1},
        };
		
		// total 배열 
		int [][] total = new int[a.length][a[0].length];
		
		// for문 돌면서 각 요소 덧셈
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				total[i][j] = a[i][j] + b[i][j];
			}
		}
		
		// total 배열 출력
		for(int i = 0; i < total.length; i++)
		{
			for(int j = 0; j < total[i].length; j++)
			{
				System.out.print(total[i][j] + " ");	
			}
			System.out.println();
		}
	}

}
