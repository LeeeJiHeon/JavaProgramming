package week_5;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사용자 입력 : ");
		int user = sc.nextInt();
		int number = 8;						// 초기값 = 8
		
		System.out.println("** " + user + "단 **");	// 사용자가 입력한 숫자의 단 출력
		
		do
		{
			// 계산식 출력
			System.out.println(number + " * " + user + " = " + number * user); 
			number -= 2;	// number을 2씩 낮춤 
		} while(number >= 2);

	}

}