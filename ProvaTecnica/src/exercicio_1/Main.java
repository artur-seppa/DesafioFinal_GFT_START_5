package exercicio_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		
		//entrada do scanner
		Scanner entrada = new Scanner(System.in);
		float value;
		
		System.out.println("Insira um saldo para a conta corrente");
		value = entrada.nextFloat();
		
		contaCorrente.setSaldo(value);
		
		System.out.println("Rendimento : "+contaCorrente.rendimento());
		System.out.println("teste "+ contaCorrente.getSaldo());
		
		System.out.println("Valor de imposto: "+ 
				contaCorrente.calcularImposto(contaCorrente.getSaldo()));
		
		System.out.println("Insira um saldo para a conta poupanca");
		value = entrada.nextFloat();
		
		contaPoupanca.setSaldo(value);
		
		System.out.println("Rendimento : "+contaPoupanca.rendimento());
		
		System.out.println("Valor de imposto: "+ 
				contaPoupanca.calcularImposto(contaPoupanca.getSaldo()));
		
	}

}
