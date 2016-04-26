/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublecircularlist;

/**
 *
 * @Andres Estrella
 */
public class List {

    private Node head;

    public List() {
        head = null;

    }

    public void add(int d) {

        Node n = new Node(d);

        if (head == null) {
            head = n;
        } else {
            n.next = head;
            n.back = head.back;
            head.back.next = n;
            head.back = n;
        }

    }

    public void print() {
        if (head == null) {
            return;
        }
        Node aux = head;

        do {
            System.out.print(" " + aux.data);
            aux = aux.next;
        } while (aux != head);
        System.out.println();

    }

    public void reversePrint() {
        if (head == null) {
            return;
        }
        Node aux = head.back;

        do {
            System.out.print(" " + aux.data);
            aux = aux.back;
        } while (aux != head.back);
        System.out.println();
    }

    public void removeFirst() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;

        } else {
            head.back.next = head.next;
            head.next.back = head.back;
            head = head.next;
        }
    }

    public void DuplicateAtend() {
        if (head == null) {
            return;

        }
        Node last = head.back;
        Node aux = head;

        do {
            Node n = new Node(aux.data);
            n.next = head;
            n.back = head.back;
            head.back.next = n;
            head.back = n;
            aux = aux.next;
        } while (aux != last.next);

    }

    public void DuplicateIntercalated() {

        if (head == null) {
            return;
        }
        Node aux = head;

        do {
            Node n = new Node(aux.data);
            n.back = aux;
            n.next = aux.next;
            aux.next = n;
            aux.next.back = n;
            aux = aux.next.next;
        } while (aux != head);

    }
}
