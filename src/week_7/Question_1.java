package week_7;

/*  ������ ���� �迭�� ���α׷� ���� �� �����ϰ� ���� ū ���� ���� ���� ���� ���Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
[ �迭 : 234 89 678 55 785 66 ] */

public class Question_1 {

	public static void main(String[] args) {
		int [] arr = {234, 89, 678, 55, 785, 66};
		
		// arr[0]�� �ִ�, �ּҰ����� �ʱ�ȭ
		int max = arr[0];
		int min = arr[0];
		
		// �ݺ���
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max)	// �ݺ����� ���� ���簪�� �ִ밪���� ũ�� ����
			{
				max = arr[i];
			}
			if(arr[i] < min)	// �ݺ����� ���� ���簪�� �ּҰ����� ������ ����
			{
				min = arr[i];
			}
		}
		
		System.out.println("���� ū �� : " +  max);
		System.out.println("���� ���� �� : " +  min);
		
	}

}
