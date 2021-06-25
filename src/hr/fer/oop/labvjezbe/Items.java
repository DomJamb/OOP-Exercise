package hr.fer.oop.labvjezbe;

enum Type { ITEM, KG }

abstract class Artikl<T>{
    private T tag;
    private double pricing;
    private Type type;    
    
    public Artikl(T tag, double pricing, Type type) {
        this.tag = tag;
        this.pricing = pricing;
        this.type = type;
    }
    
    public T getTag() {
        return tag;
    }
    
    public double getPricing() {
        return pricing;
    }
    
    public Type getType() {
        return type;
    }
        
    public abstract void setQuantity(double quantity);
    
    public abstract double getPrice();    
}

public class Items<T> extends Artikl<T> {
	
	private double quantity;
	
	public Items(T tag, double pricing, Type type) {
        super(tag, pricing, type);
        quantity = 0;
    }
	
	public void setQuantity(double quantity) {
		
		if (super.getType() == Type.ITEM && quantity % 1 != 0) {
			throw new IllegalArgumentException("For pricing per item, the quantity cannot have decimals");
		}
		
		if (quantity < 0) {
			throw new IllegalArgumentException("Negative values forbidden");
		}
		
		this.quantity = quantity;
	}
	
	public double getPrice() {
		if (super.getType() == Type.ITEM) {
			return quantity * getPricing();
		} else {
			return quantity * getPricing() / 1000;
		}
	}
}
