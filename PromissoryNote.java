package week7;

import java.util.HashMap;

public class PromissoryNote {

private HashMap<String,Double> loans;


public PromissoryNote()
{
	loans=new HashMap<String,Double>();
	
}
public void setLoan(String toWhom, double value)
{
	loans.put(toWhom, value);
}
public double howMuchisDebt(String whose)
{
	
	return loans.get(whose);
}
}
