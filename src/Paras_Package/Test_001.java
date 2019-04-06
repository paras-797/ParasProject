package Paras_Package;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class A{
	
	void msg(){
		System.out.println("Parent is running");
	}
}

class B extends A{
	
	void msg(){
		System.out.println("Child is running");
	}
}
public class Test_001{
	 public static String driverPath = "C:/Chrome driver/";
	 public static WebDriver driver;
	 public static void main(String[] args) throws InterruptedException
	 {
		 
		 B a=new B();
		 a.msg();


		 
		 
		
	 }
	 	
}
