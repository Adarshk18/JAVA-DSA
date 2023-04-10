package Linkedlist;

public class DLL {

    private Node head;

    public void inertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head!=null){
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node node = head;
        Node last = null;
        while (node!=null){
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("print in rev");
        while (last!=null){
            System.out.print(last.val +" -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public void insertAtLast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null){
            node.prev = null;
            head = node;
        }

        while (last.next!=null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        node.next = null;
    }

    public Node find(int val){
        Node node = head;
        while(node!=null){
            if (node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertAfter(int after,int val){
        Node p = find(after);

        if (p==null){
            System.out.println("does not exists");
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node!=null){
            node.next.prev = node;
        }
    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node (int value){
            this.val = value;
        }
        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
