package week_7;

/* 1번 문제의 배열을 이용하여 각 열(세로줄)의 합을 출력하는 프로그램을 작성하시오. */
public class Question_6 {

	public static void main(String[] args) {
		int[][] arr = {
	            {28, 33, 36, 7},
	            {56, 66, 44, 20},
	            {88, 7, 21, 44},
	            {33, 2, 643, 4}
		};
		
		// 각 열의 합을 저장할 배열
		int[] sum = new int [arr[0].length];
		
		// for문을 돌며 각 열의 합 계산
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				sum[j] += arr[i][j];
			}
		}
		
		// 각 열의 합 출력
		for(int i = 0; i < sum.length; i++)
		{
			System.out.println((i + 1) + "열의 합계 : " + sum[i]);
		}
	}

}