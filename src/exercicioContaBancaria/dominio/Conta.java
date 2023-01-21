package exercicioContaBancaria.dominio;

public class Conta {
	
	private int conta;
	private String nome;
	private double deposito;
	
	public Conta() {
		
	}
	
	public Conta(int conta, String nome, double depositoInicial) {
		super();
		this.conta = conta;
		this.nome = nome;
		depositos(depositoInicial);
	}
	
	public Conta(int conta, String nome) {
		super();
		this.conta = conta;
		this.nome = nome;
	}
	
	public void depositos (double depositos) {
		this.deposito += depositos;
	}
	
	public void saques (double depositos) {
		this.deposito -= depositos +5;
	}
	
	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	@Override
	public String toString() {
		return " Número da conta=" + conta + ", Nome do titular= " + nome + ", Valor em conta= R$ " + String.format("%.2f", deposito) + " ";
	}
	
	
	
	
}
