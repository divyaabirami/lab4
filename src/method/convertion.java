package method;

import java.util.Scanner;
import lab4.currency;
public class convertion {
	   double dollar,euro,yen,rupee1,rupee;
	    currency obj3=new currency();
		Scanner obj=new Scanner(System.in);
		public double dollar()
		{
			System.out.println("enter amount in rupee");
			obj3.rupee=obj.nextDouble();
			System.out.println(" rupee"+obj3.rupee+"is conveerted dollar");
			return dollar=obj3.rupee/70;
			
		}
		public double euro()
		{
			
			System.out.println(" rupee"+obj3.rupee+"is converted euro");
			return euro=obj3.rupee/80;
			
		}
		public double yen()
		{
			
			System.out.println(" rupee"+obj3.rupee+"is converted yen");
			return yen=obj3.rupee/0.63;
			
		}
		public double rupee1()
		{
			
			System.out.println(" conversion of dollar "+dollar +"into rupee");
			return rupee1=dollar*70;
			
		}
		public double rupee2()
		{
			rupee1=0;
			System.out.println(" conversion of euro "+euro +"into rupee");
			return rupee1=euro*80;
			
		}
		public double rupee3()
		{
			rupee1=0;
			System.out.println(" conversion of yen "+yen +"into rupee");
			return rupee1=yen*0.63;
			
		}
		public static void main(String[] args) {

	}

}
