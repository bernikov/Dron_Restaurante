package main;

import java.util.ArrayList;
import java.util.List;

import intruccion.Instruccion;
import io.Reader;
import io.exception.ReaderException;
import io.tranformer.InstruccionTranformer;
import io.tranformer.Tranformer;

public class Main {

	public static void main(String[] args) {
		
		Reader reader = new Reader("in.txt");
		Tranformer<?, String> tranformer = new InstruccionTranformer();

		try{
			List<String> lineas = reader.leerArchivo();
			
			//lineas.forEach(System.out::println);
			for(String linea : lineas) {
				List<Instruccion> transform = (List<Instruccion>) tranformer.transform(linea);
				List<Instruccion> lineaInstrucciones = transform;
				System.out.println(lineaInstrucciones);
			}
			/*for(String linea:lineas){
				System.out.println(linea);
			}*/
			
		}catch(ReaderException e){
			e.printStackTrace();
		}
	}

}
