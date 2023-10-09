package week_7;

import java.util.Arrays;

/* 다음과 같은 문자 배열을 프로그램 실행 시 생성하고 알파벳순(내림차순)으로 정렬하는 프로그램을 작성하시오.
   [ 배열 : kim park oh lim pang seo lee yang bae back ] */

public class Question_4 {

	public static void main(String[] args) {
		 String[] arr = {"kim", "park", "oh", "lim", "pang", "seo", "lee", "yang", "bae", "back"};
	
		 // 정렬 전 배열 출력
		 System.out.print("정렬 전 : ");
		 for(int i = 0; i < arr.length; i++)
		 {
			 System.out.print(arr[i] + " ");
		 }
		 
		 // 알파벳순으로 정렬
		 Arrays.sort(arr);
		 
		 // 정렬 후 배열 출력
		 System.out.print("\n정렬 후 : ");
		 for(int i = 0; i < arr.length; i++)
		 {
			 System.out.print(arr[i] + " ");
		 }
		 
	}

}