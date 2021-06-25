package hr.fer.oop.bst;

public class Node<T extends Comparable<T>> {
	
	private T value;
	private Node<T> left, right;
	
	public Node(T value) {
		this.value = value;
	}

	public Node<T> getLeft() {
		return left;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public Node<T> getRight() {
		return right;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

	public T getValue() {
		return value;
	}
	
	
}
