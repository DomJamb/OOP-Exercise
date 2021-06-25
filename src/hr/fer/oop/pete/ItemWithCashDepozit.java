package hr.fer.oop.pete;

public interface ItemWithCashDepozit {
	
	public default boolean hasCashDeposit() {
		return true;
	}
	
	public double getCashDepozitAmmount();
}
