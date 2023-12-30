//This is Java Programming Task 1
//NumberGame limits upto 1-99


import java.util.*;
public class RandomNumber{
    public static void main(String[]args){
	    Scanner k=new Scanner(System.in);
        Random random=new Random();
        int a=random.nextInt(100),b=1,s=0;
        System.out.println("Random Number Generates From 0 to 99");
        while(b<=5)
        {
	        System.out.print("Enter The Number:");
	        int c=k.nextInt();
	        if(c>a)
	        {
		        System.out.println("The Number is Too High");
		        s++;
	        }
	        else if(c<a)
	        {
		        System.out.println("The Number is Too Low");
		        s++;
	        }
	        else
	        {
		        System.out.println("Hurrah!! It is Right Answer");
		        break;
	        }
	        b++;
        }
        int f=5-s;
  
        if(s==5)
        {
	    System.out.println("Sorry Better Luck Next Time!");
        }
        else
        {
	    System.out.println("Congrats!!! You Have Won The Game!");
	    System.out.println("Your Score is "+f+"/5");
        }
        System.out.println("The Random Number Is "+a);
    }
}