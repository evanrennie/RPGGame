package user_character;
import game_pieces.Character;
import game_pieces.Item;

public class Hero extends Character 
{
	int xp = 0;
	int lvlUp = 20;
	String[] spellBook = new String[4];
	Item[] bag = new Item[20];
	
	public Hero(String n, int hp, int mp, int sp, int p) 
	{
		super(n, hp, mp, sp, p);
		spellBook[0] = "FireFlame";
		spellBook[1] = "SmallHeal";
	}
	
}
