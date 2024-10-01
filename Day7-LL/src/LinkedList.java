public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    LinkedList(){
        head=tail=null;
        size=0;
    }

    public void addFirst(int data){
        Node n=new Node(data);
        n.next=head;
        head=n;
        if(size==0){
            tail=n;
        }
        size++;
    }
    public void addLast(int data){
        Node n=new Node(data);
        if(size==0){
            head=tail=n;
        }
        tail.next=n;
        tail=tail.next;
        size++;
    }
    public void addAt(int data,int pos)
    {
        Node temp = head;
        for(int i=1;i<=pos-1;i++)
        {
            temp=temp.next;
        }
        Node n = new Node(data);
        n.next=temp.next;
        temp.next=n;
        size++;
    }
    public int getFirst()
    {
        return head.data;
    }
    public int getLast()
    {
        return tail.data;
    }
    public void RemoveFirst()
    {
        head=head.next;
        this.size--;
    }
    public void RemoveLast()
    {
        Node temp=head;
        while(temp.next!=tail)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
    public void Display()
    {
        Node tmp = head;
        while(tmp!=null)
        {
            System.out.print(tmp.data+"-> ");
            tmp=tmp.next;
        }
    }


    //Insert node at tail
    public void insertAtTail(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
        }else{
            Node current=head;

            while(current.next!=null){
                current=current.next;
            }

            current.next=newNode;
        }
    }

    public void list(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }

    }
}



