package JavaWk2Assessment;

import java.util.Random;
import java.util.Scanner;

public class Swamp {

	Random r = new Random();

	int xaxis = r.nextInt(9) - 4;
	int yaxis = r.nextInt(9) - 4;

	int count = 0;
	
	
	public int  testNorth() {
	return xaxis;
	}

	public String theMap(String compass) {

		if (count == 0) {
			if (xaxis == 0) {
				xaxis = xaxis + 1;
			}
			;

			if (yaxis == 0) {
				yaxis = yaxis + 1;
			}
			;
		}
		count++;

		if (compass.equals("north")||compass.equals("n")) {
			yaxis = yaxis + 1;
			if (xaxis == 0 && yaxis == 0) {
				return "done";
			}

		} else if (compass.equals("south")||compass.equals("s")) {

			yaxis = yaxis - 1;
			if (xaxis == 0 && yaxis == 0) {
				return "done";
			}

		} else if (compass.equals("east")||compass.equals("e")) {
			xaxis = xaxis + 1;
			if (xaxis == 0 && yaxis == 0) {
				return "done";
			}

		} else if (compass.equals("west")||compass.equals("w")) {
			xaxis = xaxis - 1;
			if (xaxis == 0 && yaxis == 0) {
				return "done";
			}

		}

//		System.out.println("x-axis: " + xaxis + "y-axis: " + yaxis);
		double dist = Math.hypot(xaxis, yaxis);

		System.out.println("your compass shows " + dist + "m away from the next point of intrest");
		return "nope";

	}

	public String event(int e) {

		String sc2 = "";
		Scanner scan2 = new Scanner(System.in);

		if (e == 0) {

			System.out.println(
					"the ground is soft and you start to wounder if you are on wet sand when Suddenly, hands surface out the ground by your feet pulling you down.\n What do you do?"
							+ "\n1. Start swipeing the hands with your blade\n2. Offer a jewl for your life"
							+ "\n enter option 1 or 2");

			sc2 = scan2.nextLine();

			if (sc2.equals("1")) {

				System.out.println("you cut the hands clean off");
				return "pass";
			}
			if (sc2.equals("2")) {

				System.out.println("the hands don't care and pull you under");

				return "fail";

			} else if (!sc2.equals("1") && !sc2.equals("2") && !sc2.equals("")) {
				System.out.println("That was not an option, the hands don't care and pull you under");

			}

		}

		

		if (e == 1) {

			System.out.println(
					"the compass has taken you down deep into a cave. you or carring a flaming tourch as a light source"
							+ "\nyou can only hear small scittering which you persummed to be rats,\nsuddenly you start hearing a tremendous noise so loud you fear your ears will explode\n What do you do?"
							+ "\n1. go back out of the cave"
							+ "\n2. run further in cave");

			sc2 = scan2.nextLine();

			if (sc2.equals("1")) {

				System.out.println("you start running out as fast you can but being so distort you don't realise the path you took was now a pit of spikes, you fall");
				return "fail";
			}
			if (sc2.equals("2")) {

				System.out.println("you run further down in the cave, you can see a small light in the distance,\nthe noise starts to fade as you approch the light.you eventually reach the light source as the cave opens up to a huge oasis");

				return "pass";

			} else if (!sc2.equals("1") && !sc2.equals("2") && !sc2.equals("")) {
				System.out.println("That was not an option, your ears start bleeding, vision get faded");

			}

		}
		
		
		if (e == 2) {

			System.out.println(
					"you find a deep well in the middle of the dense oasis"
							+ "\nyou are starting to sweat,\nsuddenly you find yourself trapped in a 3m think ring of fire thats shinking in towrads you\n What do you do?"
							+ "\n1. try to jump out of the ring "
							+ "\n2. drop down the well");

			sc2 = scan2.nextLine();

			if (sc2.equals("1")) {

				System.out.println("as you jump over the fire intensfies burning you to a crips");
				return "fail";
			}
			if (sc2.equals("2")) {

				System.out.println("you start falling in the darkness, and falling, your compass is vibrating so much you lose its grip, but as soon as you do the compass explodes to a white flash.\nyou find yourself teleported home");

				return "pass";

			} else if (!sc2.equals("1") && !sc2.equals("2") && !sc2.equals("")) {
				System.out.println("That was not an option,the ring consumes you");

			}

		}

		return "fail";

	}

}
