/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.grapher;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author pc619
 */
public class Interface extends JFrame {


    private  Graph graph;

    public Interface (){

        this.setTitle("Graficador");
        this.setSize(600, 400);
        launchWidgets();
        launchEvents();
        this.setVisible(true);

    }

    private void launchWidgets (){

        graph = new Graph();
        add(graph);


    }

    private void launchEvents(){

        //Cierra el sistema al cerrar la ventana.
        this.addWindowListener( new WindowAdapter() {

            public void windowClosing(WindowEvent e){ //Orden para cerrar el sistema cuando se cierre la ventana.
            System.exit(0);
            }

        });


       graph.addMouseMotionListener(new MouseMotionListener() {


            public void mouseDragged(MouseEvent e) {

                graph.addCordinate(e.getX(),e.getY());
                repaint();

            }

            public void mouseMoved(MouseEvent e) {

            }
        });

       addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent e) {



            }

            public void keyPressed(KeyEvent e) {

                if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE){
                    graph.removeLast();
                    repaint();
                }
                if(e.getKeyCode()==KeyEvent.VK_DELETE){
                    graph.removeFirst();
                    repaint();
                }
                if (e.getKeyCode()==KeyEvent.VK_C){
                int total = graph.count();
                System.out.println("---------- CONTEO DE PUNTOS ----------");
                System.out.println(" "+total+" Puntos");
                }

                
               
                 
            }

            public void keyReleased(KeyEvent e) {



            }
        });

    }

    public static void main (String args[]){

        new Interface ();

    }

}
