package week_6;

import java.util.Scanner;

public class Question_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int number = sc.nextInt();
	
		for(int i = 2; i <= number; i++)
		{
			int j = 0;		// ����� ������ ����
			
			for(int k = 1; k <= i; k++)
			{
				if(i % k == 0)	
				{
					j++;	// ��� ���� ����
				}
			}
			if(j == 2)		// ����� 2���� �Ҽ� (1�� �ڽ��� ��)
			{
				System.out.println(i + " ");
			}
			
		}
		
	}

}