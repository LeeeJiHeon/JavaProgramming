package week_6;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int number = sc.nextInt();
		int result = 0;		// ��� ���� �ʱ�ȭ
		
		for(int i = 1; i <= number; i++)
		{
			result += i;	// result�� i�� +�ϸ� �ݺ�
			if(i % 10 == 0)	// �� 10 �������� ���
			{
				System.out.println("1 - " + i + "������ �� : " + result);
			}
			else if(i == number)	// ������ ���ڿ� ���� ��, ���
			{
				System.out.println("1 - " + i + "������ �� : " + result);
			}
			
		}

	}

}
