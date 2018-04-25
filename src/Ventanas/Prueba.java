/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import distribuciones.Normal;
import java.util.ArrayList;
import testChiCuadrado.ChiNormal;

/**
 *
 * @author aleex
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Normal normal = new Normal(15,4);
        ChiNormal chinormal = new ChiNormal(10,normal.generarNumeros(20), 15 , 4);
        chinormal.ejecutarTest();
        System.out.println(chinormal.getEsperadasAgrupadas().size());
        System.out.println(chinormal.getObservadasAgrupadas().size());
        System.out.println(chinormal.getIntervalosAgrupados().size());
        
    }
    
}
