package week_6;

public class Question_7 {

	public static void main(String[] args) {
		int number = 1;		// ���۰� �ʱ�ȭ
		
		System.out.print("[");
		
		for(int i = 1; i <= 15; i++)
		{
			System.out.print(number + ", ");	// ���� ���� ���
			number += i;						// ���� ���� ���
		}
		
		System.out.print("]");

	}

}
