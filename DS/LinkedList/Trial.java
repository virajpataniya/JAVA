package DS.LinkedList;
import java.util.LinkedList;

public class Trial {

    public static LinkedList<Integer> reverse(LinkedList<Integer> llist) {
        LinkedList<Integer> revll=new LinkedList<Integer>();
        for (int i = llist.size()-1; i >= 0; i--) {
            // Append the elements in reverse order
            revll.add(llist.get(i));
        }
        //return then reversed LinkedList
        return revll;
    }

    public static void main(String[] args) {
        //create
        LinkedList<Integer> ll=new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //0->1->2
        System.out.println("Elements before reversing "+ ll);

        ll=reverse(ll);

        System.out.println("Elements after reversing "+ ll);


    }
}
