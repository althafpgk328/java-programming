package Decisionmaking;
import java.util.Scanner;
public class Exampleifelse {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the mark");
	int a=s.nextInt();
	if(a>=45)
	{
		System.out.println("qualified");
	}
	else
	{
		System.out.println("not qualified");
	}
	}

}
