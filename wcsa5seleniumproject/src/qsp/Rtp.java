package qsp;

import java.util.Scanner;

public class Rtp {
static webDriver driver;
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Which browser we want to open!!");
	String browservalue=sc.next();
	driver=new chromeDriver();

	}

}
