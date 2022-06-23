package exercicio_3;

import java.util.Scanner;

public class Main {
	
	public static void menu() {
		System.out.println("Usuarios");
		System.out.println("1) Cadastrar Usuario");
		System.out.println("2) Visualizar Usarios cadastrados");
		System.out.println("3) Atualizar Usario");
		System.out.println("4) Deletar Usario");
		System.out.println("5) Sair");
	}

	public static void main(String[] args) {
		ControllerDados controller = new ControllerDados();
		
		int opcao = -1;
		
		do {
			menu();
			
			//entrada do scanner
			Scanner entrada = new Scanner(System.in);
			System.out.println("Insira uma opcao");
			opcao = entrada.nextInt();
			
			switch (opcao) {
			case 1:
				
				System.out.println("Preencha os campos solicitados :");
				System.out.println("nome:");
				String nome = entrada.next();
				
				System.out.println("idade:");
				int idade = entrada.nextInt();
				
				System.out.println("cpf:");
				int cpf = entrada.nextInt();
				
				System.out.println("ddd:");
				int ddd = entrada.nextInt();
				
				System.out.println("telefone:");
				int tel = entrada.nextInt();
				
				System.out.println("cep:");
				int cep = entrada.nextInt();
				
				System.out.println("Cidade:");
				String cidade = entrada.next();
				
				System.out.println("Estado:");
				String estado = entrada.next();
				
				System.out.println("Endereco:");
				String adress = entrada.next();
				
				controller.criarPessoa(nome, cpf, ddd, tel, cidade, estado, adress, cep);
				break;
				
			case 2:

				controller.getLista();
				break;
			
			case 3:
				
				System.out.println("Preencha os campos solicitados :");
				System.out.println("nome:");
				String nome1 = entrada.next();
				
				System.out.println("idade:");
				int idade1 = entrada.nextInt();
				
				System.out.println("cpf:");
				int cpf1 = entrada.nextInt();
				
				System.out.println("ddd:");
				int ddd1 = entrada.nextInt();
				
				System.out.println("telefone:");
				int tel1 = entrada.nextInt();
				
				System.out.println("cep:");
				int cep1 = entrada.nextInt();
				
				System.out.println("Cidade:");
				String cidade1 = entrada.next();
				
				System.out.println("Estado:");
				String estado1 = entrada.next();
				
				System.out.println("Endereco:");
				String adress1 = entrada.next();
				
				controller.atualizarCadastro(nome1, cpf1, ddd1, tel1, cidade1, estado1, adress1, cep1);
				break;
				
			case 4:
				
				System.out.println("Preencha os campos solicitados :");
				
				System.out.println("cpf:");
				int cpf2 = entrada.nextInt();

				controller.deletarCadastro(cpf2);
				break;

			default:
				break;
			}
			
		} while (opcao != 5);
	}

}
