import java.util.*;
import java.io.*;
class multiplication
{
   public static void main(String args[])
   {		
      int a,b;
	  System.out.println("enter an integer to print its multiplication table");
	  Scanner input=new Scanner(System.in);
	  a=input.nextInt();
	  for(b=1;b<=10;b++)
	   System.out.println(a+"*"+b+"="+(a*b));
   }
}