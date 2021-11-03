package week5;

public class Player {
private String name;
private int goals;

public Player(String n)
{
	this.name=n;
}

public Player(String n, int g)
{
	this.name=n;
	this.goals=g;
}

public String getName()
{
	return this.name;
}

public int getGoals()
{
	return this.goals;
}

public String toString()
{
	return "Player: " +this.name+", goals: "+this.getGoals();
}

}
