/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABCTREES;

import java.awt.Graphics;
import java.util.Vector;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.WindowConstants;

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
                    aux = aux.right;
                } else {
                    return;
                }
            }
            if (d < p.data) {
                p.left = n;

            } else {
                p.right = n;
            }
        }

    }

    public boolean isLeaf(int d) {

        Node aux = root;
        while (aux != null) {
            if (d > aux.data) {
                aux = aux.right;
            } else if (d < aux.data) {
                aux = aux.left;
            } else {
                if (aux.right == null && aux.left == null) {
                    return true;
                } else {
                    return false;
                }
            }
        }

        return false;

    }

    public void printpath(int d) {
        Vector<Node> path = new Vector< Node>();
        Node aux = root;
        while (aux != null) {
            path.add(aux);
            if (d > aux.data) {
                aux = aux.right;

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

    private void PrintLeaf(Node r) {

        if (r == null) {
            return;
        }

        if (r.left == null && r.right == null) {
            System.out.println("" + r.data);
            return;
        }
        PrintLeaf(r.left);
        PrintLeaf(r.right);

    }

    public void recursivePrint() {
        recursivePrint(root);
        System.out.println();
    }

    private void recursivePrint(Node r) {
        if (r == null) {
            return;
        }
        recursivePrint(r.left);
        System.out.print(" " + r.data);
        recursivePrint(r.right);
    }

    public int recursiveCount() {

        return recursiveCount(root);

    }

    private int recursiveCount(Node r) {
        if (r == null) {
            return 0;
        }
        return recursiveCount(r.left)
                + recursiveCount(r.right) + 1;

    }

    private void inorderPrint() {
        inorderPrint(root);
        System.out.println();
    }

    private void inorderPrint(Node r) {
        if (r == null) {
            return;
        }
        inorderPrint(r.left);
        System.out.print(" " + r.data);
        inorderPrint(r.right);

    }

    public void preorderPrint() {
        inorderPrint(root);
        System.out.println();
    }

    private void preorderPrint(Node r) {
        if (r == null) {
            return;
        }
        inorderPrint(r.left);
        inorderPrint(r.right);

    }

    public void postorderPrint() {

    }

    public void rDraw() {
        JFrame f = new JFrame() {

            public void paint(Graphics g) {
                rDraw(root, 20, 40, g);
            }

        };
        f.setSize(600, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private int rDraw(Node r, int x, int y, Graphics g) {

        if (r == null) {
            return x;
        }
        x = rDraw(r.left, x, y + 40, g);
        g.drawOval(x, y, 30, 30);

        x = rDraw(r.right, x + 30, y + 40, g);
        return x;
    }

    class Info {

        int xRoot, xFinal;

    }

    private Info rDraw(Node r, int x, int y, Graphics g) {
        
        Info rootInfo = new Info();
        rootInfo.xFinal = x;
        if (r == null) {
            return rootInfo;

        }
        Info leftInfo, rightInfo;
        leftInfo = rDraw(r.left, x, y + 40, g);
        x = leftInfo.xFinal;
        g.drawOval(x, y, 30, 30);
        g.drawString(""+ r.data,x+10,y+20 );
        rootInfo = rDraw(r.right, x+10,y+40,g);
        rootInfo.xFinal =rightInfo.xFinal;
        
        if(r.left != null){
            g.drawLine(rootInfo.xRoot+5, y+25, leftInto., y);
            
        }
    }

}
