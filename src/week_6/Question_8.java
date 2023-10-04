package week_6;

import java.util.Scanner;

public class Question_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int number = sc.nextInt();
	
		for(int i = 2; i <= number; i++)
		{
			int j = 0;		// 약수의 갯수를 저장
			
			for(int k = 1; k <= i; k++)
			{
				if(i % k == 0)	
				{
					j++;	// 약수 개수 증가
				}
			}
			if(j == 2)		// 약수가 2개면 소수 (1과 자신의 수)
			{
				System.out.println(i + " ");
			}
			
		}
		
	}

}