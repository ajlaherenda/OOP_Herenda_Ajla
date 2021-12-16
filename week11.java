package week11;
import mooc.logic.ApplicationLogic;
import mooc.ui.UserInterface;
import tools.DuplicateRemover;
import tools.PersonalDuplicateRemover;
import mooc.ui.TextUserInterface;

import java.io.File;
import java.io.FileNotFoundException;

import application.AverageSensor;
import application.ConstantSensor;
import application.Sensor;
import application.Thermometer;
import file.Analysis;
public class week11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//task1
		
/*
		UserInterface ui = new TextUserInterface() ;
		new ApplicationLogic(ui).execute(3);
*/
//task2 Person p=new Person("Ajla",121);
//task3		

		/*	ConstantSensor ten = new ConstantSensor(10);
			ConstantSensor minusFive = new ConstantSensor(-5) ;
			System.out.println( ten.measure() );
			System.out.println( minusFive.measure() );
			System.out.println(ten.isOn());
			ten.off();
			System.out.println(ten.isOn()); 
			Thermometer t=new Thermometer(); 
			System.out.println(t.measure());
			*/
			//THE result for avg temp does not match the values assigned by random because they are when called randomized once again and can't be the same as in print 
		    /*
		        Sensor kumpula = new Thermometer () ;
				kumpula.on();
				System.out.println("the temperature in Kumpula is "+kumpula.measure() +
				" degrees");
				Sensor kaisaniemi = new Thermometer() ;
				kaisaniemi.on();
				System.out.println("the temperature in Kaisaniemi is "+kaisaniemi.measure() +" degrees");
				Sensor helsinkiVantaa = new Thermometer();
				helsinkiVantaa.on();
				System.out.println("the temperature in HelsinkiVanta is "+helsinkiVantaa.measure() +" degrees");
				AverageSensor helsinkiArea = new AverageSensor();
				helsinkiArea.addSensor(kumpula);
				helsinkiArea.addSensor(kaisaniemi);
				helsinkiArea.addSensor(helsinkiVantaa);
				helsinkiArea.on();
				System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure()+" degrees");
	            
				System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure());
				System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure());
				System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure());
				System.out.println("readings: "+helsinkiArea.readings());
				*/
		//task4
		/*
		Printer printer= new Printer("/Users/ajlaherenda/eclipse-workspace/week11/textfile");
		printer.printLinesWhichContain("Väinämöinen");
		System.out.println("----") ;
		printer.printLinesWhichContain("Frank Zappa") ;
		System.out.println("----");
		printer.printLinesWhichContain("");
		System.out.println("----"); */
		//task5
		/*
		File file=new File("/Users/ajlaherenda/eclipse-workspace/week11/testFile");
		Analysis analysis=new Analysis(file);
        System.out.println("Lines: "+analysis.lines());
        System.out.println("Charachters: "+analysis.characters()); */
		//task6
		/*
		MultipleEntryDictionary dict = new PersonalMultipleEntryDictionary();
		dict.add("kuusi","six");
		dict.add("kuusi","spruce");
		dict.add("pii","silicon");
		dict.add("pii","pi");
		System.out.println(dict.translate("kuusi"));
		dict.remove("pii");
		System.out.println(dict.translate("pii")); */
		//task7
		/*
		DuplicateRemover remover = new PersonalDuplicateRemover();
		remover.add ("first");
		remover.add ("second");
		remover.add("first");
		System.out.println( "Current number of duplicates:"+remover.getNumberOfDetectedDuplicates());
		remover.add("last");
		remover.add("last");
		remover.add("new");
		System.out.println("Current number of duplicates:"+remover.getNumberOfDetectedDuplicates());
		System.out.println("Unique characterstrings:"+remover.getUniqueCharacterStrings());
		remover.empty();
		System.out.println( "Current number of duplicates:"+remover.getNumberOfDetectedDuplicates());
		System.out.println("Unique characterStrings:"+remover.getUniqueCharacterStrings()); */
        
	}

}
