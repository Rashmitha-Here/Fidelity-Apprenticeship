import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*** Node nd=new Node(20);

        nd.next=null;
        System.out.println(nd.data+" "+nd.next);

        Node nd2=new Node(30);
        nd.next=nd2;
        System.out.println(nd.data+""+nd.next);
        System.out.println(nd.data+""+nd2.next.data);
        System.out.println(nd2.data+""+nd2.next);

        LinkedList ll=new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.Display();
        ll.addLast(40);
        ll.Display();
        System.out.println();
        ll.addAt(50,2);
        ll.Display();
        System.out.println();
        System.out.println(ll.getFirst());
        System.out.println();
        System.out.println(ll.getLast());
        System.out.println();
        ll.RemoveFirst();
        ll.Display();
        System.out.println();
        ll.RemoveLast();
        ll.Display(); ***/


        //Assignment1 q1
        Scanner sc=new Scanner(System.in);
        LinkedList l=new LinkedList();

        System.out.println("Enter the size of the Linked list:");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("enter the value"+(i+1)+":");
            int value=sc.nextInt();

            l.insertAtTail(value);
        }

        System.out.println("The linked list is: ");
        l.list();


    }

}