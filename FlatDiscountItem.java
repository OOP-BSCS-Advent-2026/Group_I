public class FlatDiscountItem extends Item {
	private int threshold;
	private double discount;

	public FlatDiscountItem(String name, double price, int threshold, double discount) {
		super(name, price);
		this.threshold = threshold;
		this.discount = discount;
	}

	@Override
	public double calculateTotal(int quantity) {
		double subtotal = super.calculateTotal(quantity);
		if (quantity >= threshold) {
			subtotal -= discount;
		}
		return subtotal;
	}
}
