package assignment;
import java.util.Scanner;


public class powerfunction {
	
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the first input");
		double a=scn.nextInt();
		System.out.println("Enter the Second input");
		double b=scn.nextInt();
		powerfunc(a,b);
	}
	private static void powerfunc(double a,double b) {
		double ans = Math.pow(a, b);
		System.out.println(ans);
		
	}

}
