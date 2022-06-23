package exercicio_1;

public class ContaCorrente extends Conta implements Imposto{
	
	public float rendimento() {
		return saldo * 0.03f;
	}
	
	@Override
	public float calcularImposto(float saldo) {
		return saldo * (25f/100f);
	}
	
}
