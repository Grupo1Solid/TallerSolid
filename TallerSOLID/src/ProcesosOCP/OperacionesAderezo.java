/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcesosOCP;

import Otros.Aderezo;
import Postres_S_OCP.HeladoN;
import Postres_S_OCP.PastelN;
import Postres_S_OCP.Postre;

/**
 *
 * @author dannyleo
 */
public class OperacionesAderezo {
    public static void anadirAderezo(Postre helado,Aderezo aderezo){
        helado.getAderezos().add(aderezo);
    }
    
    public static void quitarAderezo(Postre helado,Aderezo aderezo){
        helado.getAderezos().remove(aderezo);
    }
    
    
}
