class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Add to end
    public void add(int data) {
        Node newNode = new Node(data);
        System.out.println(head);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    public void frontadd(int data) {
        Node newNode = new Node(data);
        System.out.println(head);
        if (head == null) {
            head = newNode;
            return;
        }else{

        }
        Node temp = head;
        head = newNode;
        head.next = temp;

    }


    public void insertAfterGiven(int index, int data) {
        Node newNode = new Node(data);
        Node buff;

       Node temp = head;
        while (temp != null) {
            //System.out.print(temp.data + " -> ");
            if(temp.data == index){
                 System.out.print("Found");
            buff = temp.next;
            temp.next = newNode;
            newNode.next = buff;

           }
            temp = temp.next;
        }
    }
/*

        while (temp != null){
         System.out.print(temp.data + " -> ");

            if(temp.data == index){
                System.out.print("Found");
                //newNode.next = temp.next;
                //newNode = temp;
                 temp = temp.next;
           }

*/
            //temp = temp.next;

            

    

    // Add to front
    public void addFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at position
    public void insertAt(int index, int data) {
        if (index == 0) {
            addFront(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }




    // Delete from front
    public void deleteFront() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // Delete from end
    public void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;
        temp.next = null;
    }

    // Delete at position
    public void deleteAt(int index) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (index == 0) {
            deleteFront();
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++)
            temp = temp.next;

        if (temp.next == null) {
            System.out.println("Index out of bounds");
            return;
        }

        temp.next = temp.next.next;
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(10);
        list.display();
        list.add(20);
        list.display();
        list.add(30);
        list.display();
        list.add(60);
        list.display();
        list.insertAfterGiven(30,50);
        list.display();
        list.frontadd(500);
        list.display();
/*
        list.addFront(5);
        list.display();
        list.insertAt(1, 15);
        list.display();

        list.deleteFront();
        list.display();
        list.deleteEnd();
        list.display();
        list.deleteAt(1);
        list.display();
*/
    }
}
