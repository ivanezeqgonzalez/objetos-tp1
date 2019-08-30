package tp2;
import java.util.Date;

public class EmpPlantaTemporal extends Empleado{
	Date fechaFinalizacion;
	Float cantidadHorasExtras;
	Integer valorHoraExtra = 50;
	
	@Override
	Float sueldoBruto() {
		return sueldoBasico + cantidadHorasExtras * valorHoraExtra;
	}
	@Override
	Float sueldoNeto() {
		Float sueldoBruto = sueldoBruto();
		Float obraSocial = sueldoBruto * 0.10f;
		Float aportesJubilatorios = sueldoBruto * 0.10f + 5 * cantidadHorasExtras;
		
		if(edad() >= 50) { obraSocial += 25; }
		
		return sueldoBruto - obraSocial - aportesJubilatorios;
				
	}
	
}
