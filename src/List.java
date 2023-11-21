class List<T> {
    Node<T> node;
    int size = 0;

    public void add(T value) {
        size++;
        Node<T> temp = this.node;
        if (size == 1) {
            node = new Node<>(value);
        } else {
            Node<T> nextNode = new Node<>(value);
            for (int i = 0; i < size; i++) {
                if (temp.next == null) {
                    temp.next = nextNode;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public T add(T value, int index) {
        Node<T> temp = this.node;
        Node<T> newNode = new Node<>(value);
        Node<T> previousNode = this.node;
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                previousNode.next=newNode;
                newNode.next=temp;
                size++;
                //temp.value = value;
                break;
            }
            previousNode=temp;
            temp = temp.next;
        }
        return null;
    }

    public T get(int index) {
        Node<T> temp = this.node;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }

    public void delete(int index) {
        Node<T> temp = this.node;
        Node<T> previousNode = this.node;
        if (index == 0) {
            this.node = temp.next;
        }
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                previousNode.next = temp.next;
                size--;
                break;
            }
            previousNode=temp;
            temp = temp.next;
        }
    }
}
