/**
 * Unit 1 Project
 *  
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void wordMarvel() {
		System.out.println("|    ___     ___       ___         _______    __       __    ________   __        |");
		System.out.println("|   |   \\   /   |     / _ \\      | _____  \\   \\ \\     / /   | ______|   | |       |");
		System.out.println("|   | |\\ \\ / /| |    / /_\\ \\     | |____|  |   \\ \\   / /    | |_____    | |       |");
		System.out.println("|   | | \\ V / | |   / _____ \\    |  ___   /     \\ \\ / /     |  _____|   | |       |");
		System.out.println("|   | |  \\ /  | |  / /     \\ \\   | |   \\ \\       \\ V /      | |_____    | |___    |");
		System.out.println("|   |_|   V   |_| /_/       \\_\\  |_|    \\_\\       \\_/       |_______|   |______|  |");
	} /**marvel word static method
	*/
	public static void horizontalLine() {
		System.out.println("_________________________________________________________________________________");
	}
	public static void captainAmerica () {
		System.out.println("\t\t\t\t ***************");
		System.out.println("\t\t\t\t*   **********   *");
		System.out.println("\t\t\t       *  *  ********  *  *");
		System.out.println("\t\t\t      *  *  *  _/\\_  *  *  *");
		System.out.println("\t\t\t      *  * *   >  <   * *  *");
		System.out.println("\t\t\t      *  *  *   \\/   *  *  *");
		System.out.println("\t\t\t       *  *  ********  *  *");
		System.out.println("\t\t\t\t*   **********   *");
		System.out.println("\t\t\t\t ***************");
	}
	//Captain America's shield
	public static void speech() {
		System.out.println("\t\t\t        ____________________");
		System.out.println("\t\t\t       | Avengers Assemble! |");
		System.out.println("\t\t\t       |______________   ___|");
		System.out.println("\t\t\t                       \\|");
	}
	//Captain America's famous quote

	public static void space() {
		System.out.println("                         ");
	}
	/** This is my ASCII project of the
	  Marvel franchise logo! */
	public static void main(String [] args) {
		horizontalLine(); wordMarvel(); 
		System.out.print("|"); horizontalLine();
		space();
		speech();
		space();
		captainAmerica();
		space();
		

		
	}
}