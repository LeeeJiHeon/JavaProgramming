package week_4;
import java.util.*;

/* ����7. ù ��°�� ���ڸ�, �� ��°�� ������(+, -)��, �� ��°�� ���ڸ� �Է� �޾� �� ��°�� ������ ������ �����ϰ�
 * �� ����� 0���� ũ�� �������� ����� ����Դϴ١�, 0�̸� �������� ����� 0�Դϴ١�, 
 * 0���� ������ �������� ����� �����Դϴ١��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */

public class Question_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// ������� �Է��� �޵��� ��
		int result = 0;							// ����� ����
		
		System.out.print("ù ��° ���� �Է� : ");	// ù ��° ���ڸ� �Է¹޾� num1�� ����
		int num1 = sc.nextInt();
			
		System.out.print("����(+, -) �Է� : ");	// �����ڸ� �Է¹޾� calculation�� ����
		char calculation = sc.next().charAt(0);
		
		System.out.print("�� ��° ���� �Է� : ");	// �� ��° ���ڸ� �Է¹޾� num2�� ����
		int num2 = sc.nextInt();
		
		// ���ǹ� : �����ڰ� (+)�� ���
		if(calculation == '+')	
		{
			result = num1 + num2;
			if(result > 0)
			{
				System.out.print("������ ����� ���(+)�Դϴ�.");
			}
			else if(result == 0)
			{
				System.out.print("������ ����� 0�Դϴ�.");
			}
			else if(result < 0)
			{
				System.out.print("������ ����� ����(-)�Դϴ�.");
			}
		}
		
		// ���ǹ� : �����ڰ� (-)�� ���
		else if(calculation == '-')
		{
			result = num1 - num2;
			if(result > 0)
			{
				System.out.print("������ ����� ���(+)�Դϴ�.");
			}
			else if(result == 0)
			{
				System.out.print("������ ����� 0�Դϴ�.");
			}
			else if(result < 0)
			{
				System.out.print("������ ����� ����(-)�Դϴ�.");
			}
		}
		
		// (+, -)�� ������ �����ڸ� �Է��� ���
		else
		{
			System.out.println("�����ڸ� �ٽ� �Է����ּ���.");
		}
	}

}
