package Arithm_expce;

import java.util.Scanner;

public class exception_2 {
	static void enter(int a, int b) throws UnsupportedOperationException {
		if (b==0)
		{
			throw new UnsupportedOperationException("Exception");
		}
	}

	public static void main(String[] args) {
		try
		{
			Scanner sc1= new Scanner(System.in);
			System.out.println("enter variable a:");
			int a=sc1.nextInt();
			
			System.out.println("enter variable b:");
			int b=sc1.nextInt();
			int c=a/b;
			System.out.println("result is:"+c);
		}
		catch(UnsupportedOperationException e)
		{
			System.out.println("error: invalide to divide by zero");
		}
		

	}

}
