package week10;

public class CD {
	private String artist;
	private String title;
	private int publishingYear;
	private double weight=0.1;
public CD(String a,String t,int publishingYear)
{
	this.artist=a;
	this.title=t;
	this.publishingYear=publishingYear;

}
public double weight()
{
	return this.weight;
}
public String toString()
{
	return this.artist+": "+this.title+", "+this.publishingYear;
	
}

}