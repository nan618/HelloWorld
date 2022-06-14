package com.qa.helloworld;

import com.qa.helloworld.printer.Printer;

public class HelloWorld {
	
	public static void main(String[] args) {
		String message = "Hello World!";
		Printer printer = new Printer();
		printer.print(message);
		message = message + " NAN"; 
		printer.print(message);
	}
}
