package com.banco;

import sun.management.ConnectorAddressLink;

public class Conta {
	long numeroConta;
	String Titular;
	double saldo;

	boolean sacar(double valor) {

		if (saldo >= valor) {

		saldo -= valor;
		return true;
		}else {
			return false;
		}
	}

	void deposita(double valor) {
		saldo += valor;
	}


	void transferir(Conta contaDestino, double valor) {
		saldo -= valor;
		contaDestino.saldo += valor;
	}
}

class Produto {

	public static void main(String[] args) {

		Conta conta = new Conta();

		conta.numeroConta = 20557;
		conta.Titular = "Rafael Monteiro";
		conta.saldo = 500.0;


		Conta conta2 = new Conta();
		conta2.numeroConta = 50228;
		conta2.Titular = "Aillen Leite Araújo";
		conta2.saldo = 700.0;

		conta.transferir(conta2, 6000.0);


		System.out.println("Número da Conta  " + conta.numeroConta);
		System.out.println("Cliente:  " + conta.Titular);
		System.out.println("Saldo " + conta.saldo);
		System.out.println();

		System.out.println("Número da Conta  " + conta2.numeroConta);
		System.out.println("Cliente:  " + conta2.Titular);
		System.out.println("Saldo  " + conta2.saldo);





	}
}