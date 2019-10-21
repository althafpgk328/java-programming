package Basics;
import java.util.Scanner;
public class Xyz {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	char c=s.next().charAt(0);
	int i=s.nextInt();
	s.nextLine();
	String s1=s.nextLine();
	int j=s.nextInt();
	System.out.printf("%-15s,%03d\n",c,i);
	System.out.printf("%-15s,%03d",s1,j);
	
	
	
	}

}
