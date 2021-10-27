package week4;

import java.util.ArrayList;
import java.util.Random;

public class week4 {
	
	public static void combine(ArrayList<Integer> first, ArrayList<Integer> second)
	{ first.addAll(second);}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*task1
	 	 ArrayList<Integer> list1 = new ArrayList<Integer>();
		 ArrayList<Integer> list2 = new ArrayList<Integer>();
		 list1.add(4);
		 list1.add(3);
		 list2.add(5);
		 list2.add(10);
		 list2.add(7);
		 System.out.println(list1);
		 System.out.println(list2);
		 combine(list1,list2);
		 System.out.println(list1);
         System.out.println(list2);
    */
	/*task2
		Dice d=new Dice(6);
		System.out.println(d.roll());
		*/
	//task3 
		LyyraCard card=new LyyraCard(50);
		System.out.println(card);
		card.payEconomical();
		System.out.println(card);
		card.payGourmet();
		card.payEconomical();
		System.out.println(card);
	//"spending" money to test if I have implemented part 3 in the right way	
		for(int i=0;i<11;i++)
		{card.payGourmet();}
		System.out.println(card);
		card.payGourmet();//after this the balance would be -3 euros
	    System.out.println(card);
	//adding some money
	  card.loadMoney(19.00);
	  System.out.println(card);
	  card.loadMoney(150.00);
	  System.out.println(card);//it would usually be 170, but because of the constraint it is 150
	
	//after editing the loadMoney there should not be a decrease in the balance
	  System.out.println(card);
	  card.loadMoney(-15.00);
	  System.out.println(card);
	 
	//task 3 last part
	  LyyraCard Pekka=new LyyraCard(20); 
	  LyyraCard Brian=new LyyraCard(30);
	  Pekka.payGourmet();
	  Brian.payEconomical();
	  System.out.println("Pekka"+Pekka);
	  System.out.println("Brian:"+Brian);
	  Pekka.loadMoney(20);
	  Brian.payGourmet();
	  System.out.println("Pekka"+Pekka);
	  System.out.println("Brian:"+Brian);
	  Pekka.payEconomical();
	  Pekka.payEconomical();
	  Brian.loadMoney(50);
	  System.out.println("Pekka: "+Pekka);
	  System.out.println("Brian: "+Brian);
	}
	
		
}
