public class NodeQueue<T> {
	public Node<T> first = null;
	public Node<T> last = null;
	
	public NodeQueue() {
		
	}
	
	public NodeQueue(Node<T> first) {
		this.first = first;
	}
	
	public NodeQueue(Node<T> first, Node<T> last) {
		this.first = first;
		this.last = last;
	}
	
	public void insert(T value) {
		if (last == null) {
			first = new Node<T>(value);
			last = first;
		}
		else {
			last.setNext(new Node<T>(value));
		}
	}
	
	public Node<T> remove() {
		Node<T> tmp = first;

		if (first != last) {
			first = first.getNext();
		}
		else {
			first = null;
			last = null;
		}
		
		return tmp;
	}
	
	public Node<T> head() {
		return this.first;
	}
	
	public String toString() {
		Node<T> f = first;
		String str = "[";
		
		while(f!=null) {
			str += f.getNext() + ", ";
			f = first.getNext();
		}
		
		return str;
	}
	
	public boolean isEmpty() {
		return (this.first != null) & (this.last != null);
	}
}
