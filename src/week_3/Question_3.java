package week_3;
import java.util.*;

/*����3.������ ���� ��ǥ�� ���� �Է� �޾� ��ǥ���� 50% �̻��� ��� ����ȿ ��ǥ�Դϴ١��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
public class Question_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		// �Է� �ޱ� ���� Scanner ��ü ����
		
		System.out.print("������ ���� �Է��ϼ��� : ");
		int voter = sc.nextInt();
		System.out.print("��ǥ�� ���� �Է��ϼ��� : ");
		int voted = sc.nextInt();
		
		double turnout = ((double) voted / voter) * 100;	// ��ǥ��
		
		if(turnout >= 50)	// ���ǽ�
		{
			System.out.print("��ȿ ��ǥ�Դϴ�.");
		}
		else
		{
			System.out.print("��ȿ ��ǥ�Դϴ�.");
		}
		
	}

}
