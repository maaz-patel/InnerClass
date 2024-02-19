package Inner;

import java.util.Scanner;

public class OuterClass 
{
		
	public void CalciDriver()
	{
		Scanner sc=new Scanner(System.in);
		for(;;)
		{
			System.out.println("1.Add 2.Sub 3.Mul 4.Rem 5.Exit");
			switch(sc.nextInt())
			{
			case 1:InnerClass.Add();
					break;
			case 2:InnerClass.Sub();
					break;
			case 3:InnerClass.Mul();
					break;
			case 4:InnerClass.Rem();
					break;
			case 5:System.exit(0);
			}
		}
	}
	
	
	class InnerClass
	{
		static int data =0;
		
		public static void Add()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number 1 2 3 4 5 6 7 8 9 0");
			data=data+sc.nextInt();
			System.out.println(data);
		}
		public static void Sub()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number 1 2 3 4 5 6 7 8 9 0");
			data=data-sc.nextInt();
			System.out.println(data);
		}
		public static void Mul()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number 1 2 3 4 5 6 7 8 9 0");
			data=data*sc.nextInt();
			System.out.println(data);
		}
		public static void Rem()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number 1 2 3 4 5 6 7 8 9 0");
			data=data%sc.nextInt();
			System.out.println(data);
		}
	}
}

