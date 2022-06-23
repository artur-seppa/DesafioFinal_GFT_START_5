package exercicio_3;

import java.util.ArrayList;

public class ControllerDados {
	
	//exerce a instanciaçao da lista
	ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	
	public boolean criarPessoa(String nome, int cpf, int ddd, int tel, 
			String cidade, String estado, String adress, int cep) {
		if(nome.length() > 0 || cpf > 0 || ddd > 0 || tel > 0 || cidade.length() > 0
				|| estado.length() > 0 || adress.length() > 0 || cep > 0) {
			Pessoa pessoa = new Pessoa();
			Telefone telefone = new Telefone();
			Endereco endereco = new Endereco();
		
			pessoa.setNome(nome);
			pessoa.setCpf(cpf);
			
			telefone.setDdd(ddd);
			telefone.setTelefone(tel);
			
			endereco.setCep(cep);
			endereco.setCidade(cidade);
			endereco.setEstado(estado);
			endereco.setEndereco(adress);
			
			pessoa.setTelefone(telefone);
			telefone.setPessoa(pessoa);
			endereco.setPessoa(pessoa);
			
			listaPessoas.add(pessoa);
			
			return true;
		}else {
			return false;
		}
	}
	
	public boolean atualizarCadastro(String nome, int cpf, int ddd, int tel,
			String cidade, String estado, String adress, int cep ) {
		
		if(nome.length() > 0 || cpf > 0 || ddd > 0 || tel > 0 || cidade.length() > 0
				|| estado.length() > 0 || adress.length() > 0 || cep > 0) {
			for (int i = 0; i < listaPessoas.size(); i++) {
				if(listaPessoas.get(i).getCpf() == cpf) {
						listaPessoas.get(i).setCpf(cpf);
						listaPessoas.get(i).setNome(nome);
						
						listaPessoas.get(i).getTelefone().setDdd(ddd);
						listaPessoas.get(i).getTelefone().setTelefone(tel);
						
						listaPessoas.get(i).getEndereco().setCep(cep);
						listaPessoas.get(i).getEndereco().setCidade(cidade);;
						listaPessoas.get(i).getEndereco().setEstado(estado);;
						listaPessoas.get(i).getEndereco().setEndereco(adress);;
						
						return true;
				}
			}	
		}
		
		return false;
	}
	
	public boolean deletarCadastro( int cpf) {
		if(cpf > 0) {
			for (int i = 0; i < listaPessoas.size(); i++) {
				if(listaPessoas.get(i).getCpf() == cpf) {
					listaPessoas.remove(i);
					return true;
				}
			}
		}
		return false;
	}
	
	public void getLista() {
		for (int i = 0; i < listaPessoas.size(); i++) {
			System.out.println("Nome : "+listaPessoas.get(i).getNome());
			System.out.println("cpf : "+listaPessoas.get(i).getCpf());
			System.out.println("ddd : "+listaPessoas.get(i).getTelefone().getDdd());
			System.out.println("telefone : "+listaPessoas.get(i).getTelefone().getTelefone());
			System.out.println("cep : "+ listaPessoas.get(i).getEndereco().getCep());
			System.out.println("endereco; "+ listaPessoas.get(i).getEndereco().getEndereco());
			System.out.println("-------------------------------- \n");
		}
	}
	
}

