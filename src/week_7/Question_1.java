package week_7;

/*  다음과 같은 배열을 프로그램 실행 시 생성하고 가장 큰 값과 가장 작은 값을 구하여 출력하는 프로그램을 작성하시오.
[ 배열 : 234 89 678 55 785 66 ] */

public class Question_1 {

	public static void main(String[] args) {
		int [] arr = {234, 89, 678, 55, 785, 66};
		
		// arr[0]을 최대, 최소값으로 초기화
		int max = arr[0];
		int min = arr[0];
		
		// 반복문
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max)	// 반복문을 돌며 현재값이 최대값보다 크면 저장
			{
				max = arr[i];
			}
			if(arr[i] < min)	// 반복문을 돌며 현재값이 최소값보다 작으면 저장
			{
				min = arr[i];
			}
		}
		
		System.out.println("가장 큰 값 : " +  max);
		System.out.println("가장 작은 값 : " +  min);
		
	}

}
