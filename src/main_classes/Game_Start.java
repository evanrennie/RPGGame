package main_classes;

import game_pieces.Map;

import java.util.Scanner;

import user_character.*;
/*
 * This class is where it all happens
 * Stores all components necessary for our game
 */
public class Game_Start 
{
	static Scanner sc = new Scanner(System.in); //scanner for all user input
	static Hero hero; //main character of game
	static Map map = new Map();
	
	/*
	 * Game Starts from this main method
	 * Calls other methods to run as parts of the game
	 */
	public static void main(String[] args)
	{
		createMap();
		tellStory();
		
	}
	
	/*
	 * Start of the game
	 * Story is told and hero's name is set and hero is instantiated
	 */
	public static void tellStory()
	{
		System.out.println("What is your name foolish human?");
		String username = sc.nextLine();
	    hero = new Hero(username,20,20,10,5);
		System.out.println("Ok "+username+", Are you ready to embark on a journey like no other\n"
				+ "or are you going to wuss out? I am sure you are ready. Or you wouldn't be here right now.");
		System.out.println("Well this world is full of danger and fun. Go to Startsville.\n"
				+ "It's the first place to stop on your journey. Go on young fella.");
	}
	
	public static void createMap()
	{
		map.addTown();
	}
}
