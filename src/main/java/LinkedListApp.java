public class LinkedListApp {

    LinkedList _linkedList;
    public LinkedListApp() {
        _linkedList = new LinkedList();
    }

    public LinkedList getLinkedList() {
        return _linkedList;
    }

    class LinkedList {
        Node _head;
        Node _current;

        public LinkedList() {
        }

        public void insert(String data)  {
            if (_head == null) {
                _head = new Node(data);
                _current = _head;
            } else {
                Node current = new Node(data);
                _current.setNext(current);
                _current = current;
            }
        }

        public void printAllValues() {
            Node currentNode = _head;
            while (currentNode != null) {
                System.out.println("Linked List Value " + currentNode.getData());
                currentNode = currentNode.getNext();
            }
        }

        class Node {
            String _data;
            Node _next;

            public Node(String data) {
                _data = data;
            }

            public void setNext(Node next) {
                _next = next;
            }

            public Node getNext() {
                return _next;
            }

            public String getData() {
                return _data;
            }
        }
    }

    public static void main(String[] args) {
        LinkedListApp linkedListApp = new LinkedListApp();
        LinkedList linkedList = linkedListApp.getLinkedList();
        linkedList.insert("1");
        linkedList.insert("2");
        linkedList.insert("3");

        linkedList.printAllValues();
    }
}