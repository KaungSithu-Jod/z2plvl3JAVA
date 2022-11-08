package Assignments;

import java.util.Scanner;

public class BankAccount {
	
	
	int accountNo;
	String holderName, pinNo, password;
	int balance = 100000;
	
	public BankAccount(int accountNo, String holderName, String pinNo, String password) {
		this.accountNo = accountNo;
		this.holderName = holderName;
		this.pinNo = pinNo;
		this.password = password;
	}
	
	public void withdraw(int a) throws InsufficientAmountException{
		
		System.out.println();
		
		if(this.balance < a) {
			throw new InsufficientAmountException("Insufficient Balance");
		} else {
			this.balance = this.balance - a;
			System.out.println("Withdrawed " + a +".\nCurrent balance = " + this.balance);
		}
	}
	
	public void deposit(int a) {
		this.balance = this.balance + a;
		System.out.println("Added " + a + " to current balance.\nCurrent balance = " + this.balance);
	}
	
	public void ChangePassword() throws InvalidPinException{
		
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Pin NO : ");
		String inputPin = scanner.nextLine();
		
		if (!inputPin.equals(this.pinNo)) {
			scanner.close();
			throw new InvalidPinException("Invalid Pin.");
		} else {
			
			System.out.print("New Password: ");
			
			String newPassword = scanner.nextLine();
			this.password = newPassword;
			System.out.println("Password successfully changed.");
			scanner.close();
		}
	}
	
	public void showInfo() {
		System.out.println();
		System.out.println("Account No = " + this.accountNo);
		System.out.println("Holder Name = " + this.holderName);
		System.out.println("Pin Number = " + this.pinNo);
		System.out.println("Password = " + this.password);
		System.out.println("Balance = " + this.balance);
	}
	
	
}


class InsufficientAmountException extends Exception {
	public InsufficientAmountException(String s) {
		super(s);
	}
}
class InvalidPinException extends Exception {
	public InvalidPinException(String s) {
		super(s);
	}
}
