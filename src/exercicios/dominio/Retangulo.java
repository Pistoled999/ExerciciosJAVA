package exercicios.dominio;

public class Retangulo {
	public double altura;
	public double largura;
	
	public double area () {
		return this.altura * this.largura;
	}
	public double perimetro () {
		return 2*(this.altura + this.largura);
	}
	public double diagonal () {
		return Math.sqrt(Math.pow(altura, 2)+ Math.pow(largura, 2));
	}
}
