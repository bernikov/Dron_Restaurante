package dron;

import java.util.List;

import intruccion.Instruccion;

public interface Dron {
	
	public void ejecutarIntruccion(List<Instruccion> intrucciones);
	public String darReporteEjecucion();

}
