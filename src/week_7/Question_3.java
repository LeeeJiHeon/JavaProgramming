package week_7;

/* 다음과 같은 10개의 숫자 배열을 생성하고 배열의 각 데이터가 한 칸씩 왼쪽으로 이동하여 다시 저장되도록 하는 프로그램을 작성하시오. 
   단, 초기 배열의 가장 왼쪽 데이터는 가장 오른쪽으로 이동한다. 초기 배열 값과 이동 후 배열 값을 출력하시오.
   [ 배열 : 33 2 189 72 7 91 5 14 17 9 ] */
public class Question_3 {

	public static void main(String[] args) {
		int [] arr = {33, 2, 189, 72, 7, 91, 5, 14, 17, 9};
		int temp = arr[0];	// 첫 번째 배열 요소를 임시 변수에 저장
		
		// 초기 배열 값 출력
		System.out.print("초기 배열 값 : ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		// 배열을 왼쪽으로 한 칸씩 이동
		for(int i = 1; i < arr.length; i++)
		{
			arr[i-1] = arr[i];
		}
		
		// temp 값을 배열의 마지막 요소로 설정
		arr[arr.length - 1] = temp;
		
		// 이동 후 배열 값 출력
		System.out.print("\n이동 후 배열 값 : ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}