/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity0;

/**
 *
 * @author AULA1
 */
public class Test {
    public static void main (String[] args){
        testingStacks();
        testingQueves();
        
    }

    public static void main(String[] args) {
        Stack s = new Stack ();
        s.add(10);
        s.add(20);
        s.add(30);
        s.print();
        s.remove();
        s.print();
        for (int i=2; i< 20; i+=2){
            s.add(i);
        }
        s.print();
    
        
    }
   
      
}
