package week_6;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int number = sc.nextInt();
		int result = 0;		// 결과 변수 초기화
		
		for(int i = 1; i <= number; i++)
		{
			result += i;	// result에 i를 +하며 반복
			if(i % 10 == 0)	// 매 10 단위마다 출력
			{
				System.out.println("1 - " + i + "까지의 합 : " + result);
			}
			else if(i == number)	// 마지막 숫자에 도달 시, 출력
			{
				System.out.println("1 - " + i + "까지의 합 : " + result);
			}
			
		}

	}

}
