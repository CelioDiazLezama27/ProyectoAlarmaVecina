/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jframeinicio;

import JFrameAlerta.JFAlerta;
import JFrameAlerta.JFHistorialAlerta;


/**
 *
 * @author WZZRDPC
 */
public class JFrameInicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FrameInicio InicioFrame=new FrameInicio();
       InicioFrame.setVisible(true);
       InicioFrame.pack();
       InicioFrame.setLocationRelativeTo(null);
       
       
       // JFHistorialAlerta histo = new JFHistorialAlerta();
       // JFAlerta alarma = new JFAlerta();
        
       // histo.setVisible(false);
        //alarma.setVisible(true);
    }
    
}
