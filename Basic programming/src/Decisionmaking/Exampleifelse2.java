package Decisionmaking;
import java.util.Scanner;
public class Exampleifelse2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the age");
		int a=s.nextInt();
		if(a<=5)
		{
			System.out.println("no need to buy ticket");
		}
		else
		{
			System.out.println("you have to buy ticket");
		}

	}

}
