import java.util.Scanner;
public class UnitConversion {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double cm,m,km,mile,inch,feet,sqft,cent,g,kg,rupees,dollar,far,cel;
		
		//cm to m vice versa
		System.out.print("Unit in cm\t:");
		cm=scan.nextDouble();
		System.out.println(cm+"cm = "+(cm/100)+"m");
		System.out.print("Unit in m\t:");
		m=scan.nextDouble();
		System.out.println(m+"m = "+(m*100)+"cm\n");
		
		//km to miles vice versa
		System.out.print("Unit in km\t:");
		km=scan.nextDouble();
		System.out.println(km+"km = "+(km*0.62137119)+"miles");
		System.out.print("Unit in miles\t:");
		mile=scan.nextDouble();
		System.out.println(mile+"miles = "+(mile/0.62137119)+"km");
		 
		//inch to feet vice versa	
		System.out.print("Unit in inches\t:");
		inch=scan.nextDouble();
		System.out.println(inch+"inches = "+(inch/12)+"feet");
		System.out.print("Unit in feet\t:");
		feet=scan.nextDouble();
		System.out.println(feet+"feet = "+(feet*12)+"inches");
				 
		//sqft to cent vice versa
		System.out.print("Unit in sqft");
		sqft=scan.nextDouble();
		System.out.println(sqft+"sqft = "+(sqft*0.0022959)+"cent");
		System.out.print("Unit in cent");
		cent=scan.nextDouble();
		System.out.println(cent+"cents = "+(cent/0.0022959)+"sqft");

		//grams to kgs vice versa
		System.out.print("Unit in g");
		g=scan.nextDouble();
		System.out.println(g+"g = "+(g/1000)+"kg");
		System.out.print("Unit in kg");
		kg=scan.nextDouble();
		System.out.println(kg+"kg = "+(kg*1000)+"g");
		
		//rupees to dollar vice versa (Let say 1 dollar = 76.75 Rupees)
		System.out.print("Rupees");
		rupees=scan.nextDouble();
		System.out.print("Rs."+rupees+" = $"+(rupees/76.75));
		System.out.println("Dollar ");
		dollar=scan.nextDouble();
		System.out.println("$"+dollar+" = Rs."+(dollar*76.75));
		
		//fahrenheit to celsius vice versa
		System.out.print("Unit in Fahrenheit");
		far=scan.nextDouble();
		System.out.println(far+"Fahrenheit = "+((far-32.0)*5/9)+"Celsius");
		System.out.print("Unit in Celsius");
		cel=scan.nextDouble();
		System.out.println(cel+"Celsius = "+(cel*9/5+32)+"Fahrenheit");
		
		
	}

}
