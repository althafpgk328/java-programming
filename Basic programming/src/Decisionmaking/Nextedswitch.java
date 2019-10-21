package Decisionmaking;
import java.util.Scanner;
public class Nextedswitch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("choose district");
		System.out.printf("1)Thrissur\n2)Palakkad\n");
		int a=s.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Thrissur");
			System.out.println("Choose legislative assembly");
			System.out.printf("A)chelakkara\nB)wadakanchery\n");
			char c=s.next().charAt(0);
			switch(c)
			{
			case 'A':
			System.out.println("welcome to chelakkara ");
			break;
			case 'B':
				System.out.println("welcome to wadakanchery");
				break;
			}
			break;
		
		case 2:
			System.out.println("Palakkad");
			System.out.println("choose legislative assembly");
			System.out.println("A)Nenmara\nB)Tharur");
			char b=s.next().charAt(0);
			switch(b)
			{
			case 'A':
				System.out.println("welcome to nenmara");
				break;
			case 'B':
				System.out.println("welcome to Tharur ");
				break;
			}
			break;
			
			}	
			
		}
}

