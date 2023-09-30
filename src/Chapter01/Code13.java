package Chapter01;

import java.util.Scanner;

public class Code13 {

	public static void main(String[] args) {
		System.out.print("입력받을 정수의 개수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt(); 
		}
		sc.close();

		int maxPrime =0;
		for (int i = 0; i < n; i++)
		{
			for(int j = i; j < n; j++)
			{
				//convert data[i] ... data[i] into an integer
				int val = 0;
				for(int k = i; k <= j; k++)
				{
					val = val * 10 + arr[k];
				}
				boolean isPrime = true;
				
				// test if it is  a prime
				// if yes, compare to the max
			}
		}
	}

}
