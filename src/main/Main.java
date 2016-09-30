package main;

import java.util.List;

import io.Reader;
import io.exception.ReaderException;

public class Main {

	public static void main(String[] args) {
		
		Reader reader = new Reader("in.txt");
		try{
			List<String> lineas = reader.leerArchivo();
			
			lineas.forEach(System.out::println);
			
			/*for(String linea:lineas){
				System.out.println(linea);
			}*/
			
		}catch(ReaderException e){
			e.printStackTrace();
		}
	}

}
