package hr.fer.oop.pete;

public class TextBook extends Book implements ItemWithCashDepozit {
	
	private String subject;
	private double cashDepozitAmmount;
	
	public TextBook(int id, String name, String author, String subject, double cashDepozitAmmount) {
		super(id, name, author);
		this.subject = subject;
		this.cashDepozitAmmount = cashDepozitAmmount;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public double getCashDepozitAmmount() {
		return cashDepozitAmmount;
	}

	public void setCashDepozitAmmount(double cashDepozitAmmount) {
		this.cashDepozitAmmount = cashDepozitAmmount;
	}
	
	@Override
	public String toString() {
		return super.toString() + " subject=" + subject;
	}
	
	@Override
	public int getLoanPeriod() {
		return 120;
	}
	
	public boolean hasCashDeposit() {
		if (cashDepozitAmmount == 0)
			return false;
		return true;
	}
}
