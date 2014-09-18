package item_list;
import game_pieces.Character;
import game_pieces.Item;

public class Potion extends Item 
{
	/*
	 * Constructor for Potion Item
	 */
	public Potion(String n) 
	{
		super(n);
	}

	/*
	 * A potion is a simple heal that heals for 20HP
	 */
	@Override
	protected void itemEffect(Character target) 
	{
		target.setHitPoints(target.getHitPoints()+20);
	}

}
