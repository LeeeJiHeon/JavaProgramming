package week_5;

public class Question_5 {

	public static void main(String[] args) {
		int result = 0;		// ��� ���� �ʱ�ȭ
		int num = 1;		// ���� ���� = 1
		
		do
		{
			result = result + num;	
			if (num % 10 == 0)		// ���ڰ� 10�� ����� ��� ���
			{
				System.out.println("1 - " + num + " : " + result);
			}
			num += 1;				// +�Ͽ� ���� ���ڷ� �̵�
		} while(num <= 100);
				
	}

}