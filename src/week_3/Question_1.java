package week_3;
import java.util.Scanner;

/* ���� 1. ����� ���� ������ �Է� �޾� �� ������ ���� 120�� �̻��̸� �հ���, 
�׷��� ������ ���հ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

public class Question_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// �Է� �ޱ� ���� Scanner ��ü ����
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int korean = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int english = sc.nextInt();
		
		int sum = korean + english;				// ����, ���� ������ ��
		
		if(sum >= 120)							// ���ǽ�
		{
			System.out.print("�հ�");
		}
		else
		{
			System.out.print("���հ�");
		}
		
	}

}
