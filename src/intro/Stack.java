package intro;

public class Stack<T> {
    public static class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }

        public T getValue() {
            return value;
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
    }

    private Node<T> top;
    private int size;

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void push(T value) {
        Node<T> node = new Node<T>(value);
        node.setNext(this.top);
        this.top = node;
        this.size++;
    }

    public T pop() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Queue is empty! Nothing to pop");
        } else {
            Node<T> node = this.top;
            this.top = this.top.getNext();
            this.size--;
            return node.getValue();
        }
    }

    public T peek() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Queue is empty! Nothing to pop");
        } else {
            Node<T> node = this.top;
            return node.getValue();
        }
    }
}
