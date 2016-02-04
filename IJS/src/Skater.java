import java.util.Scanner;
public class Skater
	{
		static Scanner userInput = new Scanner(System.in);
		static int level;
		static int numSkaters;
		static String names;
		static int element;
		static int rotation; 
		static int jump;
		static int spin;
		static int StepSequence;
			{
				AskSkaterLevel();
				AskSkaterName();
				AskForElements();
			}
			public static void AskSkaterLevel()
				{
					System.out.println("What Level are you skating at?");
					System.out.println("     (1)Intermediate");
					System.out.println("     (2)Novice");
					System.out.println("     (3)Junior");
					System.out.println("     (4)Senior");
					level = userInput.nextInt();
				}
			public static void AskForHowManySkaters()
				{
					System.out.println("How many Skaters are competing?");
					numSkaters = userInput.nextInt();
				}
			public static void AskSkaterName()
				{
					System.out.println("Dear Skater, what is your name?");
					names = userInput.nextLine();
					System.out.println(" ");
					System.out.println("Representing Mullen High School in Denver, Colorado " + names);
					System.out.println("Good luck!");
					System.out.println(" ");
					System.out.println("You are allowed 8 jumps, 3 spins, and 2 Step Sequences");
				}
			public static int AskForElements()
				{
					
					System.out.println("What are your elements?");
					System.out.println("You are allowed 8 jumps, 3 spins, and 2 Step Sequences");
					System.out.println(" ");
					System.out.println("(1)Jump, (2)Spin, or (3)step sequence?");
					element = userInput.nextInt();
					if (element==1)
						{
							System.out.println("(1) Single, (2) Double, (3) Triple, (4) Quad");
							rotation=userInput.nextInt();
							System.out.println("(1)Axel, (2)Toe Loop, (3)Salchow, (4)Loop, (5)Flip, (6)Lutz, (7)Combination");
							jump = userInput.nextInt();
							return jump;
						}
					else if (element==2)
						{
							System.out.println("(1)Combo Spin, (2)Flying sit, (3)flying camel, (4)Change foot sit, (5)Change foot camel");
							spin = userInput.nextInt();
							return spin;
						}
					else if(element==3)
						{
							System.out.println("(1)Step Sequence, (2)choreograph step sequence");
							StepSequence = userInput.nextInt();
							return StepSequence;
						}
					return element;
			}
}