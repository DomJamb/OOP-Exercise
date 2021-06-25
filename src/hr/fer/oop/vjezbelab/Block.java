package hr.fer.oop.vjezbelab;

class Block{
	
	private byte[] prevHash;
	private String[] transactions;
	private int size;
	
	public Block(int maxTransactions) {
		size = maxTransactions;
		transactions = new String[maxTransactions];
	}
	
	public Block(int maxTransactions, Hasher hasher) {
		size = maxTransactions;
		transactions = new String[maxTransactions];
	}
	
	public byte[] getPrevHash() {
		return prevHash;
	}

	public void setPrevHash(byte[] prevHash) {
		this.prevHash = prevHash;
	}

	public int add(String transaction) {
		int i;
		for (i = 0; i < size; ++i) {
			if (transactions[i] == null) {
				transactions[i] = transaction;
				return i;
			}
		}
		return -1;
	}
	
	public void remove(int index) {
		for (int i = index; i < size;) {
			if (i < size-1) {
				int j = i + 1;
				transactions[i] = transactions[j];
				++i;
			} else {
				transactions[i] = null;
				++i;
			}
		}		
	}
	
	public byte[] hash(byte[] prevHash) {
        return new SHAHasher().hash(prevHash, this.transactions);
    }
}
