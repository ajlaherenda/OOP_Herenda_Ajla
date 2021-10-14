package week2;

import java.util.Random;
import java.util.Scanner;

public class week2 {

	//functions from tasks 6, 7 & 8
	 public static void printText() {
        String message = "In the beginning there were the swamp, the hoe and Java.";
        System.out.println(message);
     }
	 private static void printStars(int n)
	 { for(int i=0;i<n;i++)
	 {System.out.print("*");
	 }}
	 public static int drawNumber()
	 {Random r=new Random();
	 int n=r.nextInt(100);
	 return n;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 /*	task1
		Scanner reader =new Scanner(System.in);
		String password="ajla";
		System.out.println("Enter the password");
		String user_input=reader.nextLine();
		while(!password.equals(user_input))
		{ System.out.println("Wrong");
		  System.out.println("Enter the password");
		  user_input=reader.nextLine();
		}
		System.out.println("Correct");
		System.out.println("The secret is sjdbk");
	*/
		
	/*task2
		Scanner reader=new Scanner(System.in);
		int sum=0;
		int read;
		for(int i=0;i<3;i++)
		{System.out.println("Enter a number");
		read=reader.nextInt();
		sum+=read;}
		System.out.println("The sum is "+sum); 
		*/
	
	/*task3
		Scanner reader=new Scanner(System.in);
		int sum=0;
		while(true)
		{System.out.println("Enter a number");
		int read=Integer.parseInt(reader.nextLine());
		if(read==0)
		{   break;
			}
			
		else
		{   sum+=read;
			System.out.println("Current sum is "+sum);
		}
		}
		System.out.println("The total sum is "+sum);
		*/
	/*task 4
		Scanner reader=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter the 1st number");
		n1=reader.nextInt();
		n2=reader.nextInt();
		while(n1<=n2)
		{System.out.println(n1);
		n1++;
		}
	*/

	/*task5
		Scanner reader=new Scanner(System.in);
		int n;
		int sum=0;
		System.out.println("Enter the exponent");
		n=reader.nextInt();
		for(int i=0;i<=n;i++)
		{sum+=Math.pow(2, (double)i);
		}
		System.out.println("The sum is "+sum);
	*/
		
	//task6
		
		//printText();
		
	/*task7
	 
		Scanner reader=new Scanner(System.in);
		int n;
		System.out.println("Enter the number of stars you would like to have");
		n=reader.nextInt();
		printStars(n);
	*/
		
	/*task8
	 
		Scanner reader=new Scanner(System.in);
		int random_number=drawNumber();
		int c=0;
		while(true)
		{System.out.println("Guess the number");
		int guess=reader.nextInt();
		c++;
		if(guess<random_number)
		{
			System.out.println("The drawn number is bigger than your guess and this is the "+c+". guess");
		}
		else if(guess>random_number)
		{
			System.out.println("The drawn number is smaller than your guess and this is the "+c+". guess");
		}
		else {
			System.out.println("You have guessed right");
			break;
		}
		
		
		}
	*/
		
	       
}}
