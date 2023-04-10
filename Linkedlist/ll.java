package Linkedlist;

public class ll {

    private Node head;
    private Node tail;

    private int size;

    public ll(){
        this.size = 0;
    }

    public void InsertAtFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head =  node;

        if (tail==null){
            tail = head;
        }

        size +=1;

    }

    public void InsertAtLast(int value){
        if (tail==null){
            InsertAtFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void InsertIndex(int value,int index){
        Node node = new Node(value);
        if (index == 0){
            InsertAtFirst(value);
            return;
        }
        if (index == size){
            InsertAtLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node1= new Node(value,temp.next);
        temp.next = node1;

        size++;
    }

    public int deleteLast(){
        if (size<=1){
            deleteFirst();
        }

        Node secondLast = get(size-2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return  value;
    }

    public int deleteIndex(int index){
        if (index==0){
            deleteFirst();
        }
        if (index == size-1){
            deleteLast();
        }

        Node prev = get(index-1);
        int value = prev.next.value;
        prev.next = prev.next.next;
        return value;
    }

    public Node find(int value){
        Node node = head;
        while(node!=null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if (head==null){
            tail = null;
        }
        size--;
        return value;
    }
    public void display(){
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    private static class Node{
        private final int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
