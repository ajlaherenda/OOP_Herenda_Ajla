package week10;

public class Things implements ToBeStored {
	private double weight;

public Things(Book b)
{
  this.weight=b.weight();
}
public Things(CD cd)
{
  this.weight=cd.weight();
}
public double weight()
{
	return this.weight;
}
}