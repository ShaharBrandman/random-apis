public class Node<T> {
	
	public T value;
	public Node<T> next = null;
	
	public Node(T value) {
		this.value = value;
	}
	
	public Node(T value, Node<T> next) {
		this.value = value;
		this.next = next;
	}

	public T getValue() {
		return this.value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNext() {
		return this.next;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public boolean isEmpty() {
		return this.value != null;
	}
	
	public boolean hasNext() {
		return this.next != null;
	}
}
