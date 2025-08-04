package util;

public class CC {
	private int option;
	private String cc;
	private String name;
	private double initialDeposit;
	private double balance;
	
	/*Métodos Construtores*/
	public CC() {
	}
	public CC(String cc, String name) {
		this.cc = cc;
		this.name = name;
	}
	public CC(String cc, String name, double initialDeposit) {
		this.cc = cc;
		this.name = name;
		this.initialDeposit = initialDeposit;
	}
	
	/*Métodos Getters e Setters*/
	public int getOption() {
		return option;
	}
	public void setOption(int option) {
		this.option = option;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getInitialDeposit() {
		return initialDeposit;
	}
	public void setInitialDeposit(double initialDeposit) {
		this.initialDeposit = initialDeposit;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
