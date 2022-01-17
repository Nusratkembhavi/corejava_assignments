package Arithm_expce;

import java.util.Scanner;

public class Divide {

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
		catch(ArithmeticException ae)
		{
			System.out.println("error: Arithematic Exception invalide to divide by zero");
		}
		
	}

}
