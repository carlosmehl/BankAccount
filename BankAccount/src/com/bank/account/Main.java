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
		
		System.out.println("1 - Open a bank account:");
		System.out.println("2 - Access my account:");
		System.out.println("3 - Close account:");
		
		System.out.println("1 - Abrir uma conta bancária:");
		System.out.println("2 - Acessar minha conta:");
		System.out.println("3 - Fechar conta:");
		cc.setOption(scanner.nextInt());
		
		switch(cc.getOption()) {
			case 1: cc.validaConta();
				scanner.nextLine(); // limpa a quebra de linha pendente
				System.out.println("What is your full name?");
				System.out.println("Qual seu nome completo:");
				cc.setName(scanner.nextLine());
				System.out.println("Enter account number:");
				System.out.println("Entre com o número da conta:");
				cc.setCc(scanner.next());
				System.out.println("If you wish, you can make your first deposit, or you can do it later.");
				System.out.println("Se desejar pode realizar seu primeiro depósito, ou pode fazer isso mais tarde.");
				cc.setInitialDeposit(scanner.nextDouble());
				System.out.println(cc.abrirConta());
				break;
			case 2: System.out.println("Método acessa conta");
				break;
			case 3: System.out.println("Método fecha conta");
				break;
			default: System.out.println("Invalid option! Please try again.");
				System.out.println("Opção inválida! Tente novamente.");
				break;
		}
		scanner.close();
	}

}
