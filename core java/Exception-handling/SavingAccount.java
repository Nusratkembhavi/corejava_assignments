package Arithm_expce;
import java.util.*;

		public class SavingAccount
		{
			 
			static void withdrawal() throws IllegalAccessException 
		    { 
				long id = 5678654l;
		        double balance = 0, damount, wamount;
		        System.out.println(id);

		        Scanner dep=new Scanner(System.in);
		        System.out.println("Deposit an amount");
		        damount=dep.nextInt();
		        balance += damount;

		        Scanner wd=new Scanner(System.in);
		        System.out.println("Withdraw an amount");
		        wamount=wd.nextInt();
		        balance -= wamount;


		        if (balance<0)
		        {
		        throw new IllegalAccessException(); 
		        }
		        else
		        System.out.println(balance);
		    }
			
			



		    public static void main(String args[]) 
		    { 

		        try
		        { 
		        	 withdrawal(); 
		        } 
		        catch(IllegalAccessException ex) 
		        { 
		            System.out.println("IsufficientBalanceException"); 
		        } 
		    } 
		} 
		        