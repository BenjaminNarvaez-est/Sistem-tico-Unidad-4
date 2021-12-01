package modelos;


/**
 * @author benja
 * @version 1.0
 * @created 30-nov.-2021 16:07:32
 */
public class EmpleadoProduccion extends Empleado {
    
    private double bono;

    public EmpleadoProduccion() {
    }

    public EmpleadoProduccion(double bono) {
        this.bono = bono;
    }

    public EmpleadoProduccion(double bono, String apellidos, double horasExtra, int id, String nombre, double salarioBase) {
        super(apellidos, horasExtra, id, nombre, salarioBase);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
             
}//end EmpleadoProduccion
	

	
