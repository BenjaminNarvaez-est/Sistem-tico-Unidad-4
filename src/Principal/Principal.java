/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import dao.DaoEmpleadoOficina;
import dao.DaoEmpleadoProduccion;
import modelos.EmpleadoOficina;
import modelos.EmpleadoProduccion;

/**
 *
 * @author benja
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DaoEmpleadoOficina lugs = new DaoEmpleadoOficina();
        EmpleadoOficina lug = new EmpleadoOficina();
        
        lugs.agregarRegistro(lug);
        lugs.mostrarRegistros();
        
        
        DaoEmpleadoProduccion info = new DaoEmpleadoProduccion();
        EmpleadoProduccion inf = new EmpleadoProduccion();
        
        info.agregarRegistro(inf);
        info.mostrarRegistros();
        

        
        
    }
    
}
