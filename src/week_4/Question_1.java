package week_4;

import java.util.*;
/* 문제 1. 나이와 성적을 입력 받아 나이가 30세 미만이고, 성적이 3.5 이상이면 “추천 대상입니다”를 출력하고,
 *  그렇지 않으면 “추천 대상이 아닙니다”를 출력하는 프로그램을 작성하시오.*/

public class Question_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);	// 사용자의 입력을 받도록 함
		
		System.out.print("나이 입력 : ");			// 나이를 입력 받아 age에 저장
		int age = sc.nextInt();
		
		System.out.print("성적 입력 : ");			// 성적을 입력 받아 score에 저장
		double score = sc.nextDouble();
		
		if(age < 30 && score >= 3.5) 			// 조건문
		{
			System.out.print("추천 대상입니다 !");
		}
		else
		{
			System.out.print("추천 대상이 아닙니다 ㅠㅠ");
		}
	}

}
