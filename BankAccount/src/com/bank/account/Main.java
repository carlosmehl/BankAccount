package com.bank.account;

import java.util.Scanner;
import util.CC;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CC cc = new CC();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome! Select one of the options below:");
		System.out.println("Bem vindo! Selecione uma das opções abaixo:");
		
		System.out.println("1 - Abrir uma conta bancária:");
		System.out.println("2 - Acessar minha conta:");
		System.out.println("3 - Fechar conta:");
		cc.setOption(scanner.nextInt());
		
		switch(cc.getOption()) {
			case 1: System.out.println("Método abrir conta");
		
		
		
		
		
		
		}
		
		
		


		
		
		
		
		scanner.close();
	}

}
