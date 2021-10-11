package week1;

import java.util.Scanner;

public class week1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//task 1
		System.out.print("Herenda Ajla");
    //task 2 in Eclipse we use sysout and ctrl+space
	    System.out.println("Hello world");
	    System.out.println("And all the other people in the world");
	//task 3
	    int x;
	    x=365*24*3600;
	    System.out.println("There are "+x+" days");
	//task 4
	    int a;
	    int b;
	    int s=0;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the 1st element");
	    a=scan.nextInt();
	    System.out.println("Enter the 2nd element");
	    b=scan.nextInt();
	    s=a+b;
	    System.out.println("The sum is "+s);
	//task 5
	    int n;
	    System.out.println("Enter a number");
	    Scanner number = new Scanner(System.in);
	    n=number.nextInt();
	    if(n>0)
	    {System.out.println("The number is positive");
	    }
	    else {System.out.println("The number is negative");}
	 //task 6
	    int c,d;
	    System.out.println("Enter the 1st number");
	    Scanner num= new Scanner(System.in);
	    c=num.nextInt();
	    System.out.println("Enter the 2nd number");
	    d=num.nextInt();
	    if(c>d)
	    {System.out.println(c+" is bigger than "+d);}
	    else if(c<d)
	    {System.out.println(d+" is bigger than "+c);}
	    else {System.out.println("They are equal");
	    }
	    }
	    
	    
		
	}
