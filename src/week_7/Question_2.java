package week_7;

/* ������ ���� �迭�� ���α׷� ���� �� �����ϰ� ���� ū ���� ���� ���� ���� 
   ������ ������ ���� �հ� ����� ���Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
   [ �迭 : 234 44 89 678 55 785 66 88 ] */
public class Question_2 {

	public static void main(String[] args) {
		int [] arr = {234, 44, 89, 678, 55, 785, 66, 88};
		int sum = 0;
		int min = arr[0]; 
		int max = arr[0];
		
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
		
		for(int i = 0; i < arr.length; i++)
		{
			// �ִ밪�� �ּҰ��� ������ ������ ������ ��
			if(arr[i] != max && arr[i] != min)
			{
				sum += arr[i];
			}
		}
		
		System.out.println("���� ū ���� ���� ���� ������ �� : " + sum);
		System.out.println("���� ū ���� ���� ���� ������ ��� : " + sum / 6);
	}

}