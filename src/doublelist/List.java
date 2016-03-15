/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelist;

/**
 *
 * @author i3
 */
public class List {

    private Node Head;

    public List() {
        Head = null;

    }

    public void add(int d) {
        Node n = new Node(d);
        if (Head == null) {
            Head = n;
        } else {
            Node aux = Head;
            while (aux.next != null) {
                aux = aux.next;
                aux.next = n;
                n.back = aux;
            }
        }

    }

    public void print() {

        if (Head == null) {
            return;
        }
        Node aux = Head;

        do {
            System.out.print(" " + aux.data);
            aux = aux.next;
        } while (aux != Head);
        System.out.println();

    }

    public void reverseprint() {
        if (Head == null) {
            Node aux = Head;
            while (aux.next != null) {
                aux = aux.next;
            }
            while (aux != null) {
                System.out.println("" + aux.data);

            }
        }
    }

    public void push(int d) {
        Node n = new Node(d);
        if ((Head == null)) {
            Head = n;
        }
        else{
            n.next=Head;
            Head.back=n;
            Head=n;

        }
    }
    public void removefirst(){
        if ( Head == null){
            return;
            
        }
        if (Head.next== Head ){
            Head = null;
            
        }else{
            Head.back.next= Head.next;
            Head.next.back= Head.back;
            Head= Head.next;
        }
    }
    public void removelast (){
        if (Head == null) {
            return;
        }
        Node aux = Head, p = null;
        while (aux.next != null) {
            p = aux;
            aux = aux.next;
            
        }
        if (Head.next == null) {
            Head = null;

        }
        
        
    }
    public void invert (){
        if ( Head == null)return;
        Node aux = Head,Head2 = null;
        while ( Head != null){
            aux= Head;
            Head= Head.next;
            aux.next= Head2;
            Head2= aux;
         }
        Head = Head2;
                
        
        
    }

}
