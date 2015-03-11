package pl.com.bottega.ecommerce.sales.domain.offer;

public class Discount {
	public Discount(String cause, Money value) {
		super();
		Cause = cause;
		this.value = value;
	}
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
