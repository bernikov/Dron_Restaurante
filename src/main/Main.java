package main;

import java.util.ArrayList;
import java.util.List;

import intruccion.Instruccion;
import io.Reader;
import io.exception.ReaderException;

public class Main {

	public static void main(String[] args) {
		
		Reader reader = new Reader("in.txt");
		try{
			List<String> lineas = reader.leerArchivo();
			
			//lineas.forEach(System.out::println);
			for(String linea : lineas) {
				
				String[] arrayStringIntrucciones = linea.split("");
				
				List<Instruccion> lineaInstruccion = new ArrayList<Instruccion>();
				
				for(String stringInstrucciones : arrayStringIntrucciones){
					lineaInstruccion.add(Instruccion.fromString(stringInstrucciones));
				}
				
				System.out.println(lineaInstruccion);
			}
			/*for(String linea:lineas){
				System.out.println(linea);
			}*/
			
		}catch(ReaderException e){
			e.printStackTrace();
		}
	}

}
