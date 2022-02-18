package academy.mindswap;

import java.util.Iterator;

public class NodeContainer <T> implements Iterable <T> {

    private Node head;
    private int lenght;

    public NodeContainer(){
        this.head = new Node(null);
        this.lenght = 0;
    }

    public int size() {
        return lenght;
    }

    public void add(T data){

        lenght++;
        Node node = this.head;

        while (node.getNext() != null){
            node = node.getNext();
        }

        Node newNode = new Node(data);
        node.setNext(newNode);
    }

    public int indexOf(T data){
        Node node = this.head.getNext();
        int index = 0;

        while (node != null){
            if(node.getData().equals(data)){
                return index;
            }
            index++;
            node = node.getNext();
        }
        return -1;
    }

    public T get(int index){

        if(index > (lenght-1)){
            return null;
        }

        int counter = 0;
        Node node = this.head.getNext();

        while (counter != index){
            counter++;
            node = node.getNext();
        }
        return node.getData();
    }

    public boolean remove(T data){

        Node node = this.head;

        while (node.getNext() != null){
            if (node.getNext().getData() == data){
                node.setNext(node.getNext().getNext());
                lenght--;
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        new Iterator<T>() {

            private Node iterator = head;

            @Override
            public boolean hasNext() {
                return iterator.getNext()!=null;
            }

            @Override
            public T next() {
                iterator = iterator.getNext();
                return iterator.getData();
            }
        };
        return null;
    }



    private class Node {

        private Node next;
        private T data;

        public Node(T data){
            this.data = data;
            next = null;
        }

        public T getData(){
            return data;
        }

        public void setData(T data){
            this.data = data;
        }

        public Node getNext(){
            return next;
        }

        public void setNext(Node next){
            this.next = next;
        }
    }
}
