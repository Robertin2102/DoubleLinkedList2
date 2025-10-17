public class Doublelinkedlist{
    Node head;

    public void add(int value) {
        Node nuevo = new Node(value);
        if (head == null) {
            head = nuevo;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = nuevo;
        nuevo.prev = temp;
    }

    public void print() {
        if (head == null) {
            System.out.println("Lista vacía");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printReverse() {
        if (head == null) {
            System.out.println("Lista vacía");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public void remove(int value) {
        if (head == null) return;
        Node temp = head;
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("No se encontró el valor");
            return;
        }
        if (temp == head) {
            head = temp.next;
            if (head != null) head.prev = null;
        } else {
            if (temp.prev != null) temp.prev.next = temp.next;
            if (temp.next != null) temp.next.prev = temp.prev;
        }
    }
}
