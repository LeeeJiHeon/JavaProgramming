package week_6;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사용자 입력 : ");
		int number = sc.nextInt();
		int result = 0;
		int count = 0;
		
		// 3의 배수끼리 덧셈
		for(count = 3; count <= number; count +=3)
		{
			result += count;
		}
		
		System.out.println(number + "을 넘었을 때의 값 : " + count);
		System.out.println(number + "을 넘었을 때까지의 총 합계 : " + result );
		System.out.println(number + "을 넘었을 때까지 몇 번째 3의 배수인가 : " + count / 3 );
	}

}
