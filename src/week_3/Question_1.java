package week_3;
import java.util.Scanner;

/* 문제 1. 국어와 영어 점수를 입력 받아 두 점수의 합이 120점 이상이면 합격을, 
그렇지 않으면 불합격을 출력하는 프로그램을 작성하시오.*/

public class Question_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// 입력 받기 위한 Scanner 객체 생성
		
		System.out.print("국어 점수를 입력하세요 : ");
		int korean = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int english = sc.nextInt();
		
		int sum = korean + english;				// 국어, 영어 점수의 합
		
		if(sum >= 120)							// 조건식
		{
			System.out.print("합격");
		}
		else
		{
			System.out.print("불합격");
		}
		
	}

}
