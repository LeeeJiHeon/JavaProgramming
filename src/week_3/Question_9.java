package week_3;
import java.util.Scanner;

/* ����9. 2���� ���� �Է� �޾� ���� ū ������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */
public class Question_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		// �Է� �ޱ� ���� Scanner ��ü ����
		
		System.out.print("�Է� �� : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 > num2)	// num1�� num2 ���� Ŭ ��� num1�� ���� ���
		{
            System.out.println("��� �� : " + num1 + " " + num2);
        }
		else 
        {
            System.out.println("��� �� : " + num2 + " " + num1);
        }

	}

}
