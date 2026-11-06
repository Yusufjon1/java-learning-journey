package Lesson23;

import java.util.Iterator;
import java.util.Objects;
import java.util.StringJoiner;

public class DoublyLinkedList<E> implements Iterable {


    private Node<E> head;
    private Node<E> tail;
    private int size;

    public boolean add(E element) {
        var l = tail;
        var newNode = new Node<>(element);
        tail = newNode;
        if (l == null) {
            head = newNode;
        } else {
            l.next = newNode;
            newNode.prev = l;
        }
        size++;
        return true;
    }

    public E get(int index) {
        Objects.checkIndex(index, size);
        if (index == 0)
            return head.element;

        Node<E> current = null;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.element;
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
            return current.element;
        }
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private Node<E> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                E element = current.element;
                current = current.next;
                return element;
            }
        };
    }

    @Override
    public String toString() {
        var sj = new StringJoiner(",", "[", "]");
        this.forEach(lang -> sj.add(String.valueOf(lang)));
        return sj.toString();
    }

    private static class Node<E> {
        E element;

        Node<E> next;
        Node<E> prev;

        public Node(E element) {
            this.element = element;
        }

        public Node(E element, Node<E> next, Node<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }


    static void main(String[] args) {
        var dll = new DoublyLinkedList<String>();
        dll.add("java");
        dll.add("python");
        dll.add("scala");
        dll.add("C++");
        dll.add("Go");
        dll.add("C#");
        System.out.println(dll);
        System.out.println(dll.get(1));
    }


}
