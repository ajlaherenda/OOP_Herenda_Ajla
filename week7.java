package week7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class week7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//task1
/*
HashMap <String,String> people=new HashMap<String,String>();
people.put("matti", "magi");
people.put("mikael", "mixu");
people.put("arto", "arppa");
System.out.println("Mikael's nickname is "+people.get("mikael"));
*/
//task2
/*
	    PromissoryNote mattisNote=new PromissoryNote();
		mattisNote.setLoan("Arto", 51.5);
		mattisNote.setLoan("Mikael", 30);
		System.out.println(mattisNote.howMuchisDebt("Arto"));
		System.out.println(mattisNote.howMuchisDebt("Mikael"));
*/
//task3
/*
Dictionary dictionary=new Dictionary();
dictionary.add("apina", "monkey");
dictionary.add("banaani", "banana");
dictionary.add("cembalo", "harpsichord");
System.out.println(dictionary.translate("apina"));
System.out.println(dictionary.translate("porkkana"));
System.out.println("Number of words in the dictionary is "+dictionary.amountOfWords());
ArrayList<String> translations=new ArrayList<String>();
translations=dictionary.translationList();
for(String translation:translations)
{
	System.out.println(translation);
}

*/
//task4
System.out.println("Enter the command");
Scanner reader=new Scanner(System.in);
Dictionary dict=new Dictionary();
TextUserInterface ui=new TextUserInterface(reader,dict);
ui.start();


	}

}
