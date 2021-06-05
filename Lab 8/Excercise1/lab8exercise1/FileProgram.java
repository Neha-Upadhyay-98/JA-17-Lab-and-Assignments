package com.capgemini.lab8exercise1;

import java.io.File;

public class FileProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File sourceFile=new File("C:\\Users\\HP\\Downloads\\eclipse-jee-mars-2-win32-x86_64\\eclipse\\Capgemini-JA-17\\Lab8MultiThreadingExcercises\\source.txt");
		File targetFile=new File("C:\\Users\\HP\\Downloads\\eclipse-jee-mars-2-win32-x86_64\\eclipse\\Capgemini-JA-17\\Lab8MultiThreadingExcercises\\target.txt");
		CopyDataThread cdt=new CopyDataThread(sourceFile,targetFile);
		cdt.start();

		
	}

}
