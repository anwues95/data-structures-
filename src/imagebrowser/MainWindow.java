/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagebrowser;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Locale;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import static sun.org.mozilla.javascript.internal.ScriptRuntime.add;

/**
 *
 * @author AULA1
 */
public class MainWindow {

    JButton left;
    JButton rigt;
    JButton viewer;
    private  ImageStore Images;

    public MainWindow() {
        Images=new ImageStore();
        setTitle("set of images");
        setSize(200,100);
        launchwidgest();
        launchEvents();
        setVisible(true);
        
       
    }

    private void launchwidgest() {
        left = new JButton("<");
        rigt = new JButton(">");
        viewer = new JButton ();
        add(left ,BorderLayout.WEST);
        add(rigt ,BorderLayout.EAST);
        add(viewer ,BorderLayout.CENTER);
        
        
      

    } 
   private void launchEvents(){
        //when the window is opened-----------
       File folder = new File ("C:\\Users\\AULA1\\Downloads\\icons\\icons");
       for (File file:folder.listFiles()){
           Images.add(file.getAbsolutePath());
       }
       viewer.setIcon(Images.getcurrent());
       //when the user do a click over the left -----
       left.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
             if(Images.goBack()){
                 viewer.setIcon(Images.getcurrent());
                         
             }
           }
       });
       //when somenting...
       rigt.addActionListener( new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
               if(Images.goForward()){
                   viewer.setIcon(Images.getcurrent());
                   
               }
          }
       });
       
    }
    public static void main (String args[]){
        
    }

    private void setTitle(String set_of_images) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
