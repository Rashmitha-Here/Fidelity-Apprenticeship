import java.util.Scanner;

public class Node2 {
    int data;
    Node2 next;

    public Node2(int data){
        this.data=data;
        this.next=null;
    }

}
class LinkedList2 {
    Node2 head;

    public void insertAtHead(int data) {
        Node2 newNode = new Node2(data);
        newNode.next = head;
        head = newNode;
    }

    public void list2() {
        Node2 current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }


        }
    }

    class Program {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            //Insert At Head
            LinkedList2 l2 = new LinkedList2();
            System.out.println("Enter the number of elements:");
            int ele = sc.nextInt();

            for (int i = 0; i < ele; i++) {
                System.out.println("enter the value element" + (i + 1) + ":");
                int value = sc.nextInt();

                l2.insertAtHead(value);
            }
            System.out.println("The linked list is:");
            l2.list2();

    }
}