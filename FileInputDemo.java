package com.training.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo {
	public static void main(String[] args) //throws IOException
	{

		FileInputStream fis = null;
		try {
		fis = new FileInputStream("Test1.txt");
			int ch;
			while ((ch = fis.read()) != -1) {
				System.out.print((char)ch);

			}
		} 
		
		catch (FileNotFoundException e) {
			System.out.println("File not found");
		} 
		catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
