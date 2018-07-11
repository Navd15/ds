import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class linkedList<E> implements Iterable<E>{

    @Override
    public Iterator<E> iterator() {
        return new IteratorHelper();
    }



    private class IteratorHelper implements Iterator<E> {
    Node index;
    public IteratorHelper() {
    index=head;
    }

    @Override
    public boolean hasNext() {
        return (index!=null);
    }

    @Override
    public E next() {
        if(!hasNext())
            throw new NoSuchElementException();
        E temp=index.data;
        index=index.nextNode;
        return temp;
    }
}
    private class Node {
        Node nextNode;
        E data;

        private Node(E d) {
            data = d;
            nextNode = null;
        }

    }

    private Node head;
    private int length;
    private Node lastNode;

    public linkedList() {
        head = null;
        lastNode = null;
        length = 0;
    }
    //adding

    public void addToFirst(E data) {
        Node node = new Node(data);
        node.nextNode = head;
        head = lastNode = node;
        increaseLength();

    }

    public void addToLast(E data) {
        Node n = new Node(data);

        if (length == 0) {
            head = n;
            lastNode = n;
            increaseLength();

        } else {
            lastNode.nextNode = n;
            lastNode = n;
            increaseLength();
        }

    }
    // removing

    public E removeFirst() {
        if (head != null) {
            Node temp;
            if (head == lastNode && length == 1) {
                temp = head;
                lastNode = head = null;
                length--;
                return temp.data;
            } else {
                temp = head;
                head = head.nextNode;
                length--;
                return temp.data;
            }
        } else {
            return null;
        }

    }

    public E removeLast() {
        if (head != null) {
            if (head == lastNode && length == 1) {
                Node temp;
                temp = head;
                lastNode = head = null;
                length--;
                return temp.data;

            } else {
                Node current = head, previous = null;
                while (current.nextNode != null) {
                    previous = current;
                    current = current.nextNode;
                }
                previous.nextNode = null;
                lastNode = previous;
                length--;
                return current.data;
            }

        } else {
            return null;
        }
    }

    //utils
    public int size() {

        return length;
    }

    private void increaseLength() {

        length++;

    }


}




