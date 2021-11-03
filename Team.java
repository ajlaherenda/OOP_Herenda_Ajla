package week5;

import java.util.ArrayList;

public class Team {
private String name;
private ArrayList<Player> players=new ArrayList<Player>();
private int maxSize=16;
private int size=0;


public Team(String n)
{ 
	this.name=n;
	
}

public String getName()
{ 
	return this.name;
}
public void addPlayer(Player p)
{   this.size++;
	if(this.getSize()<=this.maxSize)
	{
	this.players.add(p);
	}
	else {
		System.out.println("The team has the max number of players");
	}
	
}
public void printPlayers()
{   for(Player p : players)
{
	System.out.println(p);
}
}
public void setMaxSize(int mSize)
{ 
	this.maxSize=mSize;
}

public int getSize()
{
	return this.size;
}
public int goals()
{   int totalGoals=0;
	for( Player p: players)
	{
		totalGoals=totalGoals+p.getGoals();
	}
	return totalGoals;
}

}
