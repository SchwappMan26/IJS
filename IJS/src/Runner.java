public class Runner
	{	
		static int elements1=0;
		static double TotalScore=0;
		public static boolean skateContinues=true;
		public static void main(String[] args)
			{			
				Skater.AskSkaterName();
				Skater.AskSkaterLevel();
				while (skateContinues) 
					{
						Skater.AskForElements();
						System.out.println(" ");
						if (Skater.element==1)
							{
								Skater.jumps--;
							}
						else if (Skater.element==2)
							{
								Skater.spins--;
							}
						else if (Skater.element==3)
							{
								Skater.stepSequence--;
							}
						Elements.YourJumps();
						Elements.yourSpins();
						Elements.yourStepSequence();
						System.out.println("Elements: ");
						System.out.println(" ");
						Elements.printList();
						System.out.println(" ");
						elements1++;
						System.out.println("Number of total elements completed: "+elements1);
						if (elements1==Skater.elementNumber)
							{
								System.out.println();
								Elements.finalPrintList();
								ProgramComponents.totalPC();
								System.out.println();
								System.out.println("Your total Technical Element score is: "+Elements.Esum);
								System.out.println("Your total Program Component Score is: "+ProgramComponents.PCsum);
								System.out.println("Your total score is: "+(ProgramComponents.PCsum+Elements.Esum));
								System.out.println(Skater.names+ " is currently in 1st Place");
								skateContinues=false;
							}
					}	
			}
	}
