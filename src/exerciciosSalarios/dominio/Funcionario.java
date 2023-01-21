package exerciciosSalarios.dominio;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public String toString() {
		return this.nome + ", R$" + String.format("%.2f", salarioLiquido());
	}
	
	public double salarioLiquido () {
		return this.salarioBruto * (1 - this.imposto/100);
	}
	
	public void incrementoSalario(double x) {
	   this.salarioBruto = (this.salarioBruto * (1 - this.imposto/100)) * (1 + x/100);
	}
}

