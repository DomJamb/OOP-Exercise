package hr.fer.oop.vjezbelab;

import java.util.Arrays;

class Blockchain{
	
	private Block[] blocks;
	private int size;
	
	public Blockchain(int maxBlocks) {
		blocks = new Block[maxBlocks];
		size = maxBlocks;
	}
	
	public int add(Block newBlock) {
		for (int i = 0; i < size; ++i) {
			if (blocks[i] == null) {
				blocks[i] = newBlock;
				if (i == 0) {
					blocks[i].setPrevHash(new byte[]{0});
				} else {
					blocks[i].setPrevHash(blocks[i-1].hash(blocks[i-1].getPrevHash()));
				}
				return i;
			}
		}
		return -1;
	}
	
	public Block get(int index) {
		return blocks[index];
	}		
	
	public boolean isAltered(int blockIndex, byte[] expectedHash) {
        byte[] prevHash = new byte[]{0};
        for (int i = 0; i <= blockIndex; i++) {
            prevHash = blocks[i].hash(prevHash);
        }
        return !Arrays.equals(prevHash, expectedHash);
    }
}
