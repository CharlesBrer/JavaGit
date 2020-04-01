package ooa;

import java.io.File;

public  class FileText{
	public static void main(String[] args) {
		File f1 = new File("/Users/cheney/Workspaces/MyEclipse 10/Stu/file.java");
		System.out.println("f1的绝对路径是"+f1.getAbsolutePath());
		System.out.println(f1.exists());
		System.out.println(f1.isDirectory());
		System.out.println(f1.length());
		File f2 = new File("/Users/cheney/Workspaces/MyEclipse 10/Stu/dir.java");
		f1.renameTo(f2);
	}
}