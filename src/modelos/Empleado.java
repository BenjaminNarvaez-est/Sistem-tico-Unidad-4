package modelos;


/**
 * @author benja
 * @version 1.0
 * @created 30-nov.-2021 16:07:28
 */
public class Empleado {

	protected String apellidos;
	protected double horasExtra;
	protected int id;
	protected String nombre;
	protected double salarioBase;

	public Empleado(){

	}

    public Empleado(String apellidos, double horasExtra, int id, String nombre, double salarioBase) {
        this.apellidos = apellidos;
        this.horasExtra = horasExtra;
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(double horasExtra) {
        this.horasExtra = horasExtra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
       
	public float calcularSalarioBruto(){  
            
             double a=salarioBase+horasExtra;
             float salario= (float)a; 
             return salario;
	              
	}

	public double calcularSalarioNeto(){
            
            double salario;
            salario= salarioBase+horasExtra;
            salario=salario- (salario*7)/100;        
            
            return salario;  
            
	}

	public double calcularSeguro(){
            double seguro;
            seguro=(salarioBase+horasExtra)*7/100;
            return seguro;
	}
        
        
}//end Empleado