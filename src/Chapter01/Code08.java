package Chapter01;
import java.util.*;

public class Code08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� :");
		int n = sc.nextInt();
		int [] data = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			data[i] = sc.nextInt();
		}sc.close();
		
		int sum = 0;
		int max = data[0];
		for(int i = 0; i < n; i++)
		{
			sum += data[i];
			if(data[i] > max) 
			{
				max = data[i];
			}
		}
		
		System.out.println("�� : " + sum);
		System.out.println("�ִ밪 : " + max);
	}

}
