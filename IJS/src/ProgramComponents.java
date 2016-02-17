import java.util.Scanner;

public class ProgramComponents
	{
		static Scanner userInput2=new Scanner(System.in);
		static double SkatingSkills;
		static double Transitions;
		static double PerformanceExecution;
		static double Choreography;
		static double Interpretation;
		static double PCsum=0;
		public static void totalPC()
			{
				System.out.println("The second part of a score is Program Components composed of 5 parts");
				System.out.println("Skating Skils, Transitions, Performance/ Execution, ");
				System.out.println("Choreography, and Interpretation");
				System.out.println();
				System.out.println("For Each part you are to judge it on a scale of 1.00-10.00");
				System.out.println("What is the score for the Skating Skills: ");
				SkatingSkills=userInput2.nextDouble();
				System.out.println("What is the score for the Transitions: ");
				Transitions=userInput2.nextDouble();
				System.out.println("What is the score for the Performance/ Execution: ");
				PerformanceExecution=userInput2.nextDouble();
				System.out.println("What is the score for the Choreography: ");
				Choreography=userInput2.nextDouble();
				System.out.println("What is the score for the Interpretation: ");
				Interpretation=userInput2.nextDouble();
				PCsum = TotalingPC(SkatingSkills, Transitions, PerformanceExecution, Choreography, Interpretation);	
			}
		public static double TotalingPC(double SS, double T, double PE, double C, double I)
			{
				SS=SkatingSkills;
				T=Transitions;
				PE=PerformanceExecution;
				C=Choreography;
				I=Interpretation;
				
				PCsum=(SS+T+PE+C+I)*Skater.factor;
				
				return PCsum;
				
			}
	}
