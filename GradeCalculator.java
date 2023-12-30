//This Is Java Programming Task 
//Calculator.java

import java.util.*;
public class calculator {

	public static void main(String[] args)
	{
	Scanner n=new Scanner(System.in);
	int S1,S2,S3,S4,S5;
	System.out.println("Enter the mark for Subject_1:");
	S1=n.nextInt();
	System.out.println("Enter the mark for Subject_2:");
	S2=n.nextInt();
	System.out.println("Enter the mark for Subject_3:");
	S3=n.nextInt();
	System.out.println("Enter the mark for Subject_4:");
	S4=n.nextInt();
	System.out.println("Enter the mark for Subject_5:");
	S5=n.nextInt();
	int s=S1+S2+S3+S4+S5;
	int avg=s/5;
	System.out.println(avg);
	if(avg>=90)
	 System.out.print("Grade A");
	else if(avg>=80&&avg<90)
	  System.out.print("Grade B");
	else if(avg>=70&&avg<80)
		  System.out.print("Grade C");
	else if(avg>=60&&avg<70)
		  System.out.print("Grade D");
	else if(avg>=50&&avg<60)
		  System.out.print("Grade E");
	else
		System.out.print("Grade F");
	}
}