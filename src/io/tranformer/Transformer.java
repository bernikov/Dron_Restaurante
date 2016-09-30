package io.tranformer;

import io.exception.ReaderException;

/*
 * T Salida
 * V Entrada
*/
public interface Transformer<T,V> {
	public T transform(V entrada) throws ReaderException;
}
