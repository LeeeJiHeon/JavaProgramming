package week_5;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("숫자 2개 입력 : ");
			
			int num1 = sc.nextInt();	// 첫 번쨰 숫자 입력
			int num2 = sc.nextInt();	// 두 번째 숫자 입력
			int result = 0;				// 결과 변수 초기화
			
			if(num1 > num2)				// num1이 num2보다 클 경우 숫자 교환
			{
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			
			for(int i = num1 + 1; i < num2; i++)	// 두 숫자 사이 홀수 값 더하기
			{
				if(i % 2 == 1)
				{
					result += i;
				}
			}
			System.out.println(num1 + " ~ " + num2 +" 홀수 값의 합 = " + result);
	}

}