package assignment;
import java.util.Scanner;

public class operations
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the first input");
		int a=scn.nextInt();
		System.out.println("Enter the second input");
		int b= scn.nextInt();
		
		Calculator(a,b);
	}
	
	public static void Calculator(int a,int b)
	{
		int add= a+b;
		System.out.println("addition ="+add);
		int sub= a-b;
		System.out.println("substraction ="+sub);
		int mul= a*b;
		System.out.println("multiplication ="+mul);
		int div=a/b;
		System.out.println("division = "+div);
	}
		
	}
