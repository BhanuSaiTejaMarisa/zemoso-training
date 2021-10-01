package com.learning.assignments;// Recursive Java program to print all files
// in a folder(and sub-folders)

import java.io.File;
import java.util.Scanner;

public class GFG
{
	static boolean flag=true;
	static void Toggle(){
		flag=false;
	}
	static void RecursivePrint(File[] arr,int index,int level, String searchFile)
	{
		if(arr!=null){// terminate condition
			if (index == arr.length)
				return;

			// tabs for internal levels
//		for (int i = 0; i < level; i++)
//			System.out.print("\t");

			// for files
			if (arr[index].isFile()) {
				boolean contains = arr[index].getName().equals(searchFile);
				if (contains) {
					System.out.println(arr[index].getAbsolutePath());
					flag = true;
					return;
				}
				//System.out.println(arr[index].getName());
			}
			// for sub-directories
			else if (arr[index].isDirectory()) {
				//System.out.println("[" + arr[index].getName() + "]");

				// recursion for sub-directories
				RecursivePrint(arr[index].listFiles(), 0, level + 1, searchFile);
			}

			// recursion for main directory
			RecursivePrint(arr, ++index, level, searchFile);
		}
	}
	
	// Driver Method
	public static void main(String[] args)
	{
		// Provide full path for directory(change accordingly)
		String maindirpath = "/home/bhanum/";
				
		// File object
		File maindir = new File(maindirpath);
		Scanner scanner =new Scanner(System.in);

		if(maindir.exists() && maindir.isDirectory())
		{
			// array for files and sub-directories
			// of directory pointed by maindir
			File arr[] = maindir.listFiles();
			
//			System.out.println("**********************************************");
//			System.out.println("Files from main directory : " + maindir);
//			System.out.println("**********************************************");
			
			// Calling recursive method
//			RecursivePrint(arr,0,0,"GFG.java");
			System.out.println("Enter exit to exit");

			while(true){
				System.out.print("Enter file name:");
				String searchFile=scanner.next();
				if(searchFile.equals("exit")){
					break;
				}
				Toggle();
				RecursivePrint(arr,0,0,searchFile);
				//System.out.println(flag);
				if(!flag){
					System.out.println("File does not  exist");
				}
			}
	}


	}
}
