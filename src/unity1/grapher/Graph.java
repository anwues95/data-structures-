/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.grapher;

import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author AULA1
 */
public class Graph extends JComponent  {
    private Coordinate head;
    
    public Graph(){
        head = null;
    }

    public void addCordinate(int x, int y){
        Coordinate n  = new Coordinate (x, y);

        if (head==null){
            head = n;
        }else{
            Coordinate aux = head;

            while(aux.next != null){
            aux = aux.next;
            }
            aux.next = n;
            n.back = aux;
        }

    }

    public void paint (Graphics g){

        if (head == null) return;

        if  (head.next == null){
            g.drawOval(head.x, head.y, 1,1);
            return;
        }
        Coordinate p1 = head, p2 = head.next;
        while(p2 != null){

        g.drawLine(p1.x , p1.y, p2.x, p2.y);
        p1 = p2;
        p2 = p2.next;
        }
    }

    public void removeLast(){

        if(head == null) return;

        if(head.next == null){
            head = null;
            return;
        }
        Coordinate aux = head;

        while(aux.next.next != null){
            aux = aux.next;
        }
        aux.next = null;
    }

    void removeFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int count() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int getDrawingWidth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int getDrawingHeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void removeOddPositions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void clearAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void printCoordinate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void horizontalMirror() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void verticalMirror() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
