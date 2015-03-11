package pl.com.bottega.ecommerce.sales.domain.offer;

public class Discount {
	private String Cause;
	private Money value;
	public String getCause() {
		return Cause;
	}
	public void setCause(String cause) {
		Cause = cause;
	}
	public Money getValue() {
		return value;
	}
	public void setValue(Money value) {
		this.value = value;
	}
}
