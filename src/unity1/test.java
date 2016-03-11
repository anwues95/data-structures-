/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1;

/**
 *
 * @author Andres Estrella 
 */
public class test {
    public static void main(String args[]) {
        list l=new list ();
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(25);
        System.out.print(" initial valvues");
        l.print();
        int c = l.count();
        System.out.println("total nodes : "+c);
        
         System.out.println("The first elemet is : " + l.firstElement());
         System.out.print(" the last elemet is " + l.lastElement());
         System.out.println("Duplicating ...");
         l.duplicate();
         System.out.println("values after duplication ");
         l.print();
         System.out.println("duplicating mirror ");
         l.duplicatemirror();
         System.out.println("values after duplication ");
         l.print();
         
         
    }
}
