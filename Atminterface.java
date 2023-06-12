package com.java;
import java.util.*;
public class Atminterface {

	public static void main(String[] args) {
		int balance=100000,withdraw,deposit,TranferAmount;
		Scanner sc =new Scanner(System.in);
		System.out.println("Account name:");
		String AccountHoldername=sc.nextLine();
		
		System.out.println("enter pin number:");
		int pinnum=sc.nextInt();
		if(pinnum!=20231)
		{
			System.out.println("wrong pin number");
			System.exit(0);
			
		}
		if(pinnum==20231)
		{while(true)
		{
			System.out.println("---------------------------------------------------------------------------------------------------");
			System.out.println("*****WELCOME*****");
			System.out.println("choose the operations:");
			System.out.println("choose 1 for withdraw");
			System.out.println("choose 2 for deposit");
			System.out.println("choose 3 to checkbalance");
			System.out.println("choose 4 to tranfer money");
			System.out.println("choose 5 to quit");
		    int option=sc.nextInt();
		    System.out.println("---------------------------------------------------------------------------------------------------");
		    switch(option)
		    {
		    case 1:
		    
		    	System.out.println("Account name:"+AccountHoldername);
		        System.out.println("enter the money to be withdrawn");
		    withdraw=sc.nextInt();
		    balance-=withdraw;
		    if(balance>=withdraw)
		    {
		    	System.out.println("collect you money");
		    	System.out.println("your's current balance is:"+balance);
		    }
		    else
		    {System.out.println("in sufficient balance");
		    }
		    System.out.println("");
		    break;
		    case 2:
		    	System.out.println("Account name:"+AccountHoldername);
		    	System.out.println("Enter the amount to be deposited:");
		    	deposit=sc.nextInt();
		    	balance=balance+deposit;
		    	System.out.println("amount id deposited sucessfully");
		    	System.out.println("your's current balance is:"+balance);
		    	System.out.println("");
		    	break;
		    case 3:
		    	System.out.println("Account name:"+AccountHoldername);
		    	System.out.println("Balance:"+balance);
		    	System.out.println("");
		    	break;
		    case 4:
		    	System.out.println("Account name:"+AccountHoldername);
		    	System.out.println("enter the amount to tranfer");
		    	TranferAmount=sc.nextInt();
		    	balance-=TranferAmount;
		    	System.out.println("tranfer done sucessfully");
		    	System.out.println("your's current balance is:"+balance);
		    case 5:
		    	System.out.println("you exited sucessfully");
		    	System.exit(0);
		    	
		    }
		}
	}
 }
}
	