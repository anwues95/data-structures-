/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABCTREES;

import java.util.Vector;

/**
 *
 * @author AULA1
 */
public class Tree {

    private Node root;

    public Tree() {
        root = null;
    }

    public void add(int d) {
        Node n = new Node(d);
        if (root == null) {
            root = n;
        } else {
            Node aux = root, p = null;
            while (aux != null) {
                if (d < aux.data) {
                    p = aux;
                    aux = aux.left;
                } else if (d > aux.data) {
                    p = aux;
                    aux = aux.rigth;
                } else {
                    return;
                }
            }
            if (d < p.data) {
                p.left = n;

            } else {
                p.rigth = n;
            }
        }

    }

    public void printpath(int d) {
        Vector<Node> path = new Vector< Node>();
        Node aux = root;
        while (aux != null) {
            path.add(aux);
            if (d > aux.data) {
                aux = aux.rigth;

            } else if (d < aux.data) {
                aux = aux.left;
            } else {
                for (int i = 0; i < path.size(); i++) {
                    System.out.print(" " + path.elementAt(i).data);
                }
                System.out.println();
                return;
            }
        }
        System.out.println("Does not exist ");

    }

    public boolean isleaf(int d) {
        Node aux = root;
        while (aux != null) {
            if (d > aux.data) {
                aux = aux.rigth;

            } else if (d > aux.data) {
                aux=aux.left;
            }else{
                if (aux.rigth == null && aux.left==null){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }

}