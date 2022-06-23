package exercicio_1;

public class ContaPoupanca extends Conta implements Imposto {
	
	public float rendimento() {
		return saldo * 0.05f;
	}

	@Override
	public float calcularImposto(float saldo) {
		return saldo * (10f/100f);
	}
	
}