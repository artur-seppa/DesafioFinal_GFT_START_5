package exercicio_1;

public abstract class Conta {
		private int numero;
		private String titular;
		protected float saldo;
		
		public float rendimento() {
			return saldo;
		}
		
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		public String getTitular() {
			return titular;
		}
		public void setTitular(String titular) {
			this.titular = titular;
		}
		public float getSaldo() {
			return saldo;
		}
		public void setSaldo(float saldo) {
			this.saldo = saldo;
		}
	
}
