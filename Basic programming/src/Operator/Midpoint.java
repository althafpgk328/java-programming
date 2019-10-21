package Operator;
import java.util.Scanner;
public class Midpoint {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER X1,Y1 AND X2,Y2");
		int x1=s.nextInt();
		int y1=s.nextInt();
		int x2=s.nextInt();
		int y2=s.nextInt();
		float a=(x1+x2)/2;
		float b=(y1+y2)/2;
		System.out.printf("mid point of line (%.02f,%.02f)",a,b);

	}

}
