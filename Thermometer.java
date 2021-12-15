package application;

import java.util.Random;

public class Thermometer implements Sensor {
	private String truthValue="false";
	
	 public boolean isOn()
		{   
			if(this.truthValue.equals("true"))
					return true;
			else return false;
		}
		public void on()
		{
			 this.truthValue="true";
		}
	    public void off()
	    {
	    	 this.truthValue="false";
	    }
	    public int measure()
	    {
	    	if(this.isOn()==true)
	    	{   Random r=new Random();
	    	    int i=r.nextInt(30+30)-30;
	    		 return i;
	    		}
	    	else {
	    		throw new IllegalStateException("State Illegal");
	    	}
	    }

}
