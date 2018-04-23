/**
 * 
 */
package main;

import java.util.List;
import java.util.Random;

import character.Character;
import character.King;
import character.Knight;
import character.Queen;
import character.Troll;

import java.util.ArrayList;

/**
 * @author Burak Yazar
 *
 */
public class Main {

	private Character king;
	private Character queen;
	private List<Character> knights = new ArrayList<Character>();
	private List<Character> trolls = new ArrayList<Character>();
	/**
	 * App construct
	 */
	public Main(int maxKnigts, int maxTrolls) {
		//Create characters
		king = new King("Robert", 100.0f, 500.0f);
		queen = new Queen("Jaenille", 100.0f, 300.0f);
		Random rnd = new Random();
		for(int i=0; i<maxKnigts; i++){
			Character tmpKnight = new Knight("Knight-"+i, 100.0f, (float)(rnd.nextInt(450)+350));
			knights.add(tmpKnight);
		}
		for(int i=0; i<maxTrolls; i++){
			Character tmpTroll = new Troll("Troll-"+i, 200.0f, (float)(rnd.nextInt(250)+150));
			trolls.add(tmpTroll);
		}
	}

	/**
	 * App init point
	 * @param args
	 */
	public static void main(String[] args) {
		Main app = new Main(100, 150);
		System.out.println("Welcome to \"Medieval Fights\"\nThere will be blood!");

	}

}
