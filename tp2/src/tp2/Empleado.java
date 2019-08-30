package tp2;
import java.util.Date;

public abstract class Empleado {
	String nombre;
	String direccion;
	String estadoCivil;
	Date fechaNacimiento;
	Float sueldoBasico;
	
	abstract Float sueldoBruto();	
	abstract Float sueldoNeto();
	
	Integer edad() {
		return 0;
	}
}