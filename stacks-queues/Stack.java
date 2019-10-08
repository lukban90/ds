import java.util.LinkedList;

public class Stack {
    private static class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        return top.data;
    }

    public void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    public int pop() {
        int data = top.data;
        top = top.next;
        return data;
    }

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        // Stack s = null;
        // Stack<Integer> s = new Stack<Integer>();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        System.out.println("Linked list: " + l);

        // while (l != null) {
        // try {
        // s.push(l.poll());
        // s.peek();
        // } catch (NullPointerException e) {
        // System.out.println(e);
        // }
        // }

        // while (!s.isEmpty()) {
        // System.out.println(s.pop());
        // }
    }
}