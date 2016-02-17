import java.util.Scanner;
public class Skater
	{
		static Scanner userInput = new Scanner(System.in);
		static Scanner userInput1=new Scanner(System.in);
		static int level;
		static double factor;
//		static int numSkaters;
		static String names;
		static int element;
		static int rotation; 
		static int jump;
		static int combination;
		static int spin;
		static int StepSequence;
		static String goe;
		static int elementNumber=0;
		static int jumps=0;
		static int spins=0;
		static int stepSequence=0;
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
					if (level==1)
						{
							elementNumber=9;
							jumps=6;
							spins=2;
							stepSequence=1;
							factor=2.0;
							System.out.println("You are allowed 6 jumps, 2 spins, and 1 step sequence");
						}
					else if (level==2)
						{
							elementNumber=11;
							jumps=7;
							spins=3;
							stepSequence=1;
							factor=2.0;
							System.out.println("You are allowed 7 jumps, 3 spins, and 1 step sequence");
						}
					else if (level==3)
						{
							elementNumber=12;
							jumps=8;
							spins=3;
							stepSequence=1;
							factor=2.0;
							System.out.println("You are allowed 8 jumps, 3 spins, and 1 step sequence");
						}
					else
						{
							elementNumber=13;
							jumps=8;
							spins=3;
							stepSequence=2;
							factor=2.0;
							System.out.println("You are allowed 8 jumps, 3 spins, and 2 Step Sequences");
						}
				}
//			public static void AskForHowManySkaters()
//				{
//					System.out.println("How many Skaters are competing?");
//					numSkaters = userInput.nextInt();
//				}
			public static void AskSkaterName()
				{
					System.out.println("Dear Skater, what is your name?");
					names = userInput.nextLine();
					System.out.println(" ");
					System.out.println("Representing Mullen High School in Denver Colorado " + names);
					System.out.println("Good luck!");
					System.out.println(" ");
				}
			public static void AskForElements()
				{
					
					System.out.println("What are your elements?");
					System.out.println("You are allowed "+jumps+ " jumps, "+spins+" spins, and "+stepSequence+" Step Sequences");
					System.out.println(" ");
					System.out.println("(1)Jump, (2)Spin, or (3)step sequence?");
					element = userInput.nextInt();
					if (element==1)
						{
							System.out.println("(1) Single, (2) Double, (3) Triple, (4) Quad");
							rotation=userInput.nextInt();
							System.out.println("(1)Toe Loop, (2)Salchow, (3)Loop, (4)Flip, (5)Lutz, (6)Axel");
							jump = userInput.nextInt();
							System.out.println("What is the Grade of Execution (GOE)?");
							System.out.println("(-3), (-2), (-1), (0), (+1), (+2), (+3)");
							goe = userInput1.nextLine();
						}
					else if (element==2)
						{
							System.out.println("(1)Combo Spin, (2)Flying sit, (3)flying camel, (4)Change foot sit, (5)Change foot camel");
							spin = userInput.nextInt();
							System.out.println("What is the Grade of Execution (GOE)?");
							System.out.println("(-3), (-2), (-1), (0), (+1), (+2), (+3)");
							goe=userInput1.nextLine();
							
						}
					else if(element==3)
						{
							System.out.println("(1)Step Sequence, (2)choreograph step sequence");
							StepSequence = userInput.nextInt();
							System.out.println("What is the Grade of Execution (GOE)?");
							System.out.println("(-3), (-2), (-1), (0), (+1), (+2), (+3)");
							goe=userInput1.nextLine();
							
						}
					
					
			}
}