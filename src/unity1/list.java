/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1;

/**
 *
 * @author AULA1
 */
public class list {

    private node head;

    public list() {
        head = null;
    }

    public void add(int d) {
        node n = new node(d);
        if (head == null) {
            head = n;
        } else {
            node aux = head;
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = n;

        }
    }

    public void print() {
        node aux = head;
        while (aux != null) {
            System.out.print(" " + aux.data);
            aux = aux.next;
        }
        System.out.println();
    }

    public int count() {
        node aux = head;
        int counter = 0;
        while (aux != null) {
            counter++;
            aux = aux.next;
        }
        return counter;
    }

    public int firstElement() {
        int pe = 5;

        node aux = head;

        while (aux != null) {
            if (pe == aux.data) {
                return pe;
            }
            aux = aux.next;
        }
        return -1;
    }

    public int lastElement() {

        int le = 45;
        node aux = head;

        while (aux != null) {

            if (le == aux.data) {
                return le;
            }
            aux = aux.next;
        }
        return -1;
    }
}
