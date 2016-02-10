public class Runner
	{	
		static int elements1=0;
		public static boolean skateContinues=true;
		public static void main(String[] args)
			{			
				Skater.AskSkaterName();
				Skater.AskSkaterLevel();
				while (skateContinues) 
					{
						System.out.println(" ");
						Skater.AskForElements();
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
								System.out.println(Skater.names+ " is currently in 1st Place");
								skateContinues=false;
							}
					}	
			}
	}
