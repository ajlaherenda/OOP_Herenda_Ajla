package week10;

public class CivilService implements NationalService {
int daysLeft;

public CivilService()
{
this.daysLeft=362;
}
@Override
public int getDaysLeft() {
// TODO Auto-generated method stub
return this.daysLeft;
}
public void work()
{
if(this.daysLeft>0)
this.daysLeft--;
}

}


