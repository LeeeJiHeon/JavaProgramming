package Chapter01;

public class Code10 {
	
	public static void main(String[] args) {
		
		for(int i = 2; i <= 100000; i++)
		{
			boolean isPrime = true;
			for(int j=2; j*j <= i && isPrime; j++ )
			{
				if(i % j == 0)
				{
					isPrime = false;
				}
			}
			if(isPrime)
			{
				System.out.println(i);
			}
		}
	
	}
}
