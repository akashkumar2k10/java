import java.util.Random;
import java.util.Scanner;;
public class Main {
	public static String[][] field = new String[10][10];
	public static String mgs;
	public static Scanner input = new Scanner(System.in);
	public static Random ran = new Random();
	public static String s = "";

	public static void main(String[] args) {


		System.out.println("***Welcome to Battle Ships game***");
		System.out.println(" ");
		mgs = "Right now, the sea is empty.";
		System.out.println(mgs);
		ocean();
		System.out.println(" ");
		System.out.println("Deploy your ships:");
		System.out.println(" ");

		for (int k = 1; k <= 5; k++) {
			System.out.print("enter the x for your " + k + " ships");
			int x = input.nextInt();
			System.out.print("enter the y for your " + k + " ships");
			int y = input.nextInt();
			field[x][y] = "filled";
		}
		ocean();
		System.out.println(" ");
		com();
		ocean();

		for (int v = 0; v < field.length; v++) {
			for (int h = 0; h < field[v].length; h++) {
				while (field[v][h] == "comship" || field[v][h] == "comship") {
					battle();
					ocean();
					combattle();
				}
			}
		}
		for (int v = 0; v < field.length; v++) {
			for (int h = 0; h < field[v].length; h++) {
				if (field[v][h] == "comship") {

					s = "computer win";
				} else {

					s = "you win";
				}
			}
		}
		System.out.println(" ");
		System.out.print(s);

	}

	public static void ocean() {


		System.out.println(" ");
		System.out.println(" " + " 0123456789 " + " ");


		for (int row = 0; row < field.length; row++) {
			System.out.print(row + "|");
			for (int col = 0; col < field[row].length; col++) {
				if (field[row][col] == "comship") {
					System.out.print("%");
				} else if (field[row][col] == "!") {
					System.out.print("!");
				} else if (field[row][col] == "x") {
					System.out.print("x");
				} else if (field[row][col] == null) {
					System.out.print(" ");
				} else {

					System.out.print("@");
				}


			}
			System.out.println("|" + row);

		}
		System.out.println(" " + " 0123456789 " + " ");
	}




	public static void com() {
		for (int i = 1; i < 6; i++) {
			int com_x = ran.nextInt(10);
			int com_y = ran.nextInt(10);
			if (field[com_x][com_y] == null) {
				field[com_x][com_y] = "comship";
				System.out.println(i+". Computer Ship has actives");}

			}

		}


	public static void battle(){
		System.out.println("Its, Your Turn");
		System.out.print("Enter the x of your ship");

				int battle_x = input.nextInt();
				System.out.print("Enter the y of your ship");
				int battle_y = input.nextInt();
				if (field[battle_x][battle_y] == "comship") {
					field[battle_x][battle_y] = "!";
					System.out.println("computer ship got fucked");
				} else {
					field[battle_x][battle_y] = "x";
					System.out.println("you missed");

				}

			}

	public static void combattle() {
		System.out.println("Its, Computer Turn");

		int battle_x = ran.nextInt(10);

		int battle_y = ran.nextInt(10);
		if (field[battle_x][battle_y] == "filled") {
			field[battle_x][battle_y] = "!";
			System.out.println("you lost one ship");
		} else {
			field[battle_x][battle_y] = "x";
			System.out.println("computer missed");

		}

	}


	}




