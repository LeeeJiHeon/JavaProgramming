package week_7;

import java.util.Arrays;

/* ������ ���� ���� �迭�� ���α׷� ���� �� �����ϰ� ���ĺ���(��������)���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
   [ �迭 : kim park oh lim pang seo lee yang bae back ] */

public class Question_4 {

	public static void main(String[] args) {
		 String[] arr = {"kim", "park", "oh", "lim", "pang", "seo", "lee", "yang", "bae", "back"};
	
		 // ���� �� �迭 ���
		 System.out.print("���� �� : ");
		 for(int i = 0; i < arr.length; i++)
		 {
			 System.out.print(arr[i] + " ");
		 }
		 
		 // ���ĺ������� ����
		 Arrays.sort(arr);
		 
		 // ���� �� �迭 ���
		 System.out.print("\n���� �� : ");
		 for(int i = 0; i < arr.length; i++)
		 {
			 System.out.print(arr[i] + " ");
		 }
		 
	}

}