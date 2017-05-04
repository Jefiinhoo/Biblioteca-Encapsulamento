
public class Biblioteca {
	
	
		// Atributos
		String nome, nomep;
		String categoria;
		boolean disponibilidade;
		String estado;
		int codigo;
	private	double taxa;
		String autor;
	private	int diasdevolucao;
		private double rg;
		// Construtor

		Biblioteca() {

		}

		void taxaPorCategoria() {

			if (categoria.equals("Romance")) {
				taxa = 5.00;

			} else if (categoria.equals("Terror")) {
				taxa = 6.00;

			} else if (categoria.equals("Tecnologia")) {
				taxa = 10.00;

			} else {
				taxa = 11.00;
			}
		}

		double TaxaporAtraso(int diasdeatraso) {
			return taxa * diasdeatraso;
		}

		public double getTaxa() {
			return taxa;
		}

		public int getDiasdevolucao() {
			return diasdevolucao;
		}

		public double getRg() {
			return rg;
		}

		public void setRg(double rg) {
			this.rg = rg;
		}

		
	
}


