package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class week3 {
	public static int sum(int n1,int n2,int n3,int n4)
	{int sum=0;
	sum=n1+n2+n3+n4;
	return sum;
	}

    public static double avg(int n1,int n2,int n3,int n4)
    {double answer=(double)sum(n1,n2,n3,n4)/4.0;
    return answer;}
    
    public static void palindrome(String word)
    { String reverse="";
    int l=word.length();
    for(int i=l-1;i>=0;i--)
    { reverse=reverse+word.charAt(i);
    }
    System.out.println(reverse);
    if(word.equals(reverse))
    {   
    	System.out.println("The word "+word+" is a palindrome");}
    else {
    	System.out.println("The word "+word+" is NOT a palindrome");
    }}
    
    public static ArrayList<Integer> length(ArrayList<String> list)
    { ArrayList<Integer> lengths=new ArrayList<Integer>();
      for( String word : list)
   { 
	   lengths.add(word.length());
   }
    
    return lengths;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*task1
	
	  System.out.println(avg(1,1,1,1));
	 */
		
	Scanner reader=new Scanner(System.in);
	
	/*task2
	
	System.out.println("Enter your name");
	String name=reader.nextLine();
	System.out.println("The number of characters is "+name.length());
	*/
	
	/*task3
	
	int l=name.length();
	for(int i=0; i<l;i++)
	{ System.out.println("The "+(i+1)+". character is "+name.charAt(i));
		
	}
	*/
	
	/*task4
	
	for(int i=name.length();i>0;i--)
	{ System.out.println(name.charAt(i-1));

	}
	*/
	
	/*task5
	
	 System.out.println("Enter the 1st word");
	 String first=reader.nextLine();
	 System.out.println("Enter the 2nd word");
	 String second=reader.nextLine();
	 int r=first.indexOf(second);
	 if(r==-1)
	 {   System.out.println("Not contained");
	 }
	 else { 
		 System.out.println(first+" contains "+second);
	 }
	 */
	
	/*task6 
	 
	ArrayList<String> words=new ArrayList<String>();
	for(;;)
    {System.out.println("Enter a word");
	String word=reader.nextLine();
    if(words.contains(word))
    { System.out.println("You have entered the word "+word+" twice");
      Collections.sort(words);
      System.out.println(words);
      break;
    }
    else {
    	words.add(word);
    }
    } 
    */
	 
    /*task7
     
  
	ArrayList<String> L=new ArrayList<String>();
	for(int i=0;i<3;i++)
	{
	System.out.println("Enter an element of the list");
	L.add(reader.nextLine());
	}
	System.out.println(length(L));
	
	*/
	
	
	/*task8
	
	System.out.println("Enter the word");
	String word=reader.nextLine();
    palindrome(word);
    */





	}}