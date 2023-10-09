package week_7;

/* 다음과 같은 2차원 배열을 생성하고, 배열의 값 중에서 3의 배수에 해당하는 값이 몇 개인지를 출력하는 프로그램을 작성하시오. */
public class Question_5 {

	public static void main(String[] args) {
		int[][] arr = {
	            {28, 33, 36, 7},
	            {56, 66, 44, 20},
	            {88, 7, 21, 44},
	            {33, 2, 643, 4}
		};

	        int count = 0; // 3의 배수의 개수를 저장할 변수 초기화

	        for (int i = 0; i < arr.length; i++) 
	        {
	            for (int j = 0; j < arr[i].length; j++)
	            {
	                if (arr[i][j] % 3 == 0)
	                {
	                    count++; // 3의 배수인 경우 count 증가
	                }
	            }
	        }
	        
	        System.out.println("{ 3의 배수는 " + count + "개입니다. }");
	}

}
