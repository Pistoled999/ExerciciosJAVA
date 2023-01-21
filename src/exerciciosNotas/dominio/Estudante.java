package exerciciosNotas.dominio;

public class Estudante {
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double imprime () {
	return	this.nota1 + this.nota2 + this.nota3;
		
		}
	
	public double diferenca() {
		return 60 - imprime();
	}
}
