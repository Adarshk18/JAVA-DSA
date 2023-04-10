package Linkedlist;

public class Main {
    public static void main(String[] args) {
        /* ll list = new ll();
        list.InsertAtFirst(3);
        list.InsertAtFirst(4);
        list.InsertAtFirst(6);
        list.InsertAtFirst(9);
        list.InsertAtFirst(5);

        list.InsertIndex(56,4);
        list.InsertAtLast(78);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.deleteIndex(3));
        list.display();*/


       DLL list =  new DLL();
        list.inertAtFirst(21);
        list.inertAtFirst(13);
        list.inertAtFirst(54);
        list.inertAtFirst(76);
       list.inertAtFirst(23);


       list.display();

        list.insertAtLast(25);
        list.display();

        list.insertAfter(13,32);
        list.display();

    }
}
