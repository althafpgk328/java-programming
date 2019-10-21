package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Secondlargest {

		public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter the size of array");
			int a=Integer.parseInt(br.readLine());
			int b[]=new int[a];
			System.out.println("enter the elements to the array");
			for(int i=0;i<a;i++)
			{
				b[i]=Integer.parseInt(br.readLine());
				
			}
			Arrays.sort(b);
			System.out.println(b[a-2]);

	}

}
 