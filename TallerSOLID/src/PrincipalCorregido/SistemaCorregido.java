/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrincipalCorregido;

/**
 *
 * @author Diego
 */
import Postres_S_OCP.*;
import ProcesosOCP.*;
import LecheOCP.*;
import Otros.*;
public class SistemaCorregido{
    
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        
        // Producir Helado
        Postre helado_vainilla = new HeladoN("Vainilla");
        OperacionesAderezo.anadirAderezo(helado_vainilla, Aderezo.CREMA);
        OperacionesAderezo.anadirAderezo(helado_vainilla, Aderezo.FRUTILLA);
        System.out.println(helado_vainilla);
        
        // Producir Pastel
        Postre pastel_chocolate = new PastelN ("Chocolate");
        OperacionesAderezo.quitarAderezo(pastel_chocolate, Aderezo.CREMA);
        OperacionesAderezo.anadirAderezo(pastel_chocolate, Aderezo.FRUTILLA);
        System.out.println(pastel_chocolate);
     
    }
}