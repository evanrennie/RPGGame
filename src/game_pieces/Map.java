package game_pieces;

public class Map 
{
	static Town[] townList = new Town[10];
	public Map()
	{
		
	}
	
	public void addTown(Town t)
	{
		int index = 0;
		while(townList[index] != null)
		{
			index++;
		}
		townList[index] = t;
	}
}
