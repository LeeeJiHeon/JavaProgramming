package week_7;

/* ������ ���� 2���� �迭�� �����ϰ�, �迭�� �� �߿��� 3�� ����� �ش��ϴ� ���� �� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */
public class Question_5 {

	public static void main(String[] args) {
		int[][] arr = {
	            {28, 33, 36, 7},
	            {56, 66, 44, 20},
	            {88, 7, 21, 44},
	            {33, 2, 643, 4}
		};

	        int count = 0; // 3�� ����� ������ ������ ���� �ʱ�ȭ

	        for (int i = 0; i < arr.length; i++) 
	        {
	            for (int j = 0; j < arr[i].length; j++)
	            {
	                if (arr[i][j] % 3 == 0)
	                {
	                    count++; // 3�� ����� ��� count ����
	                }
	            }
	        }
	        
	        System.out.println("{ 3�� ����� " + count + "���Դϴ�. }");
	}

}
