package org.mavenexample.practice;

import org.testng.annotations.Test;

public class Practice1Test {
	
	@Test
	public void practice1(){
		System.out.println("test--1-->class1");
		String browser = System.getProperty("browser");
		String url = System.getProperty("url");
		String password = System.getProperty("password");
		System.out.println("URL--->"+url);
		System.out.println("browser-->"+browser);
		System.out.println("password-->"+password);
		System.out.println("hai");
		//hi everyone
		
	}
	@Test
	public void practice2()
	{
		System.out.println("test--2-->class1");
		
	}
	@Test
	public void practice3(){
		System.out.println("test--3-->class1");
		
	}

}
