package com.training.io;

import java.io.File;
import java.io.IOException;

class FileDemo {
	public static void main(String[] args) throws IOException {

		String fname = "file.txt";
		String folder = "newfolder";
		File f = new File(folder);
		// f.createNewFile();
		f.mkdir();
		System.out.println("File name :" + f.getName());
		System.out.println("Path :" + f.getAbsolutePath());
		System.out.println("Exists :" + f.exists());
		System.out.println("Is a directory:" + f.isDirectory());
		System.out.println("File Size in bytes " + f.length());

	}
}
