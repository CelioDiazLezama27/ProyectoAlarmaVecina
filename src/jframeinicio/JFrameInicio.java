/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jframeinicio;

import JFrameBotonAlerta.HisorialAlertas;
import JFrameBotonAlerta.TipoAlarma;

/**
 *
 * @author WZZRDPC
 */
public class JFrameInicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        HisorialAlertas histo = new HisorialAlertas();
        TipoAlarma alarma = new TipoAlarma();
        
        histo.setVisible(true);
        alarma.setVisible(false);
    }
    
}
