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

    public void removeFirstElement() {
        node aux = head;
        node n = aux;

    }

    public void removelastElement() {
        if (head == null) {
            return;
        }
        node aux = head, p = null;
        while (aux.next != null) {
            p = aux;
            aux = aux.next;
        }
        if (head.next == null) {
            head = null;

        }
    }

    public void duplicate() {
        if (head == null) {
            return;
        }
        node last = head, aux = head;
        while (last.next != null) {
            last = last.next;

        }
        int c = count();
        for (int i = 0; i < c; i++) {
            last.next = new node(aux.data);
            aux = aux.next;
            last = last.next;
        }

    }

    public void duplicatemirror() {

    }

    public void removeDuplicated() {
        node aux = head, p = head;
        for (int i = 0; i < count(); i++) {
            if (i % 2 == 0) {
                p.next = aux.next;
                p = aux;
                aux = aux.next;
            } else {
                aux = aux.next;
            }
        }

    } public void removeRecurrents(){
        node aux = head, p = head, back = head;
        while(aux.next != null){
            p = head;
            while(p != null){
                if(p.data == aux.data){
                    back.next = aux.next;                    
                }
                p = p.next;
            }
        }
        back = aux;
        aux = aux.next;
    }
    

    public void InsertZeros() {
        node aux = head;
        int c = count();
        for (int i = 1; i < c;) {
            node n = new node(0);
            n.next = aux.next;
            aux.next = n;
            aux = n.next;
        }
    }

    public void removeMiddle() {
        node aux = head, p = head;
        int c = count();
        for (int i = 0; i < c / 2; i++) {
            p = aux;
            aux = aux.next;
        }
        p.next = aux.next;

    }

    public int countOdds() {
        node aux = head;
        int impar = 0;
        while (aux.next != null) {
            if (aux.data % 2 == 1) {
                impar++;
            }
            aux = aux.next;
        }
        return impar;
    }
}
