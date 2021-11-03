package week5;

public class week5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//task1/task3/task4/task5
		Team t=new Team("FC Barcelona");
		System.out.println("Team "+t.getName()); 
		
//task2/task3/task4/task5
		Player p1=new Player("Brian");
		Player p2=new Player("Pekka",39);
	//	System.out.println(p1);
	//	System.out.println(p2);
        t.addPlayer(p1);
        t.addPlayer(p2);
        t.addPlayer(new Player("Mikael",1));
        t.printPlayers();
        System.out.println("The number of players in the team "+t.getName()+" is "+t.getSize());
        System.out.println("The total number of goals is "+t.goals());
		
	}

}
