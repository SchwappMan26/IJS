import java.util.ArrayList;
public class Elements
	{
		static double Esum=0;
		static ArrayList<Elements>yourRoutine=new ArrayList<Elements>();
		private String element;
		private double value;	
		public Elements(String e, double v)
			{
				element=e;
				value=v;
			}
		public static void YourJumps()
			{			
				if (Skater.rotation==1)
					{	
						if(Skater.jump==1)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("1Toe Loop", 0.1));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("1Toe Loop", 0.2));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("1Toe Loop", 0.3));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("1Toe Loop", 0.4));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("1Toe Loop", 0.6));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("1Toe Loop", 0.8));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("1Toe Loop", 1.0));
									}
								else
									{
										System.out.println("Invalid Command please enter a valid GOE");
										System.exit(0);
									}
							}
						else if(Skater.jump==2)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("1Salchow", 0.1));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("1Salchow", 0.2));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("1Salchow", 0.3));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("1Salchow", 0.4));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("1Salchow", 0.6));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("1Salchow", 0.8));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("1Salchow", 1.0));
									}
							}
						else if(Skater.jump==3)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("1Loop", 0.2));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("1Loop", 0.3));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("1Loop", 0.4));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("1Loop", 0.5));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("1Loop", 0.7));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("1Loop", 0.9));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("1Loop", 1.1));
									}
							}
						else if(Skater.jump==4)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("1Flip", 0.2));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("1Flip", 0.3));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("1Flip", 0.4));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("1Flip", 0.5));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("1Flip", 0.7));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("1Flip", 0.9));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("1Flip", 1.1));
									}
							}
						else if(Skater.jump==5)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("1Lutz", 0.3));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("1Lutz", 0.4));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("1Lutz", 0.5));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("1Lutz", 0.6));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("1Lutz", 0.8));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("1Lutz", 1.0));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("1Lutz", 1.2));
									}
							}	
						else if(Skater.jump==6)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("1Axel", 0.5));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("1Axel", 0.7));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("1Axel", 0.9));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("1Axel", 1.1));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("1Axel", 1.3));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("1Axel", 1.5));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("1Axel", 1.7));
									}
							}
					}
				else if(Skater.rotation==2)
					{
						if(Skater.jump==1)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("2Toe Loop", 0.7));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("2Toe Loop", 0.9));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("2Toe Loop", 1.1));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("2Toe Loop", 1.3));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("2Toe Loop", 1.5));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("2Toe Loop", 1.7));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("2Toe Loop", 1.9));
									}
							}
						else if(Skater.jump==2)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("2Salchow", 0.7));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("2Salchow", 0.9));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("2Salchow", 1.1));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("2Salchow", 1.3));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("2Salchow", 1.5));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("2Salchow", 1.7));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("2Salchow", 1.9));
									}
							}
						else if(Skater.jump==3)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("2Loop", 0.9));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("2Loop", 1.2));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("2Loop", 1.5));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("2Loop", 1.8));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("2Loop", 2.1));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("2Loop", 2.4));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("2Loop", 2.7));
									}
							}
						else if(Skater.jump==4)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("2Flip", 1.0));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("2Flip", 1.3));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("2Flip", 1.6));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("2Flip", 1.9));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("2Flip", 2.2));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("2Flip", 2.5));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("2Flip", 2.8));
									}
							}
						else if(Skater.jump==5)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("2Lutz", 1.2));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("2Lutz", 1.5));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("2Lutz", 1.8));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("2Lutz", 2.1));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("2Lutz", 2.4));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("2Lutz", 2.7));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("2Lutz", 3.0));
									}
							}
						else if(Skater.jump==6)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("2Axel", 1.8));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("2Axel", 2.3));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("2Axel", 2.8));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("2Axel", 3.3));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("2Axel", 3.8));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("2Axel", 4.3));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("2Axel", 4.8));
									}
							}
					}
				else if(Skater.rotation==3)
					{
						if(Skater.jump==1)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("3Toe Loop", 2.2));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("3Toe Loop", 2.9));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("3Toe Loop", 3.6));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("3Toe Loop", 4.3));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("3Toe Loop", 5.0));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("3Toe Loop", 5.7));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("3Toe Loop", 6.4));
									}
							}
						else if(Skater.jump==2)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("3Salchow", 2.3));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("3Salchow", 3.0));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("3Salchow", 3.7));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("3Salchow", 4.4));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("3Salchow", 5.1));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("3Salchow", 5.8));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("3Salchow", 6.5));
									}
							}
						else if(Skater.jump==3)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("3Loop", 3.0));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("3Loop", 3.7));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("3Loop", 4.4));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("3Loop", 5.1));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("3Loop", 5.8));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("3Loop", 6.5));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("3Loop", 7.2));
									}
							}
						else if(Skater.jump==4)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("3Flip", 3.2));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("3Flip", 3.9));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("3Flip", 4.6));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("3Flip", 5.3));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("3Flip", 6.0));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("3Flip", 6.7));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("3Flip", 7.4));
									}
							}
						else if(Skater.jump==5)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("3Lutz", 3.9));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("3Lutz", 4.6));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("3Lutz", 5.3));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("3Lutz", 6.0));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("3Lutz", 6.7));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("3Lutz", 7.4));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("3Lutz", 8.1));
									}
							}
						else if(Skater.jump==6)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("3Axel", 5.5));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("3Axel", 6.5));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("3Axel", 7.5));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("3Axel", 8.5));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("3Axel", 9.5));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("3Axel", 10.5));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("3Axel", 11.5));
									}
							}
					}
				else if(Skater.rotation==4)
					{		
						if(Skater.jump==1)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("4Toe Loop", 6.3));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("4Toe Loop", 7.9));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("4Toe Loop", 9.1));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("4Toe Loop", 10.3));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("4Toe Loop", 11.3));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("4Toe Loop", 12.2));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("4Toe Loop", 13.3));
									}
							}
						else if(Skater.jump==2)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("4Salchow", 6.5));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("4Salchow", 8.1));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("4Salchow", 9.3));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("4Salchow", 10.5));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("4Salchow", 11.5));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("4Salchow", 12.5));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("4Salchow", 13.5));
									}
							}
						else if(Skater.jump==3)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("4Loop", 8.0));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("4Loop", 9.6));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("4Loop", 10.8));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("4Loop", 12.0));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("4Loop", 13.0));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("4Loop", 14.0));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("4Loop", 15.0));
									}
							}
						else if(Skater.jump==4)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("4Flip", 8.3));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("4Flip", 9.9));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("4Flip", 11.1));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("4Flip", 12.3));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("4Flip", 13.3));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("4Flip", 14.3));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("4Flip", 15.3));
									}
							}
						else if(Skater.jump==5)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("4Lutz", 9.6));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("4Lutz", 11.2));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("4Lutz", 12.4));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("4Lutz", 13.6));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("4Lutz", 14.6));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("4Lutz", 15.6));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("4Lutz", 16.6));
									}
							}
						else if(Skater.jump==6)
							{
								if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
									{
										yourRoutine.add(new Elements("4Axel", 11.0));
									}
								else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
									{
										yourRoutine.add(new Elements("4Axel", 12.6));
									}
								else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
									{
										yourRoutine.add(new Elements("4Axel", 13.8));
									}
								else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
									{
										yourRoutine.add(new Elements("4Axel", 15.0));
									}
								else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
									{
										yourRoutine.add(new Elements("4Axel", 16.2));
									}
								else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
									{
										yourRoutine.add(new Elements("4Axel", 17.4));
									}
								else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
									{
										yourRoutine.add(new Elements("4Axel", 18.6));
									}
							}
					}
			}
		public static void yourSpins()
			{	
				if (Skater.spin==1)
					{
						if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
							{
								yourRoutine.add(new Elements("Combination Spin", 2.6));
							}
						else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
							{
								yourRoutine.add(new Elements("Combination Spin", 2.9));
							}
						else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
							{
								yourRoutine.add(new Elements("Combination Spin", 3.2));
							}
						else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
							{
								yourRoutine.add(new Elements("Combination Spin", 3.5));
							}
						else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
							{
								yourRoutine.add(new Elements("Combination Spin", 4.0));
							}
						else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
							{
								yourRoutine.add(new Elements("Combination Spin", 4.5));
							}
						else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
							{
								yourRoutine.add(new Elements("Combination Spin", 5.0));
							}
					}
				else if (Skater.spin==2)
					{
						if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
							{
								yourRoutine.add(new Elements("Flying Sit", 2.1));
							}
						else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
							{
								yourRoutine.add(new Elements("Flying Sit", 2.4));
							}
						else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
							{
								yourRoutine.add(new Elements("Flying Sit", 2.7));
							}
						else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
							{
								yourRoutine.add(new Elements("Flying Sit", 3.0));
							}
						else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
							{
								yourRoutine.add(new Elements("Flying Sit", 3.5));
							}
						else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
							{
								yourRoutine.add(new Elements("Flying Sit", 4.0));
							}
						else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
							{
								yourRoutine.add(new Elements("Flying Sit", 4.5));
							}
					}
				else if (Skater.spin==3)
					{
						if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
							{
								yourRoutine.add(new Elements("Flying Camel", 2.3));
							}
						else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
							{
								yourRoutine.add(new Elements("Flying Camel", 2.6));
							}
						else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
							{
								yourRoutine.add(new Elements("Flying Camel", 2.9));
							}
						else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
							{
								yourRoutine.add(new Elements("Flying Camel", 3.2));
							}
						else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
							{
								yourRoutine.add(new Elements("Flying Camel", 3.7));
							}
						else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
							{
								yourRoutine.add(new Elements("Flying Camel", 4.2));
							}
						else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
							{
								yourRoutine.add(new Elements("Flying Camel", 4.7));
							}
					}
				else if (Skater.spin==4)
					{
						if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
							{
								yourRoutine.add(new Elements("Change foot Sit", 2.1));
							}
						else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
							{
								yourRoutine.add(new Elements("Change foot Sit", 2.4));
							}
						else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
							{
								yourRoutine.add(new Elements("Change foot Sit", 2.7));
							}
						else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
							{
								yourRoutine.add(new Elements("Change foot Sit", 3.0));
							}
						else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
							{
								yourRoutine.add(new Elements("Change foot Sit", 3.5));
							}
						else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
							{
								yourRoutine.add(new Elements("Change foot Sit", 4.0));
							}
						else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
							{
								yourRoutine.add(new Elements("Change foot Sit", 4.5));
							}
					}
				else if (Skater.spin==5)
					{
						if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
							{
								yourRoutine.add(new Elements("Change foot Camel", 2.3));
							}
						else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
							{
								yourRoutine.add(new Elements("Change foot Camel", 2.6));
							}
						else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
							{
								yourRoutine.add(new Elements("Change foot Camel", 2.9));
							}
						else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
							{
								yourRoutine.add(new Elements("Change foot Camel", 3.2));
							}
						else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
							{
								yourRoutine.add(new Elements("Change foot Camel", 3.7));
							}
						else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
							{
								yourRoutine.add(new Elements("Change foot Camel", 4.2));
							}
						else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
							{
								yourRoutine.add(new Elements("Change foot Camel", 4.7));
							}
					}
			}
		public static void yourStepSequence()
			{
				if (Skater.StepSequence==1)
					{
						if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
							{
								yourRoutine.add(new Elements("Step Sequence", 2.8));
							}
						else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
							{
								yourRoutine.add(new Elements("Step Sequence", 2.5));
							}
						else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
							{
								yourRoutine.add(new Elements("Step Sequence", 3.2));
							}
						else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
							{
								yourRoutine.add(new Elements("Step Sequence", 3.9));
							}
						else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
							{
								yourRoutine.add(new Elements("Step Sequence", 4.6));
							}
						else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
							{
								yourRoutine.add(new Elements("Step Sequence", 5.3));
							}
						else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
							{
								yourRoutine.add(new Elements("Step Sequence", 6.0));
							}
					}
				else if (Skater.StepSequence==2)
					{
						if(Skater.goe.equals("-3")||Skater.goe.equals(" -3")||Skater.goe.equals("-3 ")||Skater.goe.equals(" -3 "))
							{
								yourRoutine.add(new Elements("Cheorgraphy Step Sequence", 0.5));
							}
						else if(Skater.goe.equals("-2")||Skater.goe.equals(" -2")||Skater.goe.equals("-2 ")||Skater.goe.equals(" -2 "))
							{
								yourRoutine.add(new Elements("Cheorgraphy Step Sequence", 1.0));
							}
						else if(Skater.goe.equals("-1")||Skater.goe.equals(" -1")||Skater.goe.equals("-1 ")||Skater.goe.equals(" -1 "))
							{
								yourRoutine.add(new Elements("Cheorgraphy Step Sequence", 1.5));
							}
						else if(Skater.goe.equals("0")||Skater.goe.equals(" 0")||Skater.goe.equals("0 ")||Skater.goe.equals(" 0 "))
							{
								yourRoutine.add(new Elements("Cheorgraphy Step Sequence", 2.0));
							}
						else if(Skater.goe.equals("+1")||Skater.goe.equals(" +1")||Skater.goe.equals("+1 ")||Skater.goe.equals(" +1 "))
							{
								yourRoutine.add(new Elements("Cheorgraphy Step Sequence", 2.7));
							}
						else if(Skater.goe.equals("+2")||Skater.goe.equals(" +2")||Skater.goe.equals("+2 ")||Skater.goe.equals(" +2 "))
							{
								yourRoutine.add(new Elements("Cheorgraphy Step Sequence", 3.4));
							}
						else if(Skater.goe.equals("+3")||Skater.goe.equals(" +3")||Skater.goe.equals("+3 ")||Skater.goe.equals(" +3 "))
							{
								yourRoutine.add(new Elements("Cheorgraphy Step Sequence", 4.1));
							}
					}	
			}
			
		public static void printList()
		  	{
		  		for (Elements e : yourRoutine)
		  			{
		  				System.out.println(e.getElement()+"     "+e.getValue());
		 			}
		  	}
		 public static void finalPrintList()
		  	{				
		 		for (int i=0; i<yourRoutine.size(); i++)
		 			{
		  				Esum+=yourRoutine.get(i).getValue();
		  			}
		  	}
		public static double getSum()
			{
				return Esum;
			}
		public static void setSum(double sum)
			{
				Elements.Esum = sum;
			} 
		public static ArrayList<Elements> getYourRoutine()
			{
				return yourRoutine;
			}
		public static void setYourRoutine(ArrayList<Elements> yourRoutine)
			{
				Elements.yourRoutine = yourRoutine;
			}
		public String getElement()
			{
				return element;
			}
		public void setElement(String element)
			{
				this.element = element;
			}
		public double getValue()
			{
				return value;
			}
		public void setValue(double value)
			{
				this.value = value;
			}
	}			