package com.greatlearning.stock;

import java.util.Scanner;

import com.greatlearning.stock.Companies;

public class Main {
	
	private static Scanner sc = new Scanner( System.in ); 
	
	public static void main(String[] args ) {
		double stockPrice= 0;
		int companyNo;
		System.out.println( "Enter the number of Companies" );
		companyNo = sc.nextInt();
		
	   for(int i=0; i<=companyNo;i++)
	   {
		System.out.println( "Enter current stock price of the company"+companyNo);
		 stockPrice = sc.nextInt();
	   }
	   System.out.println( "Whether company's stock price rose today compare to yesterday?" );
	   boolean stockpricerose = sc.nextBoolean();
	 
	 if(stockpricerose == true)
	 {
		System.out.println( "Enter the operation that you want to perform" );
		
		System.out.println("1.Display the companies stock prices in ascending order");
		System.out.println("2. Display the companies stock prices in descending order");
		System.out.println("3. Display the total no of companies for which stock prices rose today");
		System.out.println("4. Display the total no of companies for which stock prices declined today");
		System.out.println("5. Search a specific stock price");
		System.out.println("6. press 0 to exit");
		
		int choice = sc.nextInt();
		
	Companies cmp;
	
	switch(choice)
	{
	case 1:
		cmp = new Companies(companyNo,stockPrice,true);
		break;
		
	case 2:
		cmp = new Companies(companyNo,stockPrice,true);
		break;
	case 3:
		cmp = new Companies(companyNo,stockPrice,true);
		break;
		
	case 4:
		cmp = new Companies(companyNo,stockPrice,true);
		break;
		
	case 5:
		cmp = new Companies(companyNo,stockPrice,true);
		break;
		
	case 6:

		return;
		
	}
	
	 }
	 
	   
	}

}
