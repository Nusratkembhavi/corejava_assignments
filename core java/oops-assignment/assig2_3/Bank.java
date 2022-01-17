package assig2_3;

 class Bank 
{
	double total_cash;
    double amt_balance=1000;
   public void totalbalance()
    {
	   total_cash=amt_balance;
        System.out.println("balance is"+amt_balance);
    }

 static class Savings extends Bank
 {
	 double fixed_deposits=20000;
	 @Override
	 public void totalbalance()
	 {
		 total_cash=amt_balance+fixed_deposits;
		 System.out.println("total cash is : " + total_cash);
	 }
 }
	 
	 
static class Current extends Bank
	{
		double cash_credit=1500;
		@Override
		public void totalbalance()
		 {
			 total_cash=amt_balance+cash_credit;
			 System.out.println("total cash is : " + total_cash);
		 }
	}
	
	public static void main(String[] args) 
	{
		Bank b1 = new Bank();
		b1.totalbalance();
		Savings s1= new Savings();
		s1.totalbalance();
		Current c1 = new Current();
		c1.totalbalance();
		
		// TODO Auto-generated method stub

	}

}
