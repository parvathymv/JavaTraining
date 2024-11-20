package com.training.exceptions;
public class ExceptionDemo {

	public static void main(String[] args) {
		
		int a,b,c;
		double d=10;
		try
		{
		a=Integer.parseInt(args[0]);//AIOBException,NFE exception
		b=Integer.parseInt(args[1]);//AIOBException,NFE exception
		d=d/-0;
		System.out.println(d);
		//c=a/b; //ArithmeticException
		//System.out.println("Result ="+c);
		}
		
		catch(ArithmeticException e)
		{
			//System.out.println(e.getMessage());
			//System.out.println("cannot divide by 0");
			e.printStackTrace();
		}
		catch(NumberFormatException e) {
			System.out.println("check your input values");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Provide 2 numbers");
		}
		catch(Exception e)
		{
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("Invalid input");
		}
		
		finally
		{
			System.out.println("Executed always");//close the opened resources
		}
	}

}
