public class Node<T> {
	
	private T value;
	private T right = null;
	private T left = null;
	
	public Node(T value) {
		this.value = value;
	}
	
	public Node(T value, T right) {
		this.value = value;
		this.right = right;
	}
	
	public Node(T value, T right, T left) {
		this.value = value;
		this.right = right;
		this.left = left;
	}

	public T getValue() {
		return this.value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public T getRight() {
		return this.right;
	}

	public void setRight(T right) {
		this.right = right;
	}

	public T getLeft() {
		return this.left;
	}

	public void setLeft(T left) {
		this.left = left;
	}
}
