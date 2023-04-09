package Linkedlist;

public class ll {

    private Node head;
    private Node tail;

    private int size;

    public ll(){
        this.size = 0;
    }
    private static class Node{
        private final int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
