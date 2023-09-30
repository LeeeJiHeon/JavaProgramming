package week_3;
import java.util.Scanner;

/* 문제9. 2개의 값을 입력 받아 값을 큰 순서대로 출력하는 프로그램을 작성하시오. */
public class Question_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		// 입력 받기 위한 Scanner 객체 생성
		
		System.out.print("입력 값 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 > num2)	// num1이 num2 보다 클 경우 num1을 먼저 출력
		{
            System.out.println("출력 값 : " + num1 + " " + num2);
        }
		else 
        {
            System.out.println("출력 값 : " + num2 + " " + num1);
        }

	}

}
