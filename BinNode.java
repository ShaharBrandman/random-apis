public class BinNode<T> {
	
	public T value;
	public T right = null;
	public T left = null;
	
	public BinNode(T value) {
		this.value = value;
	}
	
	public BinNode(T value, T right) {
		this.value = value;
		this.right = right;
	}
	
	public BinNode(T value, T right, T left) {
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
	
	public boolean isEmpty() {
		return this.value != null;
	}
	
	public boolean hasRight() {
		return this.right != null;
	}
	
	public boolean hasLeft() {
		return this.left != null;
	}
}
