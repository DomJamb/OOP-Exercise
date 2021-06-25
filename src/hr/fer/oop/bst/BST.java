package hr.fer.oop.bst;

public class BST<T extends Comparable<T>> {
	
	private Node<T> root;
	
	public void add(T value) {
		if (root == null) {
			root = new Node<T>(value);
			return;
		}
		add(root, value);
	}
	
	private void add(Node<T> node, T value) {
		if (value.compareTo(node.getValue()) < 0) {
			if (node.getLeft() == null) {
				node.setLeft(new Node<T>(value));
			} else {
				add(node.getLeft(), value);
			}
			
		} else if (value.compareTo(node.getValue()) > 0) {
			if (node.getRight() == null) {
				node.setRight(new Node<T>(value));
			} else {
				add(node.getRight(), value);
			}
		}
	}
	
	public void print() {
		print(root);
		System.out.println();
	}
	
	private void print(Node<T> node) {
		if (node != null) {
			print(node.getLeft());
			System.out.print(node.getValue() + " ");
			print(node.getRight());
		}
	}
	
	public void printInverted() {
		printInv(root);
		System.out.println();
	}
	
	private void printInv(Node<T> node) {
		if (node != null) {
			printInv(node.getRight());
			System.out.print(node.getValue() + " ");
			printInv(node.getLeft());
		}
	}
	
	
}
