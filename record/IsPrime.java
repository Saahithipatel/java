import java.util.*;

class IsPrime
{
	public static void main(String args[]) 
	{
		int n;	
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		n=s.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+" is Not a Prime Number");
				System.exit(0);
			}
		}
		System.out.println(n+" is a Prime Number");
	}
}
