package application;

import java.util.Scanner;

// desafio simulando uma conta bancária

public class ContaBancaria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Conta: ");
		int Conta = sc.nextInt();
		
		System.out.print("Agência: ");
		String Agencia = sc.next();
		
		System.out.print("Nome: ");
		sc.nextLine();
		String Nome = sc.nextLine();
	
		System.out.print("Saldo: ");
		double Saldo = sc.nextDouble();
		
		System.out.println(Conta);
		System.out.println(Agencia);
		System.out.println(Nome);
		System.out.println(Saldo);
		
		System.out.print("\"Olá " + Nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Conta + " e seu saldo " + Saldo + " já está disponível para saque\".");
		
	}

}
