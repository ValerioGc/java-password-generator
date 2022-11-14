package org.generation.italy.security;

import java.util.Scanner;

public class PasswordGenerator  {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci il tuo nome:");
		String userName = scan.nextLine();
		System.out.println("Inserisci il tuo cognome:");
		String userSurname = scan.nextLine();
		System.out.println("Inserisci il tuo colore preferito");
		String userColor = scan.nextLine();
		System.out.println("Inserisci il giorno in cui sei nato:");
		String bornDay = scan.nextLine();
		System.out.println("Inserisci il mese in cui sei nato:");
		String bornMonth = scan.nextLine();
		System.out.println("Inserisci l'anno in cui sei nato:");
		String bornYear = scan.nextLine();
		System.out.println("Nome:" + userName);
		System.out.println("Cognome" + "\r" + userSurname);
		System.out.println("Colore:" + "\r" + userColor);
		System.out.println("Data di nascita:" + "\r" + bornDay + '-' + bornMonth + '-' + bornYear);
		System.out.println("Password" + "\r" + userName + '-' + userSurname + '-' + userColor + '-' + bornDay + bornMonth + bornYear);
	}

}
