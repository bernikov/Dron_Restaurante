package io.tranformer;

import java.util.ArrayList;
import java.util.List;

import intruccion.Instruccion;
import io.exception.ReaderException;

//Clase que implementa las transformaciones a intrucciones o apartir de un string
public class InstruccionTranformer implements Tranformer<List<Instruccion>, String> {

	@Override
	public List<Instruccion> transform(String linea) throws ReaderException {
		
		String[] arrayStringIntrucciones = linea.split("");
		
		List<Instruccion> lineaInstruccion = new ArrayList<Instruccion>();
		
		for(String stringInstrucciones : arrayStringIntrucciones){
			lineaInstruccion.add(Instruccion.fromString(stringInstrucciones));
		}
		
		return lineaInstruccion;
	}

}
