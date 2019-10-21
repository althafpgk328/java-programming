package Controlstructures;
import java.util.Scanner;
class Strg1 {

	public static void main(java.lang.String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		String ar[]=new String[a];
		for(int i=0;i<a;i++)
		{
			ar[i]=s.next(); 
		}
		char c;
		for(int i=0;i<a;i++)
		{
		c=ar[i].charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			System.out.println(ar[i]);
		}
		}
	}

}
