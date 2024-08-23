package DS.LinkedList;

public class LinkedList {
    
    public static class Node {
    int data;
    Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        // 1. Create Node
        Node newNode= new Node(data);
        size++;
        if (head==null) {
            head=tail=newNode;
            return;
        } 
        // 2. Linking to head
        newNode.next=head;
        // 3. Changing newNode to head
        head=newNode;
    }

    public void addLast(int data){
        // 1. Create newNode
        Node newNode = new Node(data);
        size++;
        if (head==null) {
            head=tail=newNode;
            return;
        }
        // 2. Linking tail to newNode
        tail.next=newNode;
        // 3. Changing newNode to tail
        tail=newNode;
    }

    public void print(){
        if (head==null) {
            System.out.println("LL is empty ");
            return;
        }
        Node temp= head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int itrSearch(int key){
        int i=0;
        Node temp=head;
        while (temp!=null) {
            if (temp.data==key) {
                return i;
            }
            temp=temp.next;
            i++;
        }
        System.out.println("Key is not found in LL");
        return -1;
    }

    public int helper(Node head, int key){
        if (head==null) {
            return -1;
        }

        if (head.data==key) {
            return 0;
        }
        
        int idx=helper(head.next, key);

        if (idx==-1) {
            return -1;
        }
        System.out.println(idx+1);
        return idx+1;
    }

    public int recSearch(int key){
        return helper(head, key);
    }

    public void reverse() { //O(n)
        Node prev=null;
        Node curr=tail=head;
        Node next;
         while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
         }
         head=prev;
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        //print
        ll.print(); //1->2->3->4->5->null
        ll.reverse(); //5->4->3->2->1->null
        ll.print();

        System.out.println(ll.size);
        //System.out.println(ll.itrSearch(2));
        //System.out.println(ll.itrSearch(7));

        //System.out.println(ll.recSearch(3));
    }
}
