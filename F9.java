import java.util.ArrayList;
import java.util.Iterator;


//LLD-Parrens 23 , Now Iterator Design Pattren
public class F9{
    public static void main(String a[]){

        ArrayList<Integer> out = new ArrayList<>();
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);

        //Not able to iterate amoung the ll<LinkedList, required the Iterabel
        Iterator res = ll.iterator();
        while(res.hasNext() == true){
            Object val = res.next();
            System.out.println(val.toString());

        }


    }


    static class LinkedList implements Iterable{
        static class Node{
            int data;
            Node next;
        }

        Node head;
        Node tail;
        int size;
    

    void addLast(int data){
        Node node = new Node();
        node.data=data;
        node.next=null;
        if(size ==0){
            this.head=this.tail=node;
        }
        else{
            tail.next=node;
            tail=node;
            
        }
        size++;

    }

    int size(){
        return size;
    }
    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        return new LinkedListIterator(head);
    }

   
    // public static  Iterator<T> iterator() {
    //     // TODO Auto-generated method stub
    //     return new LinkedListIterator();
    // }
    static class LinkedListIterator implements Iterator{

        Node temp;
        LinkedListIterator(Node tmp){
            this.temp=tmp;
        }
        @Override
        public boolean hasNext() {
            if(temp != null) return true;
            else return false;
        }

        @Override
        public Object next() {
            // TODO Auto-generated method stub

            int da = temp.data;  ///we cant cast int to Integer
            if(temp.next != null){
                temp=temp.next;
                return da;
                
            }
            return da;
        }

      
      
    }
   

   
}

}
