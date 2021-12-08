package week6;

public class Book {

	private String bookTitle;
	private String publisher;
	private int publishingYear;
	
public Book(String bT, String p,int y)
{
	this.bookTitle=bT;
	this.publisher=p;
	this.publishingYear=y;
}

public String Title()
{
	return this.bookTitle;
}

public String Publisher ()
{
	return this.publisher;
}
public int Year()
{
	return this.publishingYear;
}
public String toString()
{
	return this.bookTitle+", "+this.publisher+", "+this.publishingYear;
}
}
