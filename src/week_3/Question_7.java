package week_3;
import java.util.Scanner;

/* ����7. ���̸� �Է� �޾� �Էµ� ���̰� 19�� �̸��̸� ���̼������Դϴ١�, 19���̸� ��19���Դϴ١���, 
   19������ ������ �������Դϴ١��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
public class Question_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// �Է� �ޱ� ���� Scanner ��ü ����
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		if(age < 19)	// ���ǽ�
		{
			System.out.print("�̼������Դϴ�.");
		}
		else if(age == 19)
		{
			System.out.print("19���Դϴ�.");
		}
		else
		{
			System.out.print("�����Դϴ�.");
		}
	}

}
