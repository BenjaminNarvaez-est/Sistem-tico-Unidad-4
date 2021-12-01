/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modelos.Empleado;
import modelos.EmpleadoProduccion;

/**
 *
 * @author benja
 */
public class DaoEmpleadoProduccion implements IOperaciones{
    
    ArrayList<String>reserva = new ArrayList();
    
    public void agregarRegistro(){

}
    
    
    
     
    public void agregarRegistro(Object O) {
        EmpleadoProduccion anb = new EmpleadoProduccion();
        Empleado nba = new Empleado();
        
        anb.setNombre("Mario");
        anb.setApellidos("Mercado");
        anb.setId(58963);
        anb.setSalarioBase(5000);
        anb.setHorasExtra(7);
        anb.setBono(1000);
        
        nba.setSalarioBase(anb.getSalarioBase());
        nba.setHorasExtra(anb.getHorasExtra() + anb.getBono()); 
        
        reserva.add(0,"Nombre: "+anb.getNombre());
        reserva.add(1,"Apellidos: "+anb.getApellidos());
        reserva.add(2,"id:"+anb.getId());
        reserva.add(3,"Salario Base: "+ anb.getSalarioBase());
        reserva.add(4,"Horas Extra: "+ anb.getHorasExtra());
        reserva.add(5,"Bono: "+ anb.getBono());
      
        reserva.add(6,"Salario Neto: "+ nba.calcularSalarioBruto());
        reserva.add(7,"Salario Neto: "+ nba.calcularSalarioNeto());
        reserva.add(8,"Seguro: "+ nba.calcularSeguro());      
    }

   
    public void mostrarRegistros() {
        System.out.println(reserva);
       
    }
    
    

    
    
}
