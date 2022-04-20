package ar.edu.unju.fi.aplicacion.Punto16;

public class CalculoMatematico {
	int n;

	public CalculoMatematico(int n) {
		super();
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public double calcularSumatoria(int num) {
		double sumatoria = 0;
		for (int k=1;k<=num;k++) {
			sumatoria = sumatoria + Math.pow((((k+1)*k)/2), 2);
		}
		return sumatoria;
	}
	
	public double CalcularProductoria(int num) {
		double productoria = 1;
		for (int j=1; j<=num;j++) {
			productoria = productoria * (j*(j+4));
		}
		return productoria;
	}
}
