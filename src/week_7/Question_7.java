package week_7;

/* 다음과 같은 2차원 배열에서 같은 숫자가 몇 번 나오는지를 출력하는 프로그램을 작성하시오. 
   단, 숫자는 한 번만 출력되어야 한다. */

public class Question_7 {

	public static void main(String[] args) {
		int[][] arr = {
                {7, 9, 4, 7, 2},
                {3, 4, 6, 7, 2},
                {3, 2, 6, 9, 8},
        };
		
		// 숫자의 개수 저장할 배열
		 int[] count = new int[10];

        // for문 돌면서 숫자의 개수를 계산
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                count[arr[i][j]]++;
            }
        }

        // 결과 출력
        for (int i = 0; i < count.length; i++) 
        {
            if (count[i] > 0) {
                System.out.println(i + "의 개수 : " + count[i]);
            }
        }
	}

}