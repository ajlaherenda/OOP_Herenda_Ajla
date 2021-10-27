package week4;

	import java.util.Random;

	public class Dice {

	   private Random random;
	   private int numberOfSides;
	   
	   public Dice(int nos)
	{  this.numberOfSides=nos;
	   random=new Random();
	}  public Dice() {
	System.out.println("Hello");
	}
	   public int roll()
	 { return random.nextInt(this.numberOfSides);
	}
	   public String toString()
	   {return "Number of sides is"+this.numberOfSides;
	}
	   
	}

