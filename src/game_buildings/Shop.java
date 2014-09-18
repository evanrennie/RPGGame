package game_buildings;
import non_player_character.ShopKeep;
import game_pieces.Building;
import game_pieces.Character;
import game_pieces.Item;

public class Shop extends Building
{
	Item[] storeInventory = new Item[20];
	int[] stockOfItems = new int[20];
	ShopKeep owner;
	
	public Shop(String n, Character[] c) 
	{
		super(n, c);
	}

}
