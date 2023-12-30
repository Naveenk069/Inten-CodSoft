import java.util.*;

public class ATMGenerator{
	static int tot=0;
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Welcome to Our ATM!!!  \nInsert Your ATM Card  \n Make the Transation Safe!!");
	 System.out.println("1]DEPOSIT            //Deposit More than Rs.500   \n2]WITHDRAWAL         //WithDrawal Minimum Rs.500");
	 System.out.println("3]CHECK BALANCE      \n4]EXIT");
	 System.out.println();
	 boolean last=true;
	 while(last)
	 {
       System.out.print("Enter the Number to choose the option:" );
       int a=sc.nextInt();
	 switch(a)
	 {
	 case 1:
		 deposit();
		 break;
	 case 2:
		 withdrawl();
		 break;
	 case 3:
		 System.out.println("The Balance Amount is:"+check_balance());
		 break;
	 case 4:
		 last=false;
		 break;
	 }
	 }
     System.out.println("Thank You!!");
     
	}
	public static void deposit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount for deposit:");
		int dep=sc.nextInt();
		if(dep<1000)
		{
			System.out.println("Sorry!!You need deposit more than 500!!");
		}
		tot+=dep;
	}
	public static void withdrawl()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount for withdrawl:");
		int dep=sc.nextInt();
		int ch=check_balance();
		if(ch>1000)
		{
			if(dep>ch)
			  System.out.println("Your Withdrawl Amount Is Greater Than The Balance Amount!!");				 
			else
			{
			tot-=dep;
			if(tot<1000)
			  System.out.println("It reaches the minimum limit!!");
			}
		}
		
	}
	public static int check_balance()
	{
		return tot;
	}
}