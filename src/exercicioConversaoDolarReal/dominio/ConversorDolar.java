package exercicioConversaoDolarReal.dominio;

public class ConversorDolar {
	public static double PRECO_DOLAR;
	public static double dolar;
	
	
	public static double converteDolar () {
		return ((ConversorDolar.dolar * ConversorDolar.PRECO_DOLAR) + (ConversorDolar.dolar * ConversorDolar.PRECO_DOLAR * 6/100));
	}
	
	

}
