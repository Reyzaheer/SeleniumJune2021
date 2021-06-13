package week1.day1.assignments;
public class PrimeNumber {

	public static void main(String[] args) {
		int Input = 4;
		boolean flag = false;
		for (int i =2; i <= Input/2; i++)
			if (Input % i == 0)
			{
				flag = true;
				break;
			}
		
if (flag != true)
{
	System.out.println("Prime");
	
}
else 
{
	System.out.println("Not Prime");
}

	}
	}


