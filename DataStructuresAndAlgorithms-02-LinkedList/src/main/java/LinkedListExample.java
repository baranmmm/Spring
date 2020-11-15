import java.util.NoSuchElementException;

public class LinkedListExample {

    public class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    public Node first;
    public Node last;
    public int size;

    public LinkedListExample() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty(){

        return first == null;
    }

    public void addLast(int item){

        var node = new Node(item);
        System.out.println("adding an item : "+ item);
        if(isEmpty()){
            first = last = node;
        }
        else {
            last.next = node;
            last = node;
        }
        size++;

    }
    public void deleteLast(){

        if(isEmpty()) throw new NoSuchElementException();
            System.out.println("deleting an item from the last");
        if(first==last)first=last=null;
        else {
            var previous = first;
        }

    }
}
