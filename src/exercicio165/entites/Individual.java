package exercicio165.entites;

public class Individual extends Payer {

	private Double healthIncomes;

	public Individual() {

	}

	public Individual(String name, Double anualIncome, Double healthIncomes) {
		super(name, anualIncome);
		this.healthIncomes = healthIncomes;
	}

	public Double getHealthIncomes() {
		return healthIncomes;
	}

	public void setHealthIncomes(Double healthIncomes) {
		this.healthIncomes = healthIncomes;
	}

	@Override
	public double taxes() {

		if (getAnualIncome() <= 20000) {
			return  (getAnualIncome() * 0.15) - (healthIncomes * 0.5);
		} else {
			return (getAnualIncome() * 0.25) - (healthIncomes * 0.5);
		}
	}

	@Override
	public String toString() {
		return getName() + ": $ " + String.format("%.2f", taxes()) ;
	}
		
	
}
