package exercicio_4;

public class ShowCarro extends Carro{
		private String cor;
		private String placa;
		
		public ShowCarro() {
			super();
		}
		
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public String getPlaca() {
			return placa;
		}
		public void setPlaca(String placa) {
			this.placa = placa;
		}

		@Override
		public String toString() {
			return "ShowCarro [cor=" + cor + ", placa=" + placa + ", getModelo()=" + getModelo() + ", getMarca()="
					+ getMarca() + ", getTipoCombustivel()=" + getTipoCombustivel() + "]";
		}
		
}
