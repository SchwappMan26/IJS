import java.util.ArrayList;
public class Elements
	{
		static double sum=0;
		static ArrayList<Elements>yourRoutine=new ArrayList<Elements>();
		private String element;
		private double value;
		private double minusThree;
		private double minusTwo;
		private double minusOne;
		private double plusOne;
		private double plusTwo;
		private double plusThree;		
		public Elements(String e, double m3, double m2, double m1, double v, double p1, double p2, double p3)
			{
				element=e;
				minusThree=m3;
				minusTwo=m2;
				minusOne=m1;
				value=v;
				plusOne=p1;
				plusTwo=p2;
				plusThree=p3;		
			}
		public static void YourJumps()
			{			
				if (Skater.rotation==1)
					{	
						if(Skater.jump==1)
							{
								yourRoutine.add(new Elements("1Toe Loop", 0.1, 0.2, 0.3, 0.4, 0.6, 0.8, 1.0));
							}
						else if(Skater.jump==2)
							{
								yourRoutine.add(new Elements("1Salchow", 0.1, 0.2, 0.3, 0.4, 0.6, 0.8, 1.0));
							}
						else if(Skater.jump==3)
							{
								yourRoutine.add(new Elements("1Loop", 0.2, 0.3, 0.4, 0.5, 0.7, 0.9, 1.1));
							}
						else if(Skater.jump==4)
							{
								yourRoutine.add(new Elements("1Flip", 0.2, 0.3, 0.4, 0.5, 0.7, 0.9, 1.1));
							}
						else if(Skater.jump==5)
							{
								yourRoutine.add(new Elements("1Lutz", 0.3, 0.4, 0.5, 0.6, 0.8, 1.0, 1.2));
							}
						else if(Skater.jump==6)
							{
								yourRoutine.add(new Elements ("1Axel", 0.5, 0.7, 0.9, 1.1, 1.3, 1.5, 1.7));
							}
					}
				else if(Skater.rotation==2)
					{
						if(Skater.jump==1)
							{
								yourRoutine.add(new Elements("2Toe Loop", 0.7, 0.9, 1.1, 1.3, 1.5, 1.7, 1.9));
							}
						else if(Skater.jump==2)
							{
								yourRoutine.add(new Elements("2Salchow", 0.7, 0.9, 1.1, 1.3, 1.5, 1.7, 1.9));
							}
						else if(Skater.jump==3)
							{
								yourRoutine.add(new Elements("2Loop", 0.9, 1.2, 1.5, 1.8, 2.1, 2.4, 2.7));
							}
						else if(Skater.jump==4)
							{
								yourRoutine.add(new Elements("2Flip", 1.0, 1.3, 1.6, 1.9, 2.2, 2.5, 2.8));
							}
						else if(Skater.jump==5)
							{
								yourRoutine.add(new Elements("2Lutz", 1.2, 1.5, 1.8, 2.1, 2.4, 2.7, 3.0));
							}
						else if(Skater.jump==6)
							{
								yourRoutine.add(new Elements ("2Axel", 1.8, 2.3, 2.8, 3.3, 3.8, 4.3, 4.8));
							}
					}
				else if(Skater.rotation==3)
					{
						if(Skater.jump==1)
							{
								yourRoutine.add(new Elements("3Toe Loop", 2.2, 2.9, 3.6, 4.3, 5.0, 5.7, 6.4));
							}
						else if(Skater.jump==2)
							{
								yourRoutine.add(new Elements("3Salchow", 2.3, 3.0, 3.7, 4.4, 5.1, 5.8, 6.5));
							}
						else if(Skater.jump==3)
							{
								yourRoutine.add(new Elements("3Loop",3.0, 3.7, 4.4, 5.1, 5.8, 6.5, 7.2));
							}
						else if(Skater.jump==4)
							{
								yourRoutine.add(new Elements("3Flip", 3.2, 3.9, 4.6, 5.3, 6.0, 6.7, 7.4));
							}
						else if(Skater.jump==5)
							{
								yourRoutine.add(new Elements("3Lutz", 3.9, 4.6, 5.3, 6.0, 6.7, 7.4, 8.1));
							}
						else if(Skater.jump==6)
							{
								yourRoutine.add(new Elements ("3Axel", 5.5, 6.5, 7.5, 8.5, 9.5, 10.5, 11.5));
							}
					}
				else if(Skater.rotation==4)
					{		
						if(Skater.jump==1)
							{
								yourRoutine.add(new Elements("4Toe Loop", 6.3, 7.9, 9.1, 10.3, 11.3, 12.3, 13.3));
							}
						else if(Skater.jump==2)
							{
								yourRoutine.add(new Elements("4Salchow", 6.5, 8.1, 9.3, 10.5, 11.5, 12.5, 13.5));
							}
						else if(Skater.jump==3)
							{
								yourRoutine.add(new Elements("4Loop", 8.0, 9.6, 10.8, 12.0, 13.0, 14.0, 15.0));
							}
						else if(Skater.jump==4)
							{
								yourRoutine.add(new Elements("4Flip", 8.3, 9.9, 11.1, 12.3, 13.3, 14.3, 15.3));
							}
						else if(Skater.jump==5)
							{
								yourRoutine.add(new Elements("4Lutz", 9.6, 11.2, 12.4, 13.6, 14.6, 15.6, 16.6));
							}
						else if(Skater.jump==6)
							{
								yourRoutine.add(new Elements ("4Axel", 11.0, 12.6, 13.8, 15.0, 16.2, 17.4, 18.6));
							}
					}
			}
		public static void yourSpins()
			{	
				if (Skater.spin==1)
					{
						yourRoutine.add(new Elements ("Combination Spin", 2.6, 2.9, 3.2, 3.5, 4.0, 4.5, 5.0));
					}
				else if (Skater.spin==2)
					{
						yourRoutine.add(new Elements ("Flying Sit", 2.1, 2.4, 2.7, 3.0, 3.5, 4.0, 4.5));
					}
				else if (Skater.spin==3)
					{
						yourRoutine.add(new Elements ("Flying Camel", 2.3, 2.6, 2.9, 3.2, 3.7, 4.2, 4.7));
					}
				else if (Skater.spin==4)
					{
						yourRoutine.add(new Elements ("Change foot Sit", 2.1, 2.4, 2.7, 3.0, 3.5, 4.0, 4.5));
					}
				else if (Skater.spin==5)
					{
						yourRoutine.add(new Elements ("Change foot Camel", 2.3, 2.6, 2.9, 3.2, 3.7, 4.2, 4.7));
					}
			}
		public static void yourStepSequence()
			{
				if (Skater.StepSequence==1)
					{
						yourRoutine.add(new Elements ("Step Sequence", 2.8, 2.5, 3.2, 3.9, 4.6, 5.3, 6.0));
					}
				else if (Skater.StepSequence==2)
					{
						yourRoutine.add(new Elements ("Cheorgraphy Step Sequence", 0.5, 1.0, 1.5, 2.0, 2.7, 3.4, 4.1));
					}	
			}
			public static void printList()
				{
					for (Elements e : yourRoutine)
						{
							if(Skater.goe=="-3"||Skater.goe==" -3"||Skater.goe=="-3 "||Skater.goe==" -3 ")
								{
									System.out.println(e.getElement()+" "+e.getValue()+" GOE: "+e.getMinusThree());
									sum+=e.getMinusThree();
								}
							else if(Skater.goe=="-2"||Skater.goe==" -2"||Skater.goe=="-2 "||Skater.goe==" -2 ")
								{
									System.out.println(e.getElement()+" "+e.getValue()+" GOE: "+e.getMinusTwo());
									sum+=e.getMinusTwo();
								}
							else if(Skater.goe=="-1"||Skater.goe==" -1"||Skater.goe=="-1 "||Skater.goe==" -1 ")
								{
									System.out.println(e.getElement()+" "+e.getValue()+" GOE: "+e.getMinusOne());
									sum+=e.getMinusOne();
								}
							else if(Skater.goe=="0"||Skater.goe==" 0"||Skater.goe=="0 "||Skater.goe==" 0 ")
								{
									System.out.println(e.getElement()+" "+e.getValue()+" GOE: "+e.getValue());
									sum+=e.getValue();
								}
							else if(Skater.goe=="+1"||Skater.goe==" +1"||Skater.goe=="+1 "||Skater.goe==" +1 ")
								{
									System.out.println(e.getElement()+" "+e.getValue()+" GOE: "+e.getPlusOne());
									sum+=e.getPlusOne();
								}
							else if(Skater.goe=="+2"||Skater.goe==" +2"||Skater.goe=="+2 "||Skater.goe==" +2 ")
								{
									System.out.println(e.getElement()+" "+e.getValue()+" GOE: "+e.getPlusTwo());
									sum+=e.getPlusOne();
								}
							else if(Skater.goe=="+3"||Skater.goe==" +3"||Skater.goe=="+3 "||Skater.goe==" +3 ")
								{
									System.out.println(e.getElement()+" "+e.getValue()+" GOE: "+e.getPlusThree());
									sum+=e.getPlusThree();
								}
						}
				}
			public static void finalPrintList()
				{				
					System.out.println("Your Total technical score is: "+sum);
				}
			public static double getSum()
				{
					return sum;
				}
			public static void setSum(double sum)
				{
					Elements.sum = sum;
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
			public double getMinusThree()
				{
					return minusThree;
				}
			public void setMinusThree(double minusThree)
				{
					this.minusThree = minusThree;
				}
			public double getMinusTwo()
				{
					return minusTwo;
				}
			public void setMinusTwo(double minusTwo)
				{
					this.minusTwo = minusTwo;
				}
			public double getMinusOne()
				{
					return minusOne;
				}
			public void setMinusOne(double minusOne)
				{
					this.minusOne = minusOne;
				}
			public double getPlusOne()
				{
					return plusOne;
				}
			public void setPlusOne(double plusOne)
				{
					this.plusOne = plusOne;
				}
			public double getPlusTwo()
				{
					return plusTwo;
				}
			public void setPlusTwo(double plusTwo)
				{
					this.plusTwo = plusTwo;
				}
			public double getPlusThree()
				{
					return plusThree;
				}
			public void setPlusThree(double plusThree)
				{
					this.plusThree = plusThree;
				}			
}