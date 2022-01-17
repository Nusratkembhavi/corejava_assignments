package assig2_2;
import java.util.*;

  class Employee {
	    
	     public void totalsalary()
	     {
	    	 double Basic_Salary=18000, DA, HRA,  total_salary;
//	         Scanner sc = new Scanner(System.in);
//	         
//	         System.out.println("Enter Basic Salary : ");
//	         Basic_Salary = sc.nextDouble();
	         
	         DA = (Basic_Salary * 40) / 100;
	         HRA = (Basic_Salary * 20) / 100;
	         total_salary = Basic_Salary + DA + HRA;
	         
	         System.out.println(" total_salary of an employee : " +  total_salary);
	     }
	     
	   
	 static class Manager extends Employee
	 {
		 double incentives=2100;
		// Scanner sc1 = new Scanner(System.in);
		 
		// System.out.println("Enter incentives : ");
        // incentives = sc1.nextDouble();
		 @Override
		 public void totalsalary()
	     {
			 double Basic_Salary=20000, DA, HRA,  total_salary;
	        // Scanner sc = new Scanner(System.in);
	         
	         //System.out.println("Enter Basic Salary : ");
	         //Basic_Salary = sc.nextDouble();
	         
	         DA = (Basic_Salary * 40) / 100;
	         HRA = (Basic_Salary * 20) / 100;
	         total_salary = Basic_Salary + DA + HRA+ incentives;
	         
	         System.out.println(" total_salary of manager : " +  total_salary);
	     }
		 
	 }
	 
static class Labour extends Employee
	{
		double overtime=1500;
		@Override
			 public void totalsalary()
		     {
				 double Basic_Salary=14000, DA, HRA,  total_salary;
		        // Scanner sc = new Scanner(System.in);
		         
		         //System.out.println("Enter Basic Salary : ");
		         //Basic_Salary = sc.nextDouble();
		         
		         DA = (Basic_Salary * 40) / 100;
		         HRA = (Basic_Salary * 20) / 100;
		         total_salary = Basic_Salary + DA + HRA+ overtime;
		         
		         System.out.println(" total_salary of labour : " +  total_salary);
		     }
	     
	}
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.totalsalary();
		Manager m1 = new Manager();
		m1.totalsalary();
		Labour l1 = new Labour();
		l1.totalsalary();
		
	}

}
