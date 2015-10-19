/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neos;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JProgressBar;

/**
 *
 * @author Marcos
 */
public class Progress extends JDialog { 
    JProgressBar progress = new JProgressBar(); 
    
    public Progress() {   
        this.setTitle("Wait...");   
        setModal(false);   
        //JProgressBar progress = new JProgressBar();   
        progress.setIndeterminate(true);   
        progress.setSize(200,20);   
        getContentPane().add(progress);   
        pack();   
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();   
        this.setLocation((tela.width - this.getSize().width) / 2,   
             (tela.height - this.getSize().height) / 2);   
    }   
    
    public Progress(int min, int max) {   
        this.setTitle("Wait...");   
        setModal(false);   
        //JProgressBar progress = new JProgressBar();   
        progress.setMinimum(min);
        progress.setMaximum(max);
        progress.setSize(200,20);   
        getContentPane().add(progress);   
        pack();   
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();   
        this.setLocation((tela.width - this.getSize().width) / 2,   
             (tela.height - this.getSize().height) / 2);   
        
    }
    
    public void setProgress(int i)
    {
        progress.setValue(i);
    }
}  

