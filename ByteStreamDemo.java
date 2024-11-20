package com.training.io;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo {

	public static void main(String[] args) {
		StringBuffer content = new StringBuffer();
		FileInputStream fis = null;
		int ch;
		try {
			fis = new FileInputStream("Test.txt");
			while ((ch = fis.read()) != -1) {
				// content.append((char) ch);
				System.out.print((char) ch);
			}
			// System.out.println(content);
		} catch (Exception e) {
			System.out.println("File does not exist");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {

				System.out.println("Error while closing the file");
			}
		}
	}

}
