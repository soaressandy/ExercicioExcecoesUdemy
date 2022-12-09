package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.DomainException;

public class AccountProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
		
		System.out.println("Enter Account Data\n");
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.next();
		
		System.out.print("Inicial balance: ");
		double balance = sc.nextDouble();
		
		System.out.print("WithDraw limit: " );
		double withDrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withDrawLimit);

		System.out.println(account);
		
		System.out.print("Enter amount for withdraw: " );
		double amount = sc.nextDouble();
		
		account.withDraw(amount);
		
		System.out.println("New Balance: " +  account.getBalance());
		
		sc.close();
		}
		catch(DomainException e) {
			System.out.println(e.getMessage());
			
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}

		

	}

}
