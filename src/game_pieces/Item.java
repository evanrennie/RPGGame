package game_pieces;

public abstract class Item 
{
	String name;
	
	public Item(String n)
	{
		name = n;
	}
	
	protected abstract void itemEffect(Character target);
}
