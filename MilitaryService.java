package week10;

public class MilitaryService implements NationalService {
int daysLeft;
public MilitaryService(int d)
{
this.daysLeft=d;
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