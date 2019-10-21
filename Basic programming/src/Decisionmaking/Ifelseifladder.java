package Decisionmaking;
import java.util.Scanner;
public class Ifelseifladder {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the age");
		int a=s.nextInt();
		if(a<=13)
		{
			System.out.println("child");
		}
		
		else if(a>13&&a<=19)
		{
			System.out.println("teen ager");
		}
		else if(a>19&&a<=30)
		{
			System.out.println("youth");
		}

	else if(a>30&&a<=50)
	{
		System.out.println("middile ager");
	}
	else
	{
		System.out.println("old");
	}
	}
}
