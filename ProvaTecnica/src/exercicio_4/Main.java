package exercicio_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		ShowCarro[] carro = new ShowCarro[5];		
		int cont = 0;
		
		do {
			
			//entrada do scanner
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Preencha os campos solicitados :");
			System.out.println("marca:");
			String marca = entrada.next();
			carro[cont].setMarca(marca);
			
			System.out.println("cor");
			String cor = entrada.next();
			carro[cont].setMarca(cor);
			
			System.out.println("modelo");
			String modelo = entrada.next();
			carro[cont].setModelo(modelo);
			
			System.out.println("placa");
			String placa = entrada.next();
			carro[cont].setPlaca(placa);
			
			System.out.println("combustivel");
			String combustivel = entrada.next();
			carro[cont].setTipoCombustivel(combustivel);
			
			cont++;
			
		} while (cont != 4);
		
		int contadorGasolina = 0, contDiesel = 0;
		
		for (int i = 0; i < 5; i++) {
			if(carro[i].getTipoCombustivel().equals("gasolina")) {
				contadorGasolina++;
			}
			if(carro[i].getTipoCombustivel().equals("diesel")) {
				contDiesel++;
			}
		}
		
		System.out.println("quantidade de carros movidos a gasolina" + contadorGasolina);
		System.out.println("-------------------------------- \n");
		
		System.out.println("quantidade de carros movidos a diesel " + contDiesel);
		System.out.println("-------------------------------- \n");
		
	}

}
