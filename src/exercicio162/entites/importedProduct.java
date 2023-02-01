package exercicio162.entites;

public class importedProduct extends Product {
	private Double customFee;
	
	public importedProduct () {
		
	}

	public importedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}

	@Override
	public String priceTag() {
		return getName() 
						+ " $ "
						+ String.format("%.2f", getPrice())
						+ " Customs fee: $ "
						+ customFee;
	}
	
	
}
