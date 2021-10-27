package week4;

	public class LyyraCard {
		private double balance;
		public LyyraCard (double balanceAtStart)
		{
		this.balance=balanceAtStart;
		}
		public String toString()
		{
		return "The card has "+this.balance+" euros ";
		}
		public void payEconomical()
		{
		if (balance<2.50)
		{
		balance=balance;
		}
		else {
		balance=balance-2.50;
		}
		}

		public void payGourmet()
		{
		if(balance<4.00)
		{
		balance=balance;
		}
		else {
		balance=balance-4.00;
		}
		}
		public void loadMoney(double amount)
		{if(amount>0) {
		balance=balance+amount;
		if(balance>150.00)
		{balance=150.00;
		}
		else {
		balance=balance;
		}}
		else {
		balance=balance;}
		}
		}


