/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublecircularlist;

import java.util.Random;

/**
 *
 * @author AULA1
 */
public class Test {

    public static void main(String args[]) {

        List dcl = new List();

        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            dcl.add(r.nextInt(100));
        }

        System.out.print("Initial List...");
        dcl.print();
        System.out.println();

        System.out.print("Reverse Print...");
        dcl.reversePrint();
        System.out.println();

        System.out.print("Remove The First Element...");
        dcl.removeFirst();
        dcl.print();
        System.out.println();

        System.out.print("Duplicate List At End...");
        dcl.DuplicateIntercalated();
        dcl.print();

        System.out.println();
        System.out.print("Duplicate Intercalated...");
        dcl.DuplicateIntercalated();
        dcl.print();

    }
}
