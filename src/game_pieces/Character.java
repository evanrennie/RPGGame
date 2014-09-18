package game_pieces;

public abstract class Character 
{
	protected String name; //Name of Character
	protected int hitPoints; //Character Hit Points
	protected int manaPool; //Size of Mana Pool
	protected int speed; //Character Speed Used for Turn Calculation
	protected int power; //Damage that Character's normal attack does
	protected String[] spellBook; //The four spells the Character can use
	
	/*
	 * Constructor for Character Class
	 */
	public Character(String n, int hp, int mp, int sp, int p)
	{
		name = n;
		hitPoints = hp;
		manaPool = mp;
		speed = sp;
		power = p;
	}
	
	/*
	 * Getters for the protected Values
	 */
	public String getName()
	{
		return name;
	}
	
	public int getHitPoints()
	{
		return hitPoints;
	}
	
	public int getManaPool()
	{
		return manaPool;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public int getPower()
	{
		return power;
	}
	
	/*
	 * Setters for instance fields
	 */
	public void setName(String n)
	{
		name = n;
	}
	
	public void setHitPoints(int hp)
	{
		hitPoints = hp;
	}
	
	public void setManaPool(int mp)
	{
		manaPool = mp;
	}
	
	public void setSpeed(int sp)
	{
		speed = sp;
	}
	
	public void setPower(int p)
	{
		power = p;
	}
	/*
	 * Methods that All Characters Share
	 */
	public void speak(String s)
	{
		System.out.println(s);
	}
	
	public void attack(Character target)
	{
		target.hitPoints -= this.power;
	}
}
