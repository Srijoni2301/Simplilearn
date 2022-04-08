package com.simplilearn.fileops;
import java.io.File;
import java.io.IOException;

//--------------------BUILT-IN PATHS----------------------

public class Code1 {

	public static void main(String[] args) {
		File f = new File("E:\\WIPRO\\FileHandling\\file1.txt");
		System.out.println(f.exists()); //does the path exists?
		
		System.out.println(f.isFile());  //does the file exists in the path?
		
		System.out.println(f.isDirectory()); //is path taking u to directory? here Filehandling folder is the directory
		
		System.out.println(f.canRead()); //readable file?
		
		System.out.println(f.canWrite());  //write in the file?
		
		System.out.println(f.getName());  // get me the name of file
		
		System.out.println(f.getAbsolutePath()); // full path name
		
		System.out.println(f.length()); //output: 0
		
		
		File f1 = new File("E:\\WIPRO\\FileHandling\\file1.txt");
		System.out.println(f1.list());  //output: null
		System.out.println(f1.canExecute()); //output: true
		System.out.println(f1.getParent()); //output: E:\WIPRO\FileHandling
		System.out.println(f1.isHidden()); //output: false
		try 
		{
			System.out.println(f.createNewFile()); //output: false
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
