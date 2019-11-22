//Jazmin Bueno
//Section CS 21 73828
//The purpose of this program is to draw a rocket utilizing a combination of print and println statements.
//Minimized use of redundancy by using loops to print certain constructs.
public class DrawRocket {
	public static final int SIZE = 7; //Created a class constant called SIZE to change height of rocket from 3 to 7.
	
	public static void main(String[] args) {
		Cone(); //Top Cone 
		StarDivider(); //1st Star Divider beneath top cone 
		TopHalf();//Top Half of Diamond Pattern 
		BottomHalf();//Bottom Half of Diamond Pattern
		StarDivider();//Star Divider beneath Diamond Pattern
		BottomHalf();//Bottom half taken from Diamond Pattern to create Hourglass Pattern
		TopHalf();//Top half taken from Diamond pattern to create Hourglass Pattern
		StarDivider();//2nd Star Divider beneath Hourglass Pattern
		Cone();//Same pattern from Top Cone to be placed beneath divider as the last portion of the rocket
	}
	
	public static void Cone() {
		for (int line = 1; line <= (SIZE * 2 - 1); line++)
		{
			System.out.print(" ");
			for (int spaces = 1; spaces <= (SIZE * 2 - 1) - line; spaces++){
				System.out.print(" ");
			}
			for (int slashes = 1; slashes <= line; slashes++) {
				System.out.print("/");
			}
			System.out.print("**");//two stars in middle going down a line;
			for (int slashes = 1; slashes <= line; slashes++)
			{
				System.out.print("\\");
			}
			System.out.println(" ");
		}
	}
	
	public static void StarDivider() {
		System.out.print("+"); //to print + once 
		for (int i = 1; i <= SIZE * 2; i++) {
			System.out.print("=*");
		}
		System.out.println("+"); //to print + at end of pattern
	}
	
	public static void TopHalf() {
		for (int line = 1; line <= SIZE; line++) {
			System.out.print("|");//to print at beginning of top half
			for (int repeat = 1; repeat <= 2; repeat++) {
				for (int dots = 1; dots <= SIZE - line; dots++) {
					System.out.print(".");
				}
				for (int points = 1; points <= line; points++) {
					System.out.print("/\\");
				}
				for (int dots = 1; dots <= SIZE - line; dots++) {
					System.out.print(".");
				}
			}
			System.out.println("|");
		}
	}
	
	public static void BottomHalf() {
		for (int line = SIZE; line >= 1; line--) {
			System.out.print("|");
			for (int repeat = 1; repeat <= 2; repeat++) {
				for (int dots = 1; dots <= SIZE - line; dots++) {
					System.out.print(".");
				}
				for (int points = 1; points <= line; points++) {
					System.out.print("\\/");
				}
				for (int dots = 1; dots <= SIZE - line; dots++) {
					System.out.print(".");
				}
			}
			System.out.println("|");
		}
	}
}