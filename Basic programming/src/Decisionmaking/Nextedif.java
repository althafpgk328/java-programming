package Decisionmaking;
import java.util.Scanner;
public class Nextedif {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the brand name");
	String brand=s.nextLine();
	System.out.println("enter the ram memmory");
	int ram=s.nextInt();
	System.out.println("enter the hdd size in tb");
	int a=s.nextInt();
	if(brand.contentEquals("HP"))
	{
		if(ram==3)
		{
			if(a==3)
			{
				System.out.println("available");
			}
			else
			{
				System.out.println("not available");
			}
		}
	}
	else
	{
		System.out.println("brand not available");
	}
	
	

	}

}
