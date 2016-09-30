package intruccion;

import io.exception.ReaderException;

/* ENUM que representa las distintas intrucciones que puede ejecutar un dron */
public enum Instruccion {
	AVANZAR("A"),
	GIRAR_IZQUIERDA("I"),
	GIRAR_DERECHA("D");
	
	private final String descripcion;
	
	Instruccion(String descripcion){
		this.descripcion = descripcion;
	}
	
	public static Instruccion fromString(String s) throws ReaderException {
		for(Instruccion instruccion : Instruccion.values()){
			if (instruccion.descripcion.equals(s))
				return instruccion;
		}
		throw new ReaderException("Intrucciones no valida", new IllegalArgumentException());
	}
}
