package week_5;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���� 2�� �Է� : ");
			
			int num1 = sc.nextInt();	// ù ���� ���� �Է�
			int num2 = sc.nextInt();	// �� ��° ���� �Է�
			int result = 0;				// ��� ���� �ʱ�ȭ
			
			if(num1 > num2)				// num1�� num2���� Ŭ ��� ���� ��ȯ
			{
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			
			for(int i = num1 + 1; i < num2; i++)	// �� ���� ���� Ȧ�� �� ���ϱ�
			{
				if(i % 2 == 1)
				{
					result += i;
				}
			}
			System.out.println(num1 + " ~ " + num2 +" Ȧ�� ���� �� = " + result);
	}

}