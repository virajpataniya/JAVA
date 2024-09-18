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
    
    // Utility method to add a new node at middle of list
    public void add(int idx,int newData) {
        if (idx==0) {
            addFirst(newData);
            return;
        }
        Node newNode = new Node(newData);
        Node temp=head;
        int i=0;
        while (i<idx-1) {
            temp=temp.next;
            i++;
        }

        //i=idx-1;temp -> prev
        newNode.next=temp.next;
        temp.next=newNode;
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

    public int removeFirst(){
        if (size==0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if (size==0) {
            System.out.println("Linkedlist is empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //Prev: i=size-2
        Node prev=head;
        for (int i = 0; i < size-2; i++) {
           prev=prev.next;
        }
        //We are standing at 2nd last index
        int val=prev.next.data;//tail data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public void deleteNthfromEnd(int n){
        //calculate size
        int sz=0;
        Node temp=head;
        while (temp!=null) {
            temp=temp.next;
            sz++;
        }
        if (n==sz) {
            head=head.next;//remove first
            return;
        }

        //sz-n
        int i=1;
        int indexToFind=sz-n;
        Node prev=head;
        while (i<indexToFind) {
            prev=prev.next;
            i++;
        }

        prev.next=prev.next.next;//We point address to new Node ex; From a-b-c to a-c 
        return;
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

    public boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast) {
                return true;
            }
        }
        return false; //cycle not exist
    }

    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;

        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow; //mid node
    }

    private Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while (head1!=null&&head2!=null) {
            if (head1.data<=head2.data) {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            } else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while (head1!=null) {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while (head2!=null) {
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head){
        if (head==null||head.next!=null) {
            return head;
        }

        //find mid
        Node mid=getMid(head);
        //Left & right MS
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);

        //merge
        return merge(newLeft,newRight);

    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 3);
        //print
        ll.print(); //1->2->3->4->5->null
        //ll.reverse(); //5->4->3->2->1->null
        /*ll.removeFirst();
        ll.removeLast();
        ll.print();*/
        //ll.deleteNthfromEnd(3);
        //ll.print(); //1->2->4->5->null

        //System.out.println(ll.size);
        //System.out.println(ll.itrSearch(2));
        //System.out.println(ll.itrSearch(7));

        //System.out.println(ll.recSearch(3));
        /*head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head;*/
        ll.head=ll.mergeSort(ll.head)
        System.out.println();
    }
}
