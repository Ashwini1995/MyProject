package BasicPrograms;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		if(isPrime(5))
		{
			System.out.println("number is not prime");
		}
		else {
			System.out.println("Number is prime");
		}
		
		
	}
	
	public static boolean isPrime(int n)
	{
		if(n==0||n==1)
		{
			return true;
		}
		for(int i= 2;i< n  ; i++)
		{
			if(n%i ==0) 
			{
				return true;
			}
			
		}
		return false;
	
		

		
	}

}