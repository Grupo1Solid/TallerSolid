/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres_S_OCP;

import Otros.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class HeladoN extends Postre{
   
    public HeladoN(String sabor, double precioParcial, ArrayList<Aderezo> aderezos) {
        super(sabor, precioParcial, aderezos);
    }
    public HeladoN(String sabor){
        super(sabor);
    }
    
}
