package application;

import java.util.ArrayList;

public class AverageSensor implements Sensor {
	
	private String truthValue;
	private ArrayList<Sensor> avg=new ArrayList<Sensor>();

    public boolean isOn()
	{
		for(Sensor s:avg)
		{
			if(s.isOn()!=true)
			{
			   return false;
			}
	
		}
		return true;
	}
	public void on()
	{
		this.truthValue="true";
		for(Sensor s:avg)
		{
			s.on();
		}
	}
    public void off()
    {this.truthValue="false";
	for(Sensor s:avg)
	{
		s.off();
	}
    	
    }
    public int measure()
    {   int sum=0;
    	if(this.isOn()==false || (this.avg).size()==0)
    {
    	throw new IllegalStateException("Illegal State");
    }
    
    
    	for(Sensor s:avg)
    {
    	sum=sum+s.measure();
    }
    int m=sum/(avg.size());
    return m;
    }
    public void addSensor(Sensor additional)
    {
    	avg.add(additional);
    }
    public ArrayList<Integer> readings()
    {
    	ArrayList<Integer> r=new ArrayList<Integer>();
    	for(Sensor s:avg)
    	{
    		r.add(s.measure());
    	}
    	return r;
    }

}
