package com.training.exceptions;
class User
{
	private String name;
	private int age;
	public User(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	//handling exception locally within the method
	void checkUser()
	{
		try
		{
		if(age <18)
			throw new InvalidAgeException("Not eligible to vote");
		else
			System.out.println("Eligible to vote");
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
			
		}
	//propagate the exception to the calling method
	void checkAge() throws InvalidAgeException
	{
		
		if(age <18)
			throw new InvalidAgeException("Not eligible to vote");
		else
			System.out.println("Eligible to vote");
		
			
		}
	}
	
	
	

class InvalidAgeException extends Exception
{
	
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class CustomExceptionDemo {

	public static void main(String[] args) throws InvalidAgeException 
	{
		User user=new User("sai",15);
	
		//user.checkUser();
	
//		try
//		{
	    user.checkAge();
//	}
//	catch(InvalidAgeException e)
//		{
//		System.out.println(e.getMessage());
//		}

	}

}
