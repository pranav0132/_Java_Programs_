// Write a program to find the largest of 3 numbers.
package pk1;
import java.util.*;
public class Exp1_a {

	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a=sc.nextInt();
		System.out.println("Enter the Second number:");
		b=sc.nextInt();
		System.out.println("Enter the Third number:");
		c=sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("First is GREATER among them");
			}
			else
			{
				System.out.println("Third is GREATER among them");
			}
		}
		else if(b>c)
		{
				System.out.println("Second is GREATER among them");
		}
		else
		{
			System.out.println("Third is GREATER among them");
		}
	}

}
