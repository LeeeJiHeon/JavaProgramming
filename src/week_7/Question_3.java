package week_7;

/* ������ ���� 10���� ���� �迭�� �����ϰ� �迭�� �� �����Ͱ� �� ĭ�� �������� �̵��Ͽ� �ٽ� ����ǵ��� �ϴ� ���α׷��� �ۼ��Ͻÿ�. 
   ��, �ʱ� �迭�� ���� ���� �����ʹ� ���� ���������� �̵��Ѵ�. �ʱ� �迭 ���� �̵� �� �迭 ���� ����Ͻÿ�.
   [ �迭 : 33 2 189 72 7 91 5 14 17 9 ] */
public class Question_3 {

	public static void main(String[] args) {
		int [] arr = {33, 2, 189, 72, 7, 91, 5, 14, 17, 9};
		int temp = arr[0];	// ù ��° �迭 ��Ҹ� �ӽ� ������ ����
		
		// �ʱ� �迭 �� ���
		System.out.print("�ʱ� �迭 �� : ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		// �迭�� �������� �� ĭ�� �̵�
		for(int i = 1; i < arr.length; i++)
		{
			arr[i-1] = arr[i];
		}
		
		// temp ���� �迭�� ������ ��ҷ� ����
		arr[arr.length - 1] = temp;
		
		// �̵� �� �迭 �� ���
		System.out.print("\n�̵� �� �迭 �� : ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}