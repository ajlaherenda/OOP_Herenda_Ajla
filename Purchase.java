package week10;

public class Purchase {
private String product;
private int amount;
private int unitPrice;
Purchase(String product, int amount, int unitPrice)
{
	this.product=product;
	this.amount=amount;
	this.unitPrice=unitPrice;
}
public int price()
{  int price=this.amount*this.unitPrice;
	return price;
}
public void increaseAmount()
{
	this.amount++;
}
public String toString()
{
	return this.product+":"+" "+this.amount;
}
}
