/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modelos.Empleado;
import modelos.EmpleadoOficina;

/**
 *
 * @author benja
 */
public class DaoEmpleadoOficina implements IOperaciones{
     ArrayList<String>datos = new ArrayList();

  
    public void agregarRegistro(Object O) {
        
        EmpleadoOficina tuc = new EmpleadoOficina();
        Empleado utc = new Empleado();
        
        tuc.setNombre("Alma");
        tuc.setApellidos("Ramos");
        tuc.setId(24691);
        tuc.setSalarioBase(8000);
        tuc.setHorasExtra(4);
        
        utc.setSalarioBase(tuc.getSalarioBase());
        utc.setHorasExtra(tuc.getHorasExtra()); 
        
        datos.add(0,"Nombre: "+tuc.getNombre());
        datos.add(1,"Apellidos: "+tuc.getApellidos());
        datos.add(2,"id:"+tuc.getId());
        datos.add(3,"Salario Base: "+ tuc.getSalarioBase());
        datos.add(4,"Horas Extra: "+ tuc.getHorasExtra());
        
      
        datos.add(5,"Salario Neto: "+ utc.calcularSalarioBruto());
        datos.add(6,"Salario Neto: "+ utc.calcularSalarioNeto());
        datos.add(7,"Seguro: "+ utc.calcularSeguro());        
    }

 
    public void mostrarRegistros() {
        System.out.println(datos);
        
       
    }
    
}
