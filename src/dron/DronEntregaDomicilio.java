package dron;

import java.util.List;

import casilla.Casilla;
import intruccion.Instruccion;

public class DronEntregaDomicilio implements Dron {
	
	private Casilla casillaActual;
	public DronEntregaDomicilio(Casilla casillaActual) {
	}

	@Override
	public void ejecutarIntruccion(List<Instruccion> intrucciones) {
		for(Instruccion intruccion : intrucciones){
			if(intruccion == Instruccion.AVANZAR){
				casillaActual = casillaActual.avanzar();
			}else if(intruccion == Instruccion.GIRAR_IZQUIERDA){
				casillaActual = casillaActual.girarIzquierda();
			}else if(intruccion == Instruccion.GIRAR_DERECHA){
				casillaActual = casillaActual.girarDerecha();
			}
		}
	}

	@Override
	public String darReporteEjecucion() {
		return casillaActual.toString();
	}
	
}
