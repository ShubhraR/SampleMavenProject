package factorial;

public class Fact {
	
	public int calculateFactorial(int number)// throws IllegalArgumentException
	{	
		if(number < 0 )
				throw new IllegalArgumentException("n cannot be < 0 !");
		else if(number==0 || number== 1)
			return 1;
		
		else if (number>=13)
			throw new IllegalArgumentException("n cannot be greater than 12");
		else
		{
			int result = 1;
			for(int i=number;i>1;i--)
			{
				result*=i;
			}
		return result;
		}
		
	}


}
