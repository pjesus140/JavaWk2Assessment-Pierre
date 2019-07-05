package JavaWk2Assessment;

import java.util.Scanner;

public class Game {

	public void Start() {

		Swamp s = new Swamp();

		System.out.println("Grey foggy clouds float oppressively close to you, reflected in the murky grey"
				+ "water which reaches up your shins.\nSome black plants barely poke out of the shallow water. \nTry north,south,east,or west( OR n, s, e, w)."
				+ "\nYou notice a small compass-like device in your left hand.\nIt has hands like a watch, but the hands don't seem to tell time.");

		Scanner scan = new Scanner(System.in);
		String compass = "";
		while (s.theMap(compass) != "done") {

			System.out.println("choose a move");

			compass = scan.nextLine();

		}

		System.out.println("you have made it to the next point of interest");

		String res1 = s.event(0);

		if (res1.equals("pass")) {
			System.out.println("Your compass shakes");

			Swamp s1 = new Swamp();

			while (s1.theMap(compass) != "done") {

				System.out.println("choose a move");

				compass = scan.nextLine();

			}

			String res2 = s.event(1);

			if (res2.equals("pass")) {
				System.out.println("Your compass shakes harder than before");
				Swamp s2 = new Swamp();

				while (s2.theMap(compass) != "done") {

					System.out.println("choose a move");

					compass = scan.nextLine();

				}

				String res3 = s.event(2);

				if (res3.equals("pass")) {
					System.out.println("Gameover");

				} else
					System.out.println("you have Died\nGAME OVER!!");

			} else
				System.out.println("you have Died\nGAME OVER!!");

		} else
			System.out.println("you have Died\nGAME OVER!!");

	}

}
