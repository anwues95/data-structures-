/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABCTREES;

/**
 *
 * @author AULA1
 */
public class Test {

    public static void main(String args[]) {
        Tree t = new Tree();
        int values[] = {8, 4, 16, 2, 6, 12, 20, 1, 10, 14, 13, 15};
        for (int i = 0; i < values.length; i++) {
            t.add(values[i]);
        }
        int v = 13;
        System.out.print("Path to" + v + ":");
        t.printpath(v);

        if (t.isLeaf(v)) {
            System.out.print(" " + v + "is leaf");

            } else {
            System.out.println(" " + v + "Does not a leaf ");
            
            System.out.println("rDraw");
            t.rDraw();

        }
    }
}
