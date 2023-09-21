import java.util.Scanner;
class Electricity2
{
	public static void main(String[] args) 
	{
		int temp=0;
		double amount=0.0;
		double educes=0.0;
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the units: ");
		int units=scn.nextInt();
		System.out.print("Enter the due: ");
		double due =scn.nextDouble();
		//System.out.println("Hello World!");
		if(units<=50){	
			amount =units*2;
		System.out.println(+units*2+ "X 2rupee="+amount);
		System.out.println("total bill:"+amount);
		}
		else if(units<=150){
			units=units-50;
			amount=(50*2);
			amount=(50*2)+(units*4);
			System.out.println("The bill:"+amount);
		
		}
		else if(units<=200){
		units= units-150;
		amount=(50*2)+(100*4)+(units*7);	
		System.out.println("The bill:"+amount);
		}
		else if(units<=250){
		units=units-200;
		amount=(50*2)+(100*4)+(50*7)+(units*10);	
		System.out.println("The bill:"+amount);
		}
		else if(units<=300){
		units=units-250;
		amount=(50*2)+(100*4)+(50*7)+(50*10)+(units*15);	
		System.out.println("The bill:"+amount);
		}
		else if(units>300){
		units=units-300;
		amount=(50*2)+(100*4)+(50*7)+(50*10)+ (50*15)+(units*15);	
		System.out.println("The bill:"+amount);
		}

		if (amount>2000)
		{
			educes=(amount*3)/100;
			System.out.println("Education ces if billis more than 2000:"+educes);
		}
	
			 double fine= (due*10)/100;

			amount=amount+educes+fine+due;
			System.out.println("Total apsdc bill:"+amount);

	}

}