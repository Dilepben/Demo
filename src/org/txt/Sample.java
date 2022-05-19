package org.txt;

import java.io.File;
import java.io.IOException;

public class Sample {
	
	public static void main(String[] args) throws IOException {
		File f = new  File ("D: \\ Class") ;
		
		boolean mkdir = f.mkdir();
		System.out.println(mkdir);
		
		File d = new File ("D:\\ Class1\\Class2\\Class3");
		
		boolean mkdirs = d.mkdirs();
		
		System.out.println(mkdirs);
	}

}
