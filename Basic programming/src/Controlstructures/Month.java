package Controlstructures;
import java.util.Scanner;
public class Month {

	public static void main(String[] args) {
	Scanner z=new Scanner(System.in);
	String st[]=new String[10];	
	for(int i=0;i<=10;i++)
	{
		st[i]=z.nextLine();
	}
	for(int i=0;i<=10;i++)
	{
		System.out.println(st[i]);
	}
	}
}