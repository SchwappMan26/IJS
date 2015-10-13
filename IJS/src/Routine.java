import java.util.ArrayList;
public class Routine
	{
		static double sum=0;
		static ArrayList<Routine>yourRoutine=new ArrayList<Routine>();
		private String element;
		private double value;
		public Routine(String e, double v)
			{
				element=e;
				value=v;
			}
		public static void YourRoutine()
			{			
				if (Skater.rotation==1)
					{
						if(Skater.jump==1)
							{
								yourRoutine.add(new Routine ("1Axel",1.1));
							}
						else if(Skater.jump==2)
							{
								yourRoutine.add(new Routine("1Toe Loop",0.4));
							}
						else if(Skater.jump==3)
							{
								yourRoutine.add(new Routine("1Salchow",0.4));
							}
						else if(Skater.jump==4)
							{
								yourRoutine.add(new Routine("1Loop",0.5));
							}
						else if(Skater.jump==5)
							{
								yourRoutine.add(new Routine("1Flip",0.5));
							}
						else if(Skater.jump==6)
							{
								yourRoutine.add(new Routine("1Lutz",0.6));
							}
					}
				else if(Skater.rotation==2)
					{
						if(Skater.jump==1)
							{
								yourRoutine.add(new Routine ("2Axel",3.3));
							}
						else if(Skater.jump==2)
							{
								yourRoutine.add(new Routine("2Toe Loop",1.3));
							}
						else if(Skater.jump==3)
							{
								yourRoutine.add(new Routine("2Salchow",1.3));
							}
						else if(Skater.jump==4)
							{
								yourRoutine.add(new Routine("2Loop",1.8));
							}
						else if(Skater.jump==5)
							{
								yourRoutine.add(new Routine("2Flip",1.9));
							}
						else if(Skater.jump==6)
							{
								yourRoutine.add(new Routine("2Lutz",2.1));
							}
					}
				else if(Skater.rotation==3)
					{
						if(Skater.jump==1)
							{
								yourRoutine.add(new Routine ("3Axel",8.5));
							}
						else if(Skater.jump==2)
							{
								yourRoutine.add(new Routine("3Toe Loop",4.3));
							}
						else if(Skater.jump==3)
							{
								yourRoutine.add(new Routine("3Salchow",4.4));
							}
						else if(Skater.jump==4)
							{
								yourRoutine.add(new Routine("3Loop",5.1));
							}
						else if(Skater.jump==5)
							{
								yourRoutine.add(new Routine("3Flip",5.3));
							}
						else if(Skater.jump==6)
							{
								yourRoutine.add(new Routine("3Lutz",6.0));
							}
					}
				else if(Skater.rotation==4)
					{
						if(Skater.jump==1)
							{
								yourRoutine.add(new Routine ("4Axel",15.0));
							}
						else if(Skater.jump==2)
							{
								yourRoutine.add(new Routine("4Toe Loop",10.3));
							}
						else if(Skater.jump==3)
							{
								yourRoutine.add(new Routine("4Salchow",10.5));
							}
						else if(Skater.jump==4)
							{
								yourRoutine.add(new Routine("4Loop",12.0));
							}
						else if(Skater.jump==5)
							{
								yourRoutine.add(new Routine("4Flip",12.3));
							}
						else if(Skater.jump==6)
							{
								yourRoutine.add(new Routine("4Lutz",13.6));
							}
					}
				else if (Skater.spin==1)
					{
						yourRoutine.add(new Routine ("Combination Spin",3.5));
					}
				else if (Skater.spin==2)
					{
						yourRoutine.add(new Routine ("Flying Sit",3.0));
					}
				else if (Skater.spin==3)
					{
						yourRoutine.add(new Routine ("Flying Camel",3.2));
					}
				else if (Skater.spin==4)
					{
						yourRoutine.add(new Routine ("Change foot Sit",3.0));
					}
				else if (Skater.spin==5)
					{
						yourRoutine.add(new Routine ("Change foot Camel",3.2));
					}
				else if (Skater.StepSequence==1)
					{
						yourRoutine.add(new Routine ("Step Sequence",3.9));
					}
				else if (Skater.StepSequence==2)
					{
						yourRoutine.add(new Routine ("Cheorgraphy Step Sequence",2.0));
					}	
				Skater.jump = 0;
				Skater.spin = 0;
				Skater.StepSequence = 0;
			}
			public static void printList()
				{
					for (Routine e : yourRoutine)
						{
							System.out.println(e.getElement()+" "+e.getValue());					
						}
				}
			public static void finalPrintList()
				{				
					for (int i=0; i<13;i++)
						{
							sum=sum+yourRoutine.get(i).getValue();
						}
					System.out.println("Your Total technical score is: "+sum);
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