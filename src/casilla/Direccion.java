package casilla;

/* Enum que representa las direcciones una casilla*/ 
public enum Direccion {
	NORTE("Direccion Norte"),
	SUR("Direccion Sur"),
	ESTE("Direccion ESTE"),
	OESTE("Direccion Oeste");
	
	private final String descripcion;
	Direccion(String descripcion){
		this.descripcion = descripcion;
	}
	
	public String getDescripcion(){
		return descripcion;
	}
}
