package week_6;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �Է� : ");
		int number = sc.nextInt();
		int result = 0;
		int count = 0;
		
		// 3�� ������� ����
		for(count = 3; count <= number; count +=3)
		{
			result += count;
		}
		
		System.out.println(number + "�� �Ѿ��� ���� �� : " + count);
		System.out.println(number + "�� �Ѿ��� �������� �� �հ� : " + result );
		System.out.println(number + "�� �Ѿ��� ������ �� ��° 3�� ����ΰ� : " + count / 3 );
	}

}
