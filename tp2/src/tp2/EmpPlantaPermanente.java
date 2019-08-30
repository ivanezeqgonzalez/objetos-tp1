package tp2;

public class EmpPlantaPermanente extends Empleado{
	Integer cantidadDeHijos;
	Integer antiguedad;
	
	@Override
	Float sueldoBruto() {
		Integer asignacionPorHijo = 150;
		Integer asignacionPorConyugue = 150;
		Integer valorPorAntiguedad = 50;
		Float sueldoBruto = sueldoBasico;
		
		sueldoBruto += asignacionPorHijo * cantidadDeHijos;
		if (estadoCivil == "casado") {sueldoBruto += asignacionPorConyugue;}
		sueldoBruto += valorPorAntiguedad * antiguedad;
		
		return sueldoBruto;
	}
	
	@Override
	Float sueldoNeto() {
		Float sueldoBruto = sueldoBruto();
		Float obraSocial = sueldoBruto * 0.10f + 20 * cantidadDeHijos;
		Float aportesJubilatorios = sueldoBruto * 0.15f;
		
		return sueldoBruto - obraSocial - aportesJubilatorios;
	}
}

