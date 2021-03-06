package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import io.exception.ReaderException;

/* Va leer las ordenes entrantes */
public class Reader {

	private final String fileName;
	
	public Reader(String fileName){
		this.fileName = fileName;
	}
	
	public List<String> leerArchivo() throws ReaderException{

		try (Stream<String> stream = Files.lines(Paths.get(fileName))){
			List<String> lineas = new ArrayList();
			stream.forEach(lineas::add);
			/* for(String s : strean)
			 * 	 leneas.add(s)*/
			return lineas;
		}catch(IOException ex){
			throw new ReaderException(ex.getMessage(), ex.getCause());
		}
	}
	
	

}
