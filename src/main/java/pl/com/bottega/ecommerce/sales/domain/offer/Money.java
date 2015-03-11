package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Money {
	private BigDecimal value;
	private String currency;
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int compareTo(Money totalCost) {
		// TODO Auto-generated method stub
		return 0;
	}
	public BigDecimal subtract(Money min) {
		return this.value.min(min.value);
	}
	public BigDecimal multiply(BigDecimal bigDecimal) {
		return this.value.multiply(bigDecimal);
	}
	
}
