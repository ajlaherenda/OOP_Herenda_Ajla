package week10;



public class Box{

	private int boxSize;
	private int counter=0;
	private double weight;
	private double maxWeight;
public Box(int s, int w)
{
	this.boxSize=s;
	this.weight=w;
}
public void add (Things d)
{
	if (this.counter<this.boxSize)
	{
		if(this.weight+d.weight()<=maxWeight)
		{
			this.counter++;
			this.weight=this.weight+d.weight();
		}
	}
	
}
public String toString()
{
	return "The box weighs "+this.weight+" and has "+this.counter+" items";
}
}
