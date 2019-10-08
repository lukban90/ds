import java.util.LinkedList;
import java.util.AbstractCollection;
import java.util.Stack;

public class Queue {

    private static class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public int peek() {
        return head.data;
    }

    public void add(int data) {
        Node node = new Node(data);
        if (tail != null)
            tail.next = node;
        tail = node;
        if (head == null)
            head = node;
    }

    public int remove() {
        int data = head.data;
        head = head.next;
        if (head == null)
            tail = null;
        return data;
    }

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        LinkedList<Integer> rl = new LinkedList<Integer>();
        Stack<Integer> s = new Stack<Integer>();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(3);
        l.add(4);

        System.out.println(l);

        while (!l.isEmpty()) {
            s.push(l.poll());
        }

        while (!s.empty()) {
            // System.out.println(s.pop());
            rl.add(s.pop());
        }
        System.out.println(rl);
    }
}