import java.util.Scanner;

public class Node3 {
    int data;
    Node3 next;

    public Node3(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList3 {
    Node3 head;

    public void insertAtHead(int data) {
        Node3 newNode = new Node3(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtposition(int data, int position) {
        Node3 newNode = new Node3(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node3 current = head;
        for (int i = 0; i < position - 1; i++) {

            if (current == null) {
                System.out.println("position out of range:");
                return;
            }
            current = current.next;

        }
        newNode.next = current.next;
        current.next = newNode;

    }
        public void list3 () {
            Node3 current = head;
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
        }
    }
class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //insert at position
        LinkedList3 l3 = new LinkedList3();
        System.out.println("Enter the number of initial elements:");
        int initialElements = sc.nextInt();
        for (int i = 0; i < initialElements; i++) {
            System.out.println("enter the initial element" + (i + 1) + ":");
            int input= sc.nextInt();

            l3.insertAtHead(input);
        }
        System.out.println("Enter the element to insert at a specific position: ");
        int specific= sc.nextInt();

        l3.insertAtposition(initialElements,specific);

        System.out.println("The updated list elemenets are:");
        l3.list3();
    }
}