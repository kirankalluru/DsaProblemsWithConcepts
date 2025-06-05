package LinkedList;

// Node class
class  Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Singly Linked List class
public class SinglyLinkedList {
    Node head;


    // Insert at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //insert after specified Node

    public void insetAfterNode(int data,int key){

        Node curr = head;

        while (curr != null){
            if (curr.data == key){
                break;
            }
            curr = curr.next;
        }

        if (curr == null){
            System.out.println("Specific Node Not Found");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = curr.next;
        curr.next = newNode;


    }


    //inset Before Specified NODE

    public void insetBeforeNode(int data,int key){

        if (head == null){
            System.out.println("Matching Node Not Found");
            return;
        }
        //if head is the key then we need to handle it separately like below----------
        if (head.data == key){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            return;
        }

        Node curr = head;
        Node prev = null;

        while (curr != null && curr.data != key){
            prev = curr;
            curr = curr.next;
        }

        if (curr != null){
            Node NewNode = new Node(data);
            prev.next = NewNode;
            NewNode.next = curr;
        }

    }

    //inset at specific Position

    public void insertAtPosition(int data,int pos){
        if (pos<1){
            return;
        }
        if (pos == 1){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            return;
        }
        Node curr = head;

        //traverse before the specified position
        for (int i = 1; i <pos-1 && curr != null ; i++) {
            curr = curr.next;
        }

        if (curr == null){
            System.out.println("Position is Not Found/Position is not in Range");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = curr.next;
        curr.next = newNode;

    }

    // Delete a node by value
    public void delete(int key) {
        if (head == null) return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    //delete node at specific position

    public void deleteAtPosition(int pos){
        if (head == null){
            return;
        }
        if (pos<1){
            System.out.println("Invalid Position");
            return;
        }
        if (pos == 1){
            head = head.next;
            return;
        }

        Node curr = head;
        for (int i = 1; i < pos-1 && curr != null; i++) {
            curr = curr.next;
        }

        if (curr == null || curr.next == null){
            System.out.println("Invalid Position");
            return;
        }
            curr.next = curr.next.next;
    }

    // Search for a value
    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Display the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        SinglyLinkedList list1 = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.deleteAtPosition(5);
        list.display();
    }
}

